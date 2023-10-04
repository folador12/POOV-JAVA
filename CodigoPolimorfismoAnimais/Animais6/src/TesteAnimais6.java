
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class TesteAnimais6 {

    public static void destruirSapatos(BichoEstimacao bichos[]) {
        for (BichoEstimacao b : bichos) {
            b.destruirSapato();
        }
    }
    
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

        BichoEstimacao est[] = new BichoEstimacao[4];
        est[0] = new Cachorro();
        est[1] = new Gato();
        est[2] = new CachorroRobo();
        est[3] = new Dinossauro();

        for (BichoEstimacao b : est) {
            b.brincar();
            b.deitarNoColo();
            b.destruirSapato();
        }
        
        destruirSapatos(est);

        
        List<Cachorro> cachorros = new ArrayList<>();
        cachorros = new LinkedList<>();
    }
    
}
