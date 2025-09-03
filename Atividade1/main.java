public class main {

    public static void main(String[] args) {
        
        Programa Skyrim = new Programa(8, 50, 1000);
        Programa COD_WAR_ZONE = new Programa(8, 5000, 1000);
        Programa GTA_VI = new Programa(64, 400, 1000);
        Computador computador = new Computador(32, 1000, 5, 10000f);

        public void executarPrograma(Programa p){
            if(computador.getmemoriaRam() >= p.getMemoriaRamAlocada() && computador.getSDD() >= p.getSSDocupado()){
                System.out.println("Programa execultado com sucesso");
            }
            if(computador.getmemoriaRam() < getMemoriaRamAlocada()){
                System.out.println("Memoria RAM insuficiente para execultar o proframa");
            }
            if (computador.getSDD() < getSSDocupado()) {

                System.out.println("Espaço em disco insuficiente para execitar o programa");
                
            }

        }
    }

}
