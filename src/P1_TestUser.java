public class P1_TestUser {
    public static void main(String[] args) {

        //Membuat / Menginstansi Objek
        P1_User dono = new P1_User();

        //dono.username = "Dono"; ==> Error Tidak Bisa Secara Langsung Mengakses Atribut
        dono.setUsername("Dono");
        dono.setPassword("123456");

        System.out.println("Info Akun");
        System.out.println("-----------------------");
        System.out.println("Nama        : " +dono.getUsername());
        System.out.println("Password    : " +dono.getPassword());
    }
}
