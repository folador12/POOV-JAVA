package poov.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import poov.modelo.Situacao;
import poov.modelo.Vacina;

public class Update {

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

            // a) Faça com que o programa solicite um código de uma vacina via teclado
            Scanner s = new Scanner(System.in);
            System.out.print("Digite o codigo da vacina a alterar: ");
            long codigo = Long.parseLong(s.nextLine());

            // b) Busque essa vacina no banco, coloque-a em um objeto Vacina e mostre-a na
            // tela caso
            // ela exista. Caso não exista informe ao usuário.
            String sqlSelecao = "SELECT * FROM VACINA WHERE codigo = ? AND situacao = 'ATIVO';";
            PreparedStatement pstmtSel = conexao.prepareStatement(sqlSelecao);
            pstmtSel.setLong(1, codigo);
            ResultSet rs = pstmtSel.executeQuery();
            if (rs.next()) {
                Vacina vacina = new Vacina(rs.getLong(1), rs.getString(2), rs.getString(3),
                        rs.getString(4).equals("ATIVO") ? Situacao.ATIVO : Situacao.INATIVO);
                System.out.println(vacina);

                // c) Pergunte se o usuário deseja alterar essa vacina
                System.out.print("Deseja realmente alterar essa vacina? (S/N): ");
                String opcao = s.nextLine();

                // d) Se sim, enquanto o usuário desejar, pergunte ao usuário qual parte da
                // vacina ele
                // deseja alterar
                if (opcao.equalsIgnoreCase("S")) {

                    // e) Leia o novo valor da parte escolhida e altere o objeto Vacina com esse
                    // novo valor
                    opcao = "1";
                    do {
                        System.out.println("1 - Nome");
                        System.out.println("2 - Descricao");
                        System.out.println("3 - Situacao");
                        System.out.println("4 - Terminar");
                        System.out.print("Opcao: ");
                        opcao = s.nextLine();
                        switch (opcao) {
                            case "1":
                                System.out.print("Nome: ");
                                vacina.setNome(s.nextLine());
                                break;
                            case "2":
                                System.out.print("Descricao: ");
                                vacina.setDescricao(s.nextLine());
                                break;
                            case "3":
                                vacina.setSituacao(Situacao.INATIVO);
                                System.out.println("Situacao alterada");
                                break;
                        }
                    } while (!opcao.equals("4"));

                    // f) Atualize o banco de dados usando os novos dados desse objeto Vacina (o
                    // codigo não muda!)
                    String sqlUpdate = "UPDATE vacina SET nome = ?, descricao = ?, situacao = ? WHERE codigo = ?;";
                    PreparedStatement pstmtUpd = conexao.prepareStatement(sqlUpdate);
                    pstmtUpd.setString(1, vacina.getNome());
                    pstmtUpd.setString(2, vacina.getDescricao());
                    pstmtUpd.setString(3, vacina.getSituacao().toString());
                    pstmtUpd.setLong(4, codigo);

                    int resultado = pstmtUpd.executeUpdate();
                    if (resultado == 1) {
                        System.out.println("Alteracao da vacina executada com sucesso");
                    } else {
                        System.out.println("Erro alterando a vacina com codigo: " + codigo);
                    }

                    // g) feche os objetos usados
                    pstmtUpd.close();
                }
                rs.close();
                pstmtSel.close();
                s.close();
            } else {
                System.out.println("Nao foi encontrada uma vacina com o codigo: " + codigo);
            }

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
