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
        if (c.velocidade > this.limitevelocidade) {
            emitirNotificacao(c.placa, c.velocidade);
            System.out.println("Voce utrapassou o limite de velocidade");
            if(c.velocidade > 80){
                System.out.println("Voce pagara uma multa de 120.00 reais");
            }
        }
        else{
            System.out.println("Esta dentro dos limites");
        }
    }

}
