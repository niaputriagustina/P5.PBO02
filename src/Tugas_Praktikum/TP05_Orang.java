package Tugas_Praktikum;

//Membuat Superclass
public class TP05_Orang {
    //Membuat Variabel
    protected String nama;
    protected int umur;

    //Membuat Method
    public TP05_Orang (String nama) {
        this.nama = nama;
    }

    public TP05_Orang (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}
