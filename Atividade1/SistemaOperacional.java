public class SistemaOperacional {

    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Boolean executarProgama(Programa p, Computador c) {

        if (c.getmemoriaRam() < p.getMemoriaRamAlocada()) {
            System.out.println("Memoria RAM insuficiente para execultar o programa");
            return false;
        }
        if (c.getSDD() < p.getSSDocupado()) {

            System.out.println("Espaço em disco insuficiente para executar o programa");
            return false;

        }

        System.out.println("Programa execultado com sucesso");

        float tempoExecucao = p.getQuantidadeOperacoes() / c.getoperacoesporsegundo() * c.getnucleos();
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos\n");
        return true;

    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

}
