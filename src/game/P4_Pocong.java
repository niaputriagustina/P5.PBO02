package game;

//Membuat Sub Class
public class P4_Pocong extends P4_Enemy {
    //Membuat Method
    public P4_Pocong (String name, int hp, int attackPoin) {
        super (name, hp, attackPoin);
    }

    void jump () {
        System.out.println("Pocong Loncat-Loncat!");
    }
}
