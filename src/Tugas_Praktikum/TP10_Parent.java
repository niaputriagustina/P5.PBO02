package Tugas_Praktikum;

//Membuat Parentclass
public class TP10_Parent {
    //Membuat Method
    private void method1 () {
        System.out.println("Parent's method1()");
    }

    public void method2 () {
        System.out.println("Parent's method2()");
        method1();
    }
}
