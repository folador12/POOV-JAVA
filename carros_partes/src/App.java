import poov.Carro;
import poov.Motor;
import poov.Roda;

public class App {
    public static void main(String[] args) throws Exception {
        // Motor m = new Motor(30, 1, "Fire");
        // ArrayList<Roda> rodas = new ArrayList<>();
        // rodas.add(new Roda(12, "Sem calota", "Roubada"));
        // rodas.add(new Roda(12, "Sem calota", "Roubada"));
        // rodas.add(new Roda(12, "Sem calota", "Roubada"));
        // rodas.add(new Roda(12, "Sem calota", "Roubada"));

        // Carro c1 = new Carro(2023, "Uno", "Rosa", m, rodas);
        // System.out.println(c1);

        // ------------------------------
        // Motor m = new Motor(30, 1, "Fire");
        // ArrayList<Roda> rodas = new ArrayList<>();
        // rodas.add(new Roda(12, "Sem calota", "Roubada"));
        // rodas.add(new Roda(12, "Sem calota", "Roubada"));
        // rodas.add(new Roda(12, "Sem calota", "Roubada"));
        // rodas.add(new Roda(12, "Sem calota", "Roubada"));
        // Carro c2 = new Carro(2023, "Uno", "Rosa");
        // c2.setMotor(m);
        // c2.setRodas(rodas);
        // System.out.println(c2);

        // ------------------------------
        Carro c3 = new Carro(2023, "Uno", "Rosa");
        c3.setMotor(new Motor(30, 1, "Fire"));
        c3.adicinarRoda(new Roda(12, "Sem calota", "Roubada"));
        c3.adicinarRoda(new Roda(12, "Sem calota", "Roubada"));
        c3.adicinarRoda(new Roda(12, "Sem calota", "Roubada"));
        c3.adicinarRoda(new Roda(12, "Sem calota", "Roubada"));
        System.out.println(c3);

        Motor m = c3.getMotor();
        System.out.println(m.getPotencia());
        c3.getMotor().ligar();
        c3 = null;
        Carro c4 = new Carro();
        c4.setMotor(m);
    }
}
