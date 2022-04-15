package Tugas_Praktikum;

//Membuat Subclass
public class TP11_Programmer extends TP11_Pegawai {
    //Membuat Variabel
    private int bonus;

    //Membuat Method
    public TP11_Programmer (String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int infoGaji() {
        return gaji;
    }

    public int infoBonus () {
        return bonus;
    }
}
