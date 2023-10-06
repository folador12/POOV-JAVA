import iluminacao.Lampada;
import iluminacao.LampadaColorida;

public class App {
    public static void main() throws Exception {
        Lampada l1 = new Lampada();
        LampadaColorida lc = new LampadaColorida();
        // l2.mostrar();

        l1.setTensao(110);
        l1.setPotencia(60);
        // l1.setQuebrado(true);

        lc.setCor("Azul");

        l1.mostrar();
        lc.mostrar();

        System.out.println("Soma das Potencias 1 e 2: " + (l1.getPotencia() + lc.getPotencia()));

    }
}
