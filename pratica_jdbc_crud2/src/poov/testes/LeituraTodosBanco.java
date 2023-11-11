package poov.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LeituraTodosBanco {
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
            // LEITURA DO BANCO
            Scanner s = new Scanner(System.in);

            String sql = "SELECT * FROM vacina";
            PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("=================================================");
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Descrição: " + rs.getString("descricao"));
                System.out.println("=================================================");
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
