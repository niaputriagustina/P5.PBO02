package Tugas_Praktikum;

public class TP06_TestTugas1 {
    public static void main(String[] args) {
        //Membuat Objek
        TP06_RerataNilai rn = new TP06_RerataNilai();
        System.out.println("Rerata Nilai 21 dan 13 Adalah : " +rn.average(21, 13));
        System.out.println("Rerata Nilai 19.3 dan 39.5 Adalah : " +rn.average(19.3, 39.5));
        System.out.println("Rerate Nilai 123, 567, 744 Adalah : " +rn.average(123, 567, 744));
    }
}
