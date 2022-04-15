package Tugas_Praktikum;

//Membuat Superclass
public class TP01_Kendaraan {
    //Membuat Variabel
    protected int jmlRoda;
    protected String warna;

    //Membuat Method


    public TP01_Kendaraan(int jmlRoda, String warna) {
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }

    public void setJmlRoda (int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }

    public int getJmlRoda () {
        return jmlRoda;
    }

    public String getWarna (String warna) {
        return warna;
    }

    public void setWarna () {
        this.warna = warna;
    }
}
