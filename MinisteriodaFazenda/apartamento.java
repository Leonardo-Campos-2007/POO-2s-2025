public class apartamento {

    private int vagas;
    private boolean possuielevador;
    private Municipio municipio;
    private double areaM2;

    public apartamento(int vagas, boolean possuielevador, Municipio municipio, double areaM2){

        this.vagas = vagas;
        this.possuielevador = possuielevador;
        this.municipio = municipio;
        this.areaM2 = areaM2;
    
}

public int getVagas() {
    return vagas;
}

public void setVagas(int vagas) {
    this.vagas = vagas;
}

public double getAreaM2() {
    return areaM2;
}
public void setAreaM2(double areaM2) {
    this.areaM2 = areaM2;
}

public Municipio getMunicipio() {
    return municipio;
}

public void setMunicipio(Municipio municipio) {
    this.municipio = municipio;
}

public boolean getpossuielevador(boolean possuielevador) {
    return possuielevador;
}

public void setpossuirelevador(){
    this.possuielevador = possuielevador;
}

public double calcularIPTU(){
    return (this.areaM2 * this.municipio.getPrecoM2()) * 1.005;
}






}

