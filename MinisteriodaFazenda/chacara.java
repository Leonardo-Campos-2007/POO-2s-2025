public class chacara {

    public int vagas;
    public Municipio municipio;
    public double areaM2;
    public boolean pocoartesiano;

    public chacara(int vagas, boolean pocoartesiano, Municipio municipio, double areaM2){

        this.vagas = vagas;
        this.pocoartesiano = pocoartesiano;
        this.municipio = municipio;
        this.areaM2 = areaM2;
    
}

public Double calcularIPTU(){
    return (this.areaM2 * this.municipio.getPrecoM2()) * 1.005;
}
    
}
