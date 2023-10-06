import java.util.ArrayList;

public class TesteOnibus {
    public static void main(String[] args) {
        OnibusGNV onibusGNV = new OnibusGNV(50, 100000, 200, 2);

        Hibrido hibrido = new Hibrido(45, 120000, Eletrico.ALTA_VOLTAGEM, 200, 1);

        ArrayList<Onibus> onibusList = new ArrayList<Onibus>();

        onibusList.add(onibusGNV);
        onibusList.add(hibrido);

        for (Onibus onibus : onibusList) {
            System.out.println(onibus.getAceleracao());
        }
    }
}
