package poov.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import poov.modelo.Vacina;

public class EscritaBanco {
    public static void main(String[] args) {
        String caminho = "jdbc:postgresql";
        String host = "localhost";
        String porta = "5432";
        String bd = "POOV";
        String login = "postgres";
        String senha = "lockspick12";
        String url = caminho + "://" + host + ":" + porta + "/" + bd;
        String classeDriver = "org.postgresql.Driver";
        Connection conexao = null;

        try {
            System.out.println("Conectando com o banco de dados.");
            Class.forName(classeDriver);
            conexao = DriverManager.getConnection(url, login, senha);
            System.out.println("Conexão com o banco de dados estabelecida.");
            // ESCRITA NO BANCO
            Scanner s = new Scanner(System.in);

            Vacina v = new Vacina();

            System.out.print("Digite o nome da vacina: ");
            v.setNome(s.nextLine());
            System.out.print("Digite a descrição da vacina: ");
            v.setDescricao(s.nextLine());

            String sql = "INSERT INTO vacina (nome, descricao) VALUES (?, ?)";
            PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, v.getNome());
            pstmt.setString(2, v.getDescricao());

            if (pstmt.executeUpdate() == 1) {
                System.out.println("Vacina inserida com sucesso!");
                ResultSet rs = pstmt.getGeneratedKeys();

                while (rs.next()) {
                    v.setCodigo(rs.getLong(1));
                }
                rs.close();
            } else {
                System.out.println("Erro ao inserir vacina!");
            }

            pstmt.close();
            s.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o driver JDBC.");
        } catch (SQLException ex) {
            System.out.println("Erro no acesso ao banco de dados.");
            SQLException e = ex;
            while (e != null) {
                System.out.println("SQL State: " + e.getSQLState());
                System.out.println("Error Code: " + e.getErrorCode());
                System.out.println("Mensagem: " + e.getMessage());
                Throwable t = e.getCause();
                while (t != null) {
                    System.out.println("Causa: " + t);
                    t = t.getCause();
                }
                e = e.getNextException();
            }
        } finally {
            if (conexao != null) {
                System.out.println("Terminando a conexão com o banco de dados.");
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    System.out.println("Erro fechando a conexão com o banco de dados.");
                }
                System.out.println("Conexão com o banco de dados terminada.");
            }
        }

    }
}
