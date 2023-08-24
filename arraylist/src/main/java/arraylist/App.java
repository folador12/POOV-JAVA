package arraylist;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/* 
a) Criar um ArrayList de tamanho 20 de inteiros
b) Preencher os 10 primeiros valores do ArrayList com números digitados pelo usuário via teclado
c) Preencher os 10 últimos valores do ArrayList com números aleatórios entre 1 e 100
d) Mostrar o ArrayList inteiro na tela
e) Mostrar o ArrayList de trás para frente na tela
f) Calcular e mostrar a média dos valores do ArrayList
g) Encontrar e mostrar o maior valor e o menor valor do ArrayList 
h) Mostrar os valores das posições pares do ArrayList
i) Mostrar os valores das posições ímpares do ArrayList
j) Mostrar os valores pares do ArrayList
k) Mostrar os valores ímpares do ArrayList
l)Verificar se há elementos repetidos no ArrayList e exibir uma mensagem em caso afirmativo
m) Solicitar um valor ao usuário e verificar se esse valor existe no ArrayList. Se existir exibir a posição em que ele está, senão exibir uma mensagem de valor não encontrado 
n) Verificar se o ArrayList está em ordem crescente, ou seja, se a[0] <= a[1] <= a[2] <= ... para todos elementos do
ArrayList
 */

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random gerador = new Random();
        double media = 0;
        int maior = 0, menor = 101, valorBusca;
        boolean duplica = false, ordenado = true;
        // a)
        ArrayList<Integer> numeros = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            // b)
            if (i < 10) {
                numeros.add(s.nextInt());
            }
            // c)
            else {
                numeros.add(gerador.nextInt(101));
            }
        }
        // d)
        System.out.print(numeros);

        System.out.println(" ");
        // e)
        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.print(numeros.get(i) + " ");
        }
        // f)
        System.out.println(" ");
        for (int i = 0; i < numeros.size(); i++) {
            media += numeros.get(i);
        }

        media = media / numeros.size();
        System.out.println("A media é: " + media);
        // g)
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
            }

            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        System.out.println("Maior Elemento: " + maior);
        System.out.println("Menor Elemento: " + menor);

        // h)
        System.out.print("Posições Pares: ");
        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(numeros.get(i) + " ");
            }
        }

        System.out.println(" ");

        // i)
        System.out.print("Posições Impares: ");
        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 != 0) {
                System.out.print(numeros.get(i) + " ");
            }
        }

        System.out.println(" ");
        // j)
        System.out.print("Valores Pares: ");
        for (int valor : numeros) {
            if (valor % 2 == 0) {
                System.out.print(valor + " ");
            }
        }

        System.out.println(" ");
        // k)
        System.out.print("Valores Impares: ");
        for (int valor : numeros) {
            if (valor % 2 != 0) {
                System.out.print(valor + " ");
            }
        }

        System.out.println(" ");

        // l)
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    duplica = true;

                    if (duplica) {
                        j = numeros.size();
                    }
                }
            }
            if (duplica) {
                i = numeros.size();
            }
        }

        if (duplica) {
            System.out.println("O ArrayList possui elementos repetidos.");
        } else {
            System.out.println("O ArrayList não possui elementos repetidos.");
        }

        // m)
        System.out.println("Informe um valor para busca: ");
        valorBusca = s.nextInt();

        if (numeros.contains(valorBusca)) {
            System.out.println("Valor encontrado na posição " + numeros.indexOf(valorBusca));
        } else {
            System.out.println("Valor não encontrado.");
        }

        // n)
        for (int i = 0; i < numeros.size() - 1; i++) {
            if (numeros.get(i) > numeros.get(i + 1)) {
                ordenado = false;
                if (ordenado) {
                    i = numeros.size();
                }
            }
        }

        if (ordenado) {
            System.out.println("O ArrayList está em ordem crescente.");
        } else {
            System.out.println("O ArrayList não está em ordem crescente.");
        }

        s.close();

    }
}
