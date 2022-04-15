package Tugas_Praktikum;

//Membuat Subclass
public class TP01_Sepeda extends TP01_Kendaraan {
    //Membuat Variabel
    protected String jmlSadel;
    protected int jmlGir;

    //Membuat Method
    public TP01_Sepeda (int jmlRoda, String warna, String jmlSadel, int jmlGir) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }

    public void setJmlSadel (String jmlSadel) {
        this.jmlSadel = jmlSadel;
    }

    public String getJmlSadel () {
        return jmlSadel;
    }

    public void setJmlGir (int jmlGir) {
        this.jmlGir = jmlGir;
    }

    public int getJmlGir () {
        return jmlGir;
    }

    public void display () {
        System.out.println("Jumlah Roda     : " +jmlRoda);
        System.out.println("Warna           : " + warna);
        System.out.println("Jumlah Sadel    : " +jmlSadel);
        System.out.println("Jumlah Gir      : " +jmlGir);
    }
}
