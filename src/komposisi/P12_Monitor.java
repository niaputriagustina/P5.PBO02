package komposisi;

public class P12_Monitor {
    //Membuat Variabel
    private String merk;
    private int ukuranInch;

    //Membuat Method
    public P12_Monitor () {
        this.merk = "Intel HD Graphics";
        this.ukuranInch = 14;
    }

    public P12_Monitor (String merk, int ukuranInch) {
        this.merk = merk;
        this.ukuranInch = ukuranInch;
    }

    public String getMerk () {
        return merk;
    }

    public void setMerk (String merk) {
        this.merk = merk;
    }

    public int getUkuranInch () {
        return ukuranInch;
    }

    public void setUkuranInch (int ukuranInch) {
        this.ukuranInch = ukuranInch;
    }

    public void displaySpecMonitor () {
        System.out.println("Merk Monitor            : " +merk);
        System.out.println("Ukuran Monitor (Inch)   : " +ukuranInch);
    }
}
