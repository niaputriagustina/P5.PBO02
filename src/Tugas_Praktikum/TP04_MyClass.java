package Tugas_Praktikum;

public class TP04_MyClass {
    //Membuat Method
    void myMethod (int i) {
        System.out.println("int Version");
    }

    void myMethod (String s) {
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        TP04_MyClass obj = new TP04_MyClass();
        char c = 'c';
        //obj.myMethod(ch);
        /*
        Tidak bisa dijalankan karena tipe data dari method yakni integer dan String, sedangkan tipe data yang dimasukkan
        adalah char, sehingga terjadi error karena ketidaksesuaian inputan;
         */
    }
}
