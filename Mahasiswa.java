package Tugas2;

public class Mahasiswa extends Elemen{ //Polimorfisme
    public int jamSibuk;

    public Mahasiswa (String nama, int Sks){
        super(nama);
        jamSibuk = Sks * 3;
    }

    public void mailCheck(){
        System.out.println(getnama() + " adalah seorang mahasiswa dengan jam sibuk " + getjamSibuk());
    }

    public int getjamSibuk(){
        return jamSibuk;
    }  
      
}
