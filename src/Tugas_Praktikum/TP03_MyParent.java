package Tugas_Praktikum;

//Membuat Kelas Induk
public class TP03_MyParent {
    //Membuat Variabel
    int x,y;

    //Membuat Method
    TP03_MyParent (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addMe (int x, int y) {
        return this.x + x + y + this.y;
    }

    public int addMe (TP03_MyParent myPar) {
        return addMe(myPar.x, myPar.y);
    }
}
