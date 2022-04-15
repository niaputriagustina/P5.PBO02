package mahasiswa;

//Membuat Subclass
public class P7_KetuaHima extends P7_Mahasiswa {
    //Membuat Variabel
    private String jurusan;

    //Membuat Method
    public P7_KetuaHima (String nama, int nrp, String jurusan) {
        super (nama,nrp);
        this.jurusan = jurusan;
    }

    public String getJurusan () {
        return jurusan;
    }

    public void setJurusan (String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public void info () {
        System.out.println(this.getNama()+ '\n' +this.getNrp()+ '\n' +jurusan);
    }

    @Override
    public String toString () {
        String result = super.toString()+ ", Jurusan = " +jurusan;
        return result;
    }

}
