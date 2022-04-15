package Tugas_Praktikum;

//Membuat Subclass
public class TP09_Derived extends TP09_Base {
    //Membuat Variabel
    int i = -1;

    public static void main(String[] args) {
        TP09_Base b = new TP09_Derived();
        System.out.println(b.i);
        b.amethod();
    }
    public void amethod () {
        System.out.println("TP09_Derived.amethod()");
    }
}

/*
Penjelasan :
Pada contoh program diatas, kita ingin memanggil method yang berada di kelas induk, namun yang dipanggil justru method
yang berada di kelas anak atau subclass, hal ini karena method yang berada di subclass telah di override. untuk itu, jika
kita ingin memanggil method yang berada di kelas induk, maka kita harus menggunakan kata kunci super.nama_method_kelas_induk
 */