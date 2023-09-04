
public class App {
    public static void main(String[] args) throws Exception {
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();
        // l2.mostrar();

        l1.setTensao(110);
        l1.setPotencia(60);
        // l1.setQuebrado(true);

        l1.mostrar();

        System.out.println("Soma das Potencias 1 e 2: " + (l1.getPotencia() + l2.getPotencia()));

    }
}
