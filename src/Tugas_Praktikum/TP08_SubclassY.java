package Tugas_Praktikum;

//Membuat Subclass
public class TP08_SubclassY extends TP08_SuperclassX {
    TP08_SuperclassX objX = new TP08_SubclassY();
    /*TP08_SubclassY objY = new TP08_SuperclassX(); ==> terjadi error karena harus dicasting dulu objek nya menjadi
    TP08_SubclassY objY = (TP08_SubclassY) new TP08_SuperclassX();
     */
    TP08_SubclassY objY = (TP08_SubclassY) new TP08_SuperclassX();
    void subclassMethodY () {
        objY.superclassMethodX();
        int i;
        i = objY.superClassVarX;
    }
}
