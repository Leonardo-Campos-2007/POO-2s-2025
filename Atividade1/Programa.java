public class Programa {

private Integer memoriaRamAlocada;
private Integer SSDocupado;
private Integer quantidadeOperacoes;

public Programa(Integer memoriaRamAlocada, Integer SSDocupado, Integer quantidadeOperacoes) {

    this.memoriaRamAlocada = memoriaRamAlocada;
    this.SSDocupado = SSDocupado;
    this.quantidadeOperacoes = quantidadeOperacoes;

}

public Integer getMemoriaRamAlocada() {
    return memoriaRamAlocada;
}

public void setMemoriaRamAlocada(Integer memoriaRamAlocada) {
    this.memoriaRamAlocada = memoriaRamAlocada;
}

public Integer getQuantidadeOperacoes() {
    return quantidadeOperacoes;
}

public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
    this.quantidadeOperacoes = quantidadeOperacoes;
}


public Integer getSSDocupado() {
    return SSDocupado;
}

public void setSSDocupado(Integer sSDocupado) {
    SSDocupado = sSDocupado;
}


  
}
