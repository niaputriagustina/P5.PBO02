package bangun_datar;

//Membuat Subclass
public class P5_Persegi extends P5_BangunDatar {
    //Membuat Variabel
    private double sisi;

    //Membuat Method
    public double getSisi () {
        return sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas () {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi : " +luas);
        return luas;
    }

    @Override
    public double keliling () {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi : " +keliling);
        return keliling;
    }
}
