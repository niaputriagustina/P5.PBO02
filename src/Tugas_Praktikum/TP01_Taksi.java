package Tugas_Praktikum;

//Membuat Subclass
public class TP01_Taksi extends TP01_Mobil{
    //Membuat Variabel
    protected int tarifAwal;
    protected int tarifPerKm;

    //Membuat Method


    public TP01_Taksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKm) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }

    public void setTarifAwal (int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int getTarifAwal () {
        return tarifAwal;
    }

    public void setTarifPerKm (int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifPerKm () {
        return tarifPerKm;
    }

    public void display () {
        System.out.println("Jumlah Roda             : " +jmlRoda);
        System.out.println("Warna                   : " +warna);
        System.out.println("Bahan Bakar             : " +bahanBakar);
        System.out.println("Kapasitas Mesin         : " +kapasitasMesin);
        System.out.println("Tarif Awal              : " +tarifAwal);
        System.out.println("Tarif PerKm             : " +tarifPerKm);
    }
}
