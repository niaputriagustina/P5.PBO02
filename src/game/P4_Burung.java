package game;

//Membuat Sub Class
public class P4_Burung extends P4_Enemy {
    //Membuat Method
    public P4_Burung (String name, int hp, int attackPoin) {
        super (name, hp, attackPoin);
    }

    void walk () {
        System.out.println("Burung Berjalan");
    }

    void jump () {
        System.out.println("Burung Loncat-Loncat");
    }

    void fly () {
        System.out.println("Burung Terbang....");
    }
}
