package Exemplo2VariosMetodosExcecao;

public class Principal {

    public static void metodo1() {
        System.out.println("Dentro do método 1");
        metodo2();
    }

    public static void metodo2() {
        System.out.println("Dentro do método 2");
        metodo3();
    }

    public static void metodo3() {
        System.out.println("Dentro do método 3");
        int x = 10, y = 0;
        int r = x / y;
    }

    public static void main(String[] args) {
        System.out.println("Inicio do programa principal");
        metodo1();
        System.out.println("Final do programa principal");
    }

    public void metodo() {
        System.out.println("Dentro do método");
    }
}
