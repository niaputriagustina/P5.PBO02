package komposisi;

public class P12_RAM {
    //Membuat Variabel
    private String merk;
    private int kapasitasMB;

    //Membuat Method
    public P12_RAM () {
        this.merk = "Kingstones";
        this.kapasitasMB = 8000;
    }

    public P12_RAM (String merk, int kapasitasMB) {
        this.merk = merk;
        this.kapasitasMB = kapasitasMB;
    }

    public String getMerk () {
        return merk;
    }

    public void setMerk (String merk) {
        this.merk = merk;
    }

    public int getKapasitasMB () {
        return kapasitasMB;
    }

    public void setKapasitasMB (int kapasitasMB) {
        this.kapasitasMB = kapasitasMB;
    }

    public void displaySpecRAM () {
        System.out.println("Merk RAM        : " +merk);
        System.out.println("Kapasitas RAM   : " +kapasitasMB);
    }
}
