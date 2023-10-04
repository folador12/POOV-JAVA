
public class TesteAnimais2 {

    public static void main(String[] args) {
        Animal zoo[] = new Animal[6];
        zoo[0] = new Leao();
        zoo[1] = new Hipopotamo();
        zoo[2] = new Tigre();
        zoo[3] = new Cachorro();
        zoo[4] = new Gato();
        zoo[5] = new Lobo();
        
        for (int cont = 0; cont < zoo.length; cont++) {
            zoo[cont].andar();
            zoo[cont].comer();
            zoo[cont].dormir();
            zoo[cont].fazerBarulho();
        }
          
        //ERRO
//      Animal a = new Animal();
//        a.andar();
        
    }

}
