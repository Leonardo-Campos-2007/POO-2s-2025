public class Computador {
    private Integer memoriaRam;
    private int SSD;
    private Integer nucleos;
    private Float operacoesporsegundo;

    public Computador(Integer memoriaRam, int SSD, Integer nucleos, Float operacoesporsegundo) {
        this.memoriaRam = memoriaRam;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesporsegundo = operacoesporsegundo;

    }

    public Integer getmemoriaRam() {
        return memoriaRam;

    }

    public void setmemoriaRam(Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getSDD() {
        return SSD;

    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public Integer getnucleos() {
        return nucleos;

    }

    public void setnucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Float getoperacoesporsegundo() {
        return operacoesporsegundo;

    }

    public void setoperacoesporsegundo(Float operacoesporsegundo) {
        this.operacoesporsegundo = operacoesporsegundo;
    }

    public void executarPrograma(Programa p) {

        if (getmemoriaRam() >= p.getMemoriaRamAlocada() && getSDD() >= p.getSSDocupado()) {
            System.out.println("Programa execultado com sucesso");

            float tempoExecucao = p.getQuantidadeOperacoes() / getoperacoesporsegundo() * getnucleos();
            System.out.println("Tempo de execução: " + tempoExecucao + " segundos\n");

        } else {

            if (getmemoriaRam() < p.getMemoriaRamAlocada()) {
                System.out.println("Memoria RAM insuficiente para execultar o programa");
            }
            if (getSDD() < p.getSSDocupado()) {

                System.out.println("Espaço em disco insuficiente para executar o programa");

            }

        }
    }

}
