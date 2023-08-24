
public class App {
    public static void main(String[] args) throws Exception {
        Lampada l1 = new Lampada(220, 80, true);
        Lampada l2 = new Lampada(110, 60);
        Lampada l3 = new Lampada();

        l1.mostrar();
        l2.mostrar();
        l3.mostrar();

    }
}
