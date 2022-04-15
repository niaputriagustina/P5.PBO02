package Tugas_Praktikum;

//Membuat Baseclass
public class TP07_Katak {
    //Membuat Variabel
    public int umur;
    public String nama;
    public String caraBergerak;

    //Membuat Method
    public TP07_Katak (int umur, String nama, String caraBergerak) {
        this.umur = umur;
        this.nama = nama;
        this.caraBergerak = caraBergerak;
    }

    public  void setCaraBergerak (String caraBergerak) {
        this.caraBergerak = caraBergerak;
    }
    public String caraBergerak () {
        return caraBergerak;
    }

    public void display () {
        System.out.println("umur            : " +umur);
        System.out.println("Nama            : " +nama);
        System.out.println("Cara Bergerak   : " +caraBergerak);
    }
}
