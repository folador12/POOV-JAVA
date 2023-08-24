package palindromo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String palavra = s.nextLine();
        palavra = palavra.replace(" ", "");
        StringBuilder inverso = new StringBuilder(palavra);

        inverso.reverse();

        if (palavra.equalsIgnoreCase(inverso.toString())) {
            System.out.println("É um palindromo: " + inverso);
        } else {
            System.out.println(" Não é um palindromo: " + inverso);
        }
        s.close();
    }
}
