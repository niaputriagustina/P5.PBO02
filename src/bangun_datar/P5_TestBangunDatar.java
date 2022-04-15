package bangun_datar;

public class P5_TestBangunDatar {
    public static void main(String[] args) {
        //Membuat Objek Bangun Datar
        P5_BangunDatar bangunDatar = new P5_BangunDatar();

        //Membuat Obejk Persegi dan Mengisi Nilai Properti
        P5_Persegi persegi = new P5_Persegi();
        persegi.setSisi(2);

        //Membuat Objek Lingkaran dan Mengisi Nilai Properti
        P5_Lingkaran lingkaran = new P5_Lingkaran();
        lingkaran.setJariJari(22);

        //Membuat Objek Persegi Panjang dan Mengisi Nilai Properti
        P5_PersegiPanjang persegiPanjang = new P5_PersegiPanjang();
        persegiPanjang.setPanjang(8);
        persegiPanjang.setLebar(4);

        //Membuat Objek Segitiga dan Mengisi Nilai Properti
        P5_Segitiga msegitiga = new P5_Segitiga();
        msegitiga.setAlas(6);
        msegitiga.setTinggi(4);

        //Memanggil Method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println();

        persegi.luas();
        persegi.keliling();
        System.out.println();

        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();

        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();

        msegitiga.luas();
        msegitiga.keliling();
        System.out.println();
    }
}
