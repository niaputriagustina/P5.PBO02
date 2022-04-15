package Tugas_Praktikum;

public class TP05_TestLatihan {
    public static void main(String[] args) {
        //Membuat Objek
        System.out.println("Memasukkan Identitas Dosen 1 : Agus");
        TP05_Dosen dosen1 = new TP05_Dosen("Agus");
        System.out.println("Memasukan Identitas Dosen 2 : Budi, NIP. 1458");
        TP05_Dosen dosen2 = new TP05_Dosen("Budi", 1458);
        System.out.println("Memasukkan Identitas Dosen 3 : Iwan, NIP. 1215, Umur 47");
        TP05_Dosen dosen3 = new TP05_Dosen("Iwan", 1215, 47);
        System.out.println();
        dosen1.info();
        System.out.println();
        dosen2.info();
        System.out.println();
        dosen3.info();
    }
}
