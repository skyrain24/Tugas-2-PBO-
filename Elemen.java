package Tugas2;

public class Elemen {

    private String nama;
    public int total;
    
    public Elemen (String nama){   
        this.nama = nama;  //Downcasting (class Elemen akan menjadi referensi bagi subclass nya)
    }    

    public String getnama (){
        return nama;
    }
}

