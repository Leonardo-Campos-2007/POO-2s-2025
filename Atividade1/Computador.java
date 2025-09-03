public class Computador {
    private Integer memoriaRam; 
    private Integer SSD;
    private Integer nucleos;
    private Float operacoesporsegundo;

    public Computador(Integer memoriaRam, Integer SDD, Integer nucleos, Float operacoesporsegundo){
        this.memoriaRam = memoriaRam;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesporsegundo = operacoesporsegundo;

    }

    public Integer getmemoriaRam(){
        return memoriaRam;

    }
    public void setmemoriaRam(Integer memoriaRam){
        this.memoriaRam = memoriaRam;
    }



    public Integer getSDD(){
        return SSD;

    }
    public void setSSD(Integer SSD){
        this.SSD = SSD;
    }



    public Integer getnucleos(){
        return nucleos;

    }
    public void setnucleos(Integer nucleos){
        this.nucleos = nucleos;
    }



    public Float getoperacoesporsegundo(){
        return operacoesporsegundo;

    }
    public void setoperacoesporsegundo(Float operacoesporsegundo){
        this.operacoesporsegundo = operacoesporsegundo;
    }




    
}
