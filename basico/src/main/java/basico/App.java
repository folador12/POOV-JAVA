package basico;

import java.util.Scanner;
import java.math.BigInteger;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n, resposta = BigInteger.ONE;
        // long n, resposta = 1L;

        System.out.print("Digite um numero: ");
        n = new BigInteger(s.nextLine());
        s.close();

        for (BigInteger i = BigInteger.TWO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            resposta = resposta.multiply(i);
        }

        System.out.println("O fatorial de " + n + " é " + resposta);
    }
}
