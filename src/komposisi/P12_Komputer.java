package komposisi;

public class P12_Komputer {
    //Membuat Variabel
    private final String kode;
    private final long harga;
    private final P12_CPU cpu;
    private final P12_RAM ram;
    private final P12_Monitor monitor;
    protected final P12_Keyboard keyboard;

    //Membuat Method
    P12_Komputer (String kode, long harga) {
        this.kode = kode;
        this.harga = harga;
        cpu = new P12_CPU();
        ram = new P12_RAM();
        monitor = new P12_Monitor();
        keyboard = new P12_Keyboard();
    }

    public void displaySpec () {
        System.out.println("Kode                : " +kode);
        System.out.println("Harga               : " +harga);
        System.out.println("\nSpesifikasi CPU");
        System.out.println("-----------------------------------");
        cpu.displaySpecCPU();
        System.out.println("\nSpesifikasi RAM");
        System.out.println("-----------------------------------");
        ram.displaySpecRAM();
        System.out.println("\nSpesifikasi Monitor");
        System.out.println("-----------------------------------");
        monitor.displaySpecMonitor();
        System.out.println("\nSpesifikasi Keyboard");
        System.out.println("-----------------------------------");
        keyboard.displaySpecKeyboard();
    }
}