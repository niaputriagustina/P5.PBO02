package Tugas_Praktikum;

//Membuat Subclass
public class TP05_Dosen extends TP05_Orang {
    //Membuat Variabel
    int nip;

    //Membuat Method
    public TP05_Dosen (String nama) {
        super(nama);
    }

    public TP05_Dosen (String nama, int nip) {
        super(nama);
        this.nip = nip;
    }

    public TP05_Dosen (String nama, int umur, int nip) {
        super(nama,umur);
        this.nip = nip;
    }

    public void info () {
        System.out.println("Nama    : " +nama);
        System.out.println("NIP     : " +nip);
        System.out.println("Umur    : " +umur);
    }
}
