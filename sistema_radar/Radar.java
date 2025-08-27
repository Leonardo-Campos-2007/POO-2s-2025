package sistema_radar;

public class Radar {
    public Integer limitevelocidade;
    public String modelo;
    public String localizacao;

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada) {

        System.out.println("Limite de velocidade: " + this.limitevelocidade);

        System.out.println("Velocidade Avaliada:" + velocidadeAvaliada);

        System.out.println("Placa: " + placa);
    }

    public void avaliarVelocidade(Carro c) {
        if (velocidade > this.limitevelocidade) {
            System.out.println("Voce utrapassou o limite de velocidade");
        }
    }

}
