package L6_encapsulation;
// Created by 21343015_Siptya Savira Rahmi
public class encapsulationBuah {
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;

    public encapsulationBuah(String namaBuah,String hargaBuah,String warnaBuah){
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }

    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }

    public void setPrice(String hargaBuah){
        this.hargaBuah = hargaBuah;
    }

    public void setColor(String warnaBuah){
        this.warnaBuah = warnaBuah;
    }

    public String getName(){
        return namaBuah;
    }

    public String getprice(){
        return hargaBuah;
    }

    public String getColor(){
        return warnaBuah;
    }
}