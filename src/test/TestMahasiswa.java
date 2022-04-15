package test;

//Mengimport Dari Library Java Serta Package akun_bank dan perguruan_tinggi
import java.util.List;
import java.util.ArrayList;
import akun_bank.P2_Tabungan;
import perguruan_tinggi.P2_Kelas;
import perguruan_tinggi.P2_Mahasiswa;

public class TestMahasiswa {
    public static void main(String[] args) {
        //Buat 4 Objek Mahasiswa Atas Nama Anton, Budi, Clarisa dan Dono
        P2_Mahasiswa anton = new P2_Mahasiswa(1106310,"Anton");
        P2_Mahasiswa budi = new P2_Mahasiswa(1106311,"Budi");
        P2_Tabungan tbudi = new P2_Tabungan(1,100000);
        budi.setTabungan(tbudi);
        P2_Mahasiswa clarisa = new P2_Mahasiswa(1106312,"Clarisa");
        P2_Tabungan tclarisa = new P2_Tabungan(2,150000);
        clarisa.setTabungan(tclarisa);
        P2_Mahasiswa dono = new P2_Mahasiswa(1106313,"Dono");
        P2_Tabungan tdono = new P2_Tabungan(3,200000);
        dono.setTabungan(tdono);

        //Membuat 2 Objek Kelas Yaitu kelasRPL dan kelasTI
        P2_Kelas kelasRPL = new P2_Kelas(1,"Kelas RPL");
        P2_Kelas kelasTI = new P2_Kelas(2,"Kelas TI");

        //Buat Sebuah 2 Objek List Mahasiswa Yaiut daftarMahasiswaRPL dan daftarMahasiswaTI
        List <P2_Mahasiswa> daftarMahasiswaRPL = new ArrayList<>();
        daftarMahasiswaRPL.add(anton);
        daftarMahasiswaRPL.add(clarisa);
        kelasRPL.setDaftarMahasiswa(daftarMahasiswaRPL);

        List <P2_Mahasiswa> daftarMahasiswaTI = new ArrayList<>();
        daftarMahasiswaTI.add(budi);
        daftarMahasiswaTI.add(dono);
        kelasTI.setDaftarMahasiswa(daftarMahasiswaTI);

        System.out.println("Data Kelas RPL\n" +kelasRPL.toString());
        System.out.println("\nData Kelas TI\n" +kelasTI.toString());
    }
}
