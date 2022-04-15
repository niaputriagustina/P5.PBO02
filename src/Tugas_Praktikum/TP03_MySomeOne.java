package Tugas_Praktikum;

public class TP03_MySomeOne {
    public static void main(String[] args) {
        TP03_MyChild myChi = new TP03_MyChild(10,20,30);
        TP03_MyParent myPar = new TP03_MyParent(10,20);
//        int x = myChi.addMe(10, 20, 30);
        int y = myChi.addMe(myChi);
        int z = myPar.addMe(myPar);
//        System.out.println(x + y + z);

        /*
    Ketika dijalankan error, karena pada kelas diatas terdapat parameter yang sama, sedangkan ketika kita ingin membuat
    method yang sama, kita harus membedakan tipe data dan jumlah parameter nya
     */

    }
}
