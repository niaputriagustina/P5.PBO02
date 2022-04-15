package akun_bank;

public class P2_Tabungan {
    //Membuat Variabel
    private int noRekening;
    private long saldo;

    //Membuat Mehtod
    public P2_Tabungan (int noRekening, int saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(int noRekening) {
        this.noRekening = noRekening;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void debit (long jumlah) {
        this.saldo += jumlah;
        System.out.println("Transaksi Berhasil. Saldo Anda : " +this.saldo);
    }

    public void kredit (long jumlah) {
        if (this.saldo <= 0 || (this.saldo - jumlah) <= 1000) {
            System.out.println("Transaksi Tidak Dapat Dilakukan. Saldo Anda Kurang Dari Saldo Minimum Setelah Penarikan");
        }
        else {
            this.saldo = jumlah;
            System.out.println("Transaksi Berhasil. Saldo Anda : " +this.saldo);
        }
    }
}
