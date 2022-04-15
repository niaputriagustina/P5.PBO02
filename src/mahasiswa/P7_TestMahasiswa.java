package mahasiswa;

public class P7_TestMahasiswa {
    public static void main(String[] args) {
        //To Do Code Application Logic Here
        P7_Mahasiswa anton = new P7_KetuaHima("Anton", 1106789, "Teknik Informatika");
        anton.info();
        System.out.println("Jenis Kelas = " +anton.getClass().getSimpleName());
        System.out.println();

        P7_Mahasiswa budi = new P7_Mahasiswa("Budi", 1106123);
        budi.info();
        System.out.println("Jenis Kelas = " +budi.getClass().getSimpleName());
        System.out.println(budi.toString());
        System.out.println();

        P7_KetuaHima ucok = new P7_KetuaHima("Ucok", 1105239, "Teknik Elektro");
        ucok.info();
        System.out.println("Jenis Kelas = " +ucok.getClass().getSimpleName());
        System.out.println();

        P7_Mahasiswa butet = new P7_KetuaHima("Butet Sitorus", 1106789, "Bahasa Inggirs");
        butet.info();
        System.out.println("Jenis Kelas = " +butet.getClass().getSimpleName());
        System.out.println(butet.toString());
    }
}
