package Tugas2;

public class Asdos extends Mahasiswa{  //Polimorfisme
    public Asdos(String nama, int Sks, int jamNgasdos){
        super(nama,Sks); //Downcasting (mengambil properti dari kelas induk kelas mahasiswa)
        jamSibuk = jamSibuk + jamNgasdos;
    }
    
    public void mailCheck(){
        System.out.println(getnama() + " adalah seorang asdos dengan jam sibuk " + getjamSibuk());
    }

    public int getjamSibuk(){
        return jamSibuk;
    }

}
