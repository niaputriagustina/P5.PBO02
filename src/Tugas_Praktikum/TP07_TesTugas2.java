package Tugas_Praktikum;

public class TP07_TesTugas2 {
    public static void main(String[] args) {
        //Membuat Objek
        TP07_Katak o1 = new TP07_Katak(5, "Froggy", "Melompat");
        TP07_Kecebong o2 = new TP07_Kecebong(2, "Junior Frog", 10, "Berenang");

        //Menampilkan Objek
        o1.display();
        System.out.println();
        o2.display();
    }
}
