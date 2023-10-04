/**
 *
 * @author Rafael Godoi Orbolato <rafael.orbolato@gmail.com>
 */
public class Dinossauro implements BichoEstimacao {

    @Override
    public void brincar() {
        System.out.println("Dinossauro brincou");
    }

    @Override
    public void destruirSapato() {
        System.out.println("Dinossauro destruiu o sapato");
    }

    @Override
    public void deitarNoColo() {
        System.out.println("Dinossauro deitou no colo");
    }
    
}
