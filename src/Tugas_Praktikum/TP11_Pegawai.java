package Tugas_Praktikum;

//Membuat Superclass
public class TP11_Pegawai {
    //Membuat Variabel
    protected String nama;
    protected int gaji;

    //Membuat Mathod
    public TP11_Pegawai (String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji () {
        return gaji;
    }
}
