package Tugas_Praktikum;

public class TP01_Test {
    public static void main(String[] args) {
        //Membuat Objek truk1 dan truk2
        TP01_Truk truk1 = new TP01_Truk(4, "Kuning", "Solar", 1500, 1000);
        TP01_Truk truk2 = new TP01_Truk(6, "Merah", "Solar", 2000, 5000);

        //Membuat Objek taksi1 dan taksi2
        TP01_Taksi taksi1 = new TP01_Taksi(4, "Oranye", "Bensin", 1500, 10000, 5000);
        TP01_Taksi taksi2 = new TP01_Taksi(4, "Biru", "Bensin", 1300, 7000, 3500);

        //Membuat Objek sepeda1 dan sepeda2
        TP01_Sepeda sepeda1 = new TP01_Sepeda(3, "Hitam", "1", 2);
        TP01_Sepeda sepeda2 = new TP01_Sepeda(2, "Putih", "2", 5);

        //Menampilkan Objek
        System.out.println("===========================================");
        System.out.println("=====truk1=====");
        truk1.display();
        System.out.println("=====truk2=====");
        truk2.display();

        System.out.println("===========================================");
        System.out.println("=====taksi1=====");
        taksi1.display();
        System.out.println("=====taksi2=====");
        taksi2.display();

        System.out.println("===========================================");
        System.out.println("=====sepeda1=====");
        sepeda1.display();
        System.out.println("=====sepeda2=====");
        sepeda2.display();

    }
}
