public class casa {

    public Integer vagas;
    public Municipio municipio;
    public double areaM2;

    public casa(Integer vagas, Municipio municipio, double areaM2) {

        this.vagas = vagas;
        this.municipio = municipio;
        this.areaM2 = areaM2;

    }

    

    public double calcularIPTU(){
        return (this.areaM2 * this.municipio.getPrecoM2()) * 1.005;
    }

}
