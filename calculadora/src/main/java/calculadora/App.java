package calculadora;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        BigDecimal n1 = new BigDecimal("1.03"), n2 = new BigDecimal("0.42"), result = n1.subtract(n2);
        Double m = 1.03 - 0.42;

        System.out.println("Valor em BigDecimal " + result);
        System.out.println("Valor em Double " + m);
    }
}
