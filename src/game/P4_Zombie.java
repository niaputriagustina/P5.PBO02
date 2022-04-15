package game;

//Membuat Sub Class
public class P4_Zombie extends P4_Enemy{
    //Membuat Method
    public P4_Zombie (String name, int hp, int attackPoin) {
        super (name, hp, attackPoin);
    }

    void walk () {
        System.out.println("Zombie Jalan-Jalan");
    }
}
