package Tugas_Praktikum;

//Membuat Subclass
public class TP11_Manajer extends TP11_Pegawai {
    //Membuat Variabel
    private int tunjangan;

    //Membuat Method
    public TP11_Manajer (String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int infoGaji () {
        return gaji;
    }

    public int infoTunjangan () {
        return tunjangan;
    }
}
