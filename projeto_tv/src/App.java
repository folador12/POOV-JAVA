public class App {
    public static void main(String[] args) throws Exception {
        Tv t1 = new Tv();
        Tv t2 = new Tv(32, 12, 30, true, "4k", true);

        t1.mostrar();
        t2.mostrar();
    }
}
