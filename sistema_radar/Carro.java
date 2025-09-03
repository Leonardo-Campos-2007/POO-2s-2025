public class Carro {
    public Integer ano;
    public String modelo;
    private String placa;
    private Integer velocidade;

    public Carro(String placa, Integer velocidade, Integer ano, String modelo) {
        this.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;
    }

    public Integer getVelocidade() {
        return this.velocidade;
    }

    public void setvelocidade(Integer velocidade) {
        if(velocidade != null && velocidade > 0)
        this.velocidade = velocidade;
    }

    public Integer getplaca(Integer placa) {
        this.placa = placa;
    }

    public void acelerar() {

        this.velocidade += 10;

    }

    public void frear() {

        if (this.velocidade > 0) {
            this.velocidade -= 10;
        }

    }
}
