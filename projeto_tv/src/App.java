public class App {
    public static void main(String[] args) throws Exception {
        Tv vetor[] = new Tv[2]; // initialize vetor array with size 2
        Tv t1 = new Tv();
        Tv t2 = new Tv(32, 12, 30, "4k");

        vetor[0] = new Tv();
        vetor[1] = new Tv(32, 12, 30, "4k");

        /*
         * for (int i = 0; i < vetor.length; i++) {
         * vetor[i].mostrar();
         * }
         */

        for (Tv vet : vetor) {
            vet.mostrar();
        }

        // t1.mostrar();
        // t2.mostrar();
    }
}
