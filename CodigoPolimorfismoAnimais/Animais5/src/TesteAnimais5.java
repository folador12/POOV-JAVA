
public class TesteAnimais5 {

    public static void main(String[] args) {
//        Animal zoo[] = new Animal[6];
//        zoo[0] = new Leao();
//        zoo[1] = new Hipopotamo();
//        zoo[2] = new Tigre();
//        zoo[3] = new Cachorro();
//        zoo[4] = new Gato();
//        zoo[5] = new Lobo();
//
//        for (int cont = 0; cont < zoo.length; cont++) {
//            zoo[cont].andar();
//            zoo[cont].comer();
//            zoo[cont].dormir();
//            zoo[cont].fazerBarulho();
//        }

//        BichoEstimacao be = new Cachorro();
//        be.destruirSapato();
//        be = new Gato();
//        be.destruirSapato();
//
        BichoEstimacao est[] = new BichoEstimacao[2];
        est[0] = new Cachorro();
        est[1] = new Gato();
      
        for (BichoEstimacao b : est) {
            b.brincar();
            b.deitarNoColo();
            b.destruirSapato();
        }
       
    }
}
