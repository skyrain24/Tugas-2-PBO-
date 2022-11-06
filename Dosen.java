package Tugas2;

public class Dosen extends Elemen {  //Polimorfisme
    private int jamSibuk;

    public Dosen (String nama, int jumlahHariKerja){
        super(nama);
        jamSibuk = jumlahHariKerja * 8;
    }
    
    public void mailCheck(){
        System.out.println(getnama() + " adalah seorang dosen dengan jam sibuk " + getjamSibuk());
    }

    public int getjamSibuk(){
        return jamSibuk;
    }


}
