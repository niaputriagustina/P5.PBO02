package Tugas_Praktikum;

public class TP11_Bayaran {
    //Membuat Method
    public int hitungBayaran (TP11_Pegawai peg) {
        int uang = peg.infoGaji();

        //Membuat Percabangan
        if (peg instanceof TP11_Manajer) {
            uang += ((TP11_Manajer)peg).infoTunjangan();
        }
        else if (peg instanceof TP11_Programmer) {
            uang += ((TP11_Programmer)peg).infoBonus();
        }
        return uang;
    }

    public static void main(String[] args) {
        TP11_Manajer man = new TP11_Manajer("Agus", 800, 50);
        TP11_Programmer prog = new TP11_Programmer("Budi", 600, 30);
        TP11_Bayaran hr = new TP11_Bayaran();
        System.out.println("Bayaran Untuk Manajer       : " +hr.hitungBayaran(man));
        System.out.println("Bayaran Untuk Programmer    : " +hr.hitungBayaran(prog));
    }
}
