package poov;

import java.util.ArrayList;

public class Carro {
    private int ano;
    private String modelo;
    private String cor;
    private ArrayList<Roda> rodas;
    private ArrayList<Porta> portas;
    private Motor motor;
    private Chassi chassi;

    public Carro() {
        ano = -1;
        modelo = "Sem modelo";
        cor = "Sem cor";
        rodas = new ArrayList<>();
        portas = new ArrayList<>();
        motor = null;
        chassi = null;
    }

    public Carro(int ano, String modelo, String cor, ArrayList<Roda> rodas, ArrayList<Porta> portas, Motor motor,
            Chassi chassi) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.rodas = rodas;
        this.portas = portas;
        this.motor = motor;
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public ArrayList<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(ArrayList<Roda> rodas) {
        this.rodas = rodas;
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chassi getChassi() {
        return chassi;
    }

    public void setChassi(Chassi chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", modelo=" + modelo + ", cor=" + cor + ", rodas=" + rodas + ", portas=" + portas
                + ", motor=" + motor + ", chassi=" + chassi + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ano;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        result = prime * result + ((rodas == null) ? 0 : rodas.hashCode());
        result = prime * result + ((portas == null) ? 0 : portas.hashCode());
        result = prime * result + ((motor == null) ? 0 : motor.hashCode());
        result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (ano != other.ano)
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        if (rodas == null) {
            if (other.rodas != null)
                return false;
        } else if (!rodas.equals(other.rodas))
            return false;
        if (portas == null) {
            if (other.portas != null)
                return false;
        } else if (!portas.equals(other.portas))
            return false;
        if (motor == null) {
            if (other.motor != null)
                return false;
        } else if (!motor.equals(other.motor))
            return false;
        if (chassi == null) {
            if (other.chassi != null)
                return false;
        } else if (!chassi.equals(other.chassi))
            return false;
        return true;
    }

}
