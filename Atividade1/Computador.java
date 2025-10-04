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



}
