package sistema_radar;

public class Carro {
    public Integer ano;
    public String modelo;
    public String placa;
    public Integer velocidade;

    public void acelerar() {

        this.velocidade += 5;
        
    }

    public void frear() {

        this.velocidade -= 5;
        if (this.velocidade > 0) {
            this.velocidade -= 5;
        }

    }
}
