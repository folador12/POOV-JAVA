package vetor;

import java.util.Scanner;
import java.util.Random;

/*
 *8) Vetores

a) Criar um vetor de tamanho 20 de inteiros
b) Preencher os 10 primeiros valores do vetor com números digitados pelo usuário via teclado
c) Preencher os 10 últimos valores do vetor com números aleatórios entre 1 e 100
d) Mostrar o vetor inteiro na tela
e) Mostrar o vetor de trás para frente na tela
f) Calcular e mostrar a média dos valores do vetor
g) Encontrar e mostrar o maior valor e o menor valor do vetor 
h) Mostrar os valores das posições pares do vetor
i) Mostrar os valores das posições ímpares do vetor
j) Mostrar os valores pares do vetor
k) Mostrar os valores ímpares do vetor
l)Verificar se há elementos repetidos no vetor e exibir uma mensagem em caso afirmativo
m) Solicitar um valor ao usuário e verificar se esse valor existe no vetor. Se existir exibir a posição em que ele está, senão exibir uma mensagem de valor não encontrado 
n) Verificar se o vetor está em ordem crescente, ou seja, se a[0] <= a[1] <= a[2] <= ... para todos elementos do
vetor
 */
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random gerador = new Random();

        int numeros[] = new int[20];
        double media = 0;
        int max = 0, min = 0, cont = 0, vlq = 0, index = 0;

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                numeros[i] = s.nextInt();
            } else {
                numeros[i] = gerador.nextInt(101);
            }
        }

        System.out.println("Vetor em ordem:");
        for (int valor : numeros) {
            System.out.print(valor + " ");
        }

        System.out.println(" ");
        System.out.println("Vetor Inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println(" ");
        for (int i = 0; i < numeros.length; i++) {
            media += numeros[i];

            if (numeros[i] > max) {
                max = numeros[i];
            }

            if (min == 0) {
                min = numeros[i];
            }

            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        media = media / numeros.length;
        System.out.println("Media: " + media);
        System.out.println("Maior: " + max);
        System.out.println("Menor: " + min);

        System.out.print("Posições Pares: ");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println(" ");
        System.out.print("Posições Impares: ");
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println(" ");
        System.out.print("Numeros Pares: ");
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println(" ");
        System.out.print("Numeros Impares: ");
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (numeros[i] == numeros[j]) {
                    cont = 1;
                }
            }
        }
        System.out.println(" ");
        if (cont == 1) {
            System.out.println("Existe um numero repetido");
        }

        System.out.print("Insira um Numero Qualquer: ");
        vlq = s.nextInt();
        cont = 0;
        for (int i = 0; i < 20; i++) {
            if (numeros[i] == vlq) {
                cont = 1;
                index = i;
            }
        }
        if (cont == 1) {
            System.out.println("O numero está na posição " + index);
        } else {
            System.out.println("Valor não encontrado ");
        }

        cont = 0;
        for (int i = 0; i < 20; i++) {
            if (i != 19) {
                if (numeros[i] > numeros[i + 1]) {
                    cont = 1;
                }
            }
        }
        if (cont == 1) {
            System.out.println("O vetor não está em ordem");
        } else {
            System.out.println("Vetor em ordem");
        }
        s.close();
    }
}
