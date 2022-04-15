package perguruan_tinggi;

//Mengimport Dari Library Java
import java.util.ArrayList;
import java.util.List;

public class P2_Kelas {
    //Membuat Variabel
    private int kodeKelas;
    private String namaKelas;
    private List<P2_Mahasiswa> daftarMahasiswa;

    //Membuat Method

    public P2_Kelas (int kodeKelas, String namaKelas) {
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public int getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(int kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public List<P2_Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void setDaftarMahasiswa(List<P2_Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    @Override
    public String toString () {
        StringBuilder myString = new StringBuilder();
        myString.append("Kode Kelas : ");
        myString.append(kodeKelas);
        myString.append("\tNama kelas : ");
        myString.append(namaKelas);
        myString.append("\nDaftar Mahasiswa : ");
        daftarMahasiswa.forEach((P2_Mahasiswa ) -> {
            myString.append("\n");
            myString.append(P2_Mahasiswa.getNama());
            myString.append("\t");
            myString.append(P2_Mahasiswa.getNrp());
            myString.append("\t");
            myString.append(P2_Mahasiswa.getTabungan().getNoRekening());
            myString.append("\t");
            myString.append(P2_Mahasiswa.getTabungan().getSaldo());
        });
        return myString.toString();
    }
}
