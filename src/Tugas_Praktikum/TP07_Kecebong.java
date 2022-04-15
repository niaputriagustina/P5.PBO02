package Tugas_Praktikum;

//Membuat Subclass
public class TP07_Kecebong extends TP07_Katak {
    //Membuat Variabel
    public double panjangEkor;

    //Membuat Method
    public TP07_Kecebong (int umur, String nama, double panjangEkor, String caraBergerak) {
        super(umur,nama,caraBergerak);
        this.panjangEkor = panjangEkor;
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
        System.out.println("Panjang Ekor    : " +panjangEkor);
        System.out.println("Cara Bergerak   : " +caraBergerak);
    }
}
