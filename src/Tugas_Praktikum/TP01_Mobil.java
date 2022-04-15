package Tugas_Praktikum;

//Membuat Subclass
public class TP01_Mobil extends TP01_Kendaraan {
    //Membuat Variabel
    protected String bahanBakar;
    protected int kapasitasMesin;

    //Membuat Method


    public TP01_Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin) {
        super(jmlRoda, warna);
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar (String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar () {
        return bahanBakar;
    }

    public void setKapasitasMesin (int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin () {
        return kapasitasMesin;
    }
}
