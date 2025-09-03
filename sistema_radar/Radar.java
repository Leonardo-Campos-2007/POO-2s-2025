public class Radar {
    public Integer limitevelocidade;
    public String modelo;
    public String localizacao;

    public Radar(String modelo, int limite, String localizacao){

        this.modelo = modelo;
        this.limitevelocidade = limite;
        this.localizacao = localizacao;


    }

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada) {

        System.out.println("Limite de velocidade: " + this.limitevelocidade);
        

        System.out.println("Velocidade Avaliada: " + velocidadeAvaliada);
        

        System.out.println("Placa: " + placa);
       

    }

    public void avaliarVelocidade(Carro c) {
        if (c.getVelocidade() > this.limitevelocidade) {
            emitirNotificacao(c.placa, c.getVelocidade());
            System.out.println("Voce utrapassou o limite de velocidade");
            if(c.getVelocidade() > 80){
                System.out.println("Voce pagara uma multa de 120.00 reais");
            }
        }
        else{
            System.out.println("Esta dentro dos limites ");
        }
    }

}
