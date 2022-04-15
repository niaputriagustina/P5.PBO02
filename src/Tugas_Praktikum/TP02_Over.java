package Tugas_Praktikum;

//Membuat Subclass
public class TP02_Over extends TP02_Base {
    public static void main(String[] args) {
        TP02_Over o = new TP02_Over();
        int iBase = 0;
        o.aMethod(iBase);
    }

    public void aMethod (int iover) {
        System.out.println("TP02_Over.aMethod");
    }
}

/*
Penjelasan :
Pada contoh program diatas, kita ingin memanggil method yang berada di kelas induk, namun yang dipanggil justru method
yang berada di kelas anak atau subclass, hal ini karena method yang berada di subclass telah di override. untuk itu, jika
kita ingin memanggil method yang berada di kelas induk, maka kita harus menggunakan kata kunci super.nama_method_kelas_induk
 */
