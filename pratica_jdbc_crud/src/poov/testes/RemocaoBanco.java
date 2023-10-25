package poov.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RemocaoBanco {
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
            // REMOCAO DO BANCO
            Scanner s = new Scanner(System.in);

            System.out.print("Digite o codigo da vacina: ");
            Long codigo = s.nextLong();

            String sql = "SELECT * FROM vacina WHERE codigo = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            pstmt.setLong(1, codigo);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("=================================================");
                System.out.println("Vacina encontrada: " + rs.getString("nome"));
                System.out.println("Descrição: " + rs.getString("descricao"));
                System.out.println("=================================================");

                System.out.println("Deseja remover a vacina? (S/N)");
                String resposta = s.next();

                if (resposta.equalsIgnoreCase("S")) {
                    sql = "DELETE FROM vacina WHERE codigo = ?";
                    pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

                    pstmt.setLong(1, codigo);

                    pstmt.executeUpdate();

                    System.out.println("Vacina removida com sucesso!");
                } else {
                    System.out.println("Vacina não removida!");
                }
            } else {
                System.out.println("Vacina não encontrada!");
            }

            rs.close();

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
