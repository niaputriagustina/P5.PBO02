package Tugas_Praktikum;

//Membuat Subclass
public class TP01_Truk extends TP01_Mobil {
    //Membuat Variabel
    protected int muatanMaks;

    //Membuat Method


    public TP01_Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks) {
        super (jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.muatanMaks = muatanMaks;
    }

    public void setMuatan (int muatan) {
        this.muatanMaks = muatan;
    }

    public int getMuatan () {
        return muatanMaks;
    }

    public void display () {
        System.out.println("Jumlah Roda         : " +jmlRoda);
        System.out.println("Warna               : " +warna);
        System.out.println("Bahan Bakar         : " +bahanBakar);
        System.out.println("Kapasitas Mesin     : " +kapasitasMesin);
        System.out.println("Muatan Maks         : " +muatanMaks);
    }
}
