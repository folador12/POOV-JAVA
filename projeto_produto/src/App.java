import java.math.BigDecimal;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto(12, "Batata", "Uma Batata", new BigDecimal("30.00"), LocalDate.now(), LocalDate.now(),
                1, "Omo", 5, 14);
        Produto p2 = new Produto();

        p1.mostrar();
        System.out.println("-------------------------------------------------");
        p2 = p2.obterProduto();
        System.out.println("-------------------------------------------------");
        p2.mostrar();
    }
}
