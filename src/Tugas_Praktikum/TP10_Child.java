package Tugas_Praktikum;

//Membuat Childclass
public class TP10_Child extends TP10_Parent {
    //Membuat Method
    public void method1 () {
        System.out.println("Child's method1()");
    }

    public static void main(String[] args) {
        TP10_Parent p = new TP10_Child();
        p.method2();
    }
}

/*
Pada program diatas, kita memanggil method yang berada di kelas induk yang bernama method2(), dan method1() pada kelas
induk juga ikut dipanggil, padahal akses modifier nya adalah private. method1() pada kelas induk ikut terpanggil karena
pada method2() dikelas induk mengakses method1() yang private, sehingga method1() juga ikut terpanggil
 */
