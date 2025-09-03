public class main {

    public static void main(String[] args) {
        
        Programa Skyrim = new Programa(8, 50, 1000);
        Programa COD_WAR_ZONE = new Programa(8, 5000, 1000);
        Programa GTA_VI = new Programa(64, 400, 1000);

        Computador computador = new Computador(32, 400, 5, 10000f);

       computador.executarPrograma(Skyrim);
       //computador.executarPrograma(COD_WAR_ZONE);
       //computador.executarPrograma(GTA_VI);
       
       

       
    }

}
