package perguruan_tinggi;

//Mengimport Dari Package akun_bank
import akun_bank.P2_Tabungan;

public class P2_Mahasiswa {

    //Membuat Variabel
    private int nrp;
    private String nama;
    private P2_Tabungan tabungan;

    //Membuat Method

    public P2_Mahasiswa (int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
        this.tabungan = new P2_Tabungan(0,50000);
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public P2_Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(P2_Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}
