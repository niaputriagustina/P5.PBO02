package Tugas_Praktikum;

//Membuat Kelas Anak
public class TP03_MyChild extends TP03_MyParent {
    //Membuat Variabel
    int z;
    TP03_MyChild (int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    /*
    public int addMe (TP03_MyChild myChi) {
        return this.x + x + this.y + y + this.z + z;
    }

    public int addMe (TP03_MyChild myChi) {
        return addMe(myChi.x, myChi.y, myChi.z);
    }

    public int addMe (int x, int y) {
        return this.x + x + this.y +y;
    }
     */

    /*
    Ketika dijalankan error, karena pada kelas diatas terdapat parameter yang sama, sedangkan ketika kita ingin membuat
    method yang sama, kita harus membedakan tipe data dan jumlah parameter nya
     */
}
