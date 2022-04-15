package game;

public class P4_TestGame {
    public static void main(String[] args) {
        //Membuat Objek
        P4_Zombie zombie  = new P4_Zombie("Zombie Land",20,2);
        P4_Pocong pocong = new P4_Pocong("Pocong Kliwon",25,5);
        P4_Burung burung = new P4_Burung("Burung Hantu",15,1);
        System.out.println("Musuh 1");
        System.out.println("---------------------------");
        System.out.println("Nama                : " +zombie.getName());
        System.out.println("Heatlh Power (HP)   : " +zombie.getHp());
        System.out.println("Attack Point        : " +zombie.getAttackPoin());
        zombie.attack();
        zombie.walk();
        System.out.println();
        System.out.println("Musuh 2");
        System.out.println("---------------------------");
        System.out.println("Nama                : " +pocong.getName());
        System.out.println("Heatlh Power (HP)   : " +pocong.getHp());
        System.out.println("Attack Point        : " +pocong.getAttackPoin());
        pocong.attack();
        pocong.jump();
        System.out.println();
        System.out.println("Musuh 3");
        System.out.println("---------------------------");
        System.out.println("Nama                : " +burung.getName());
        System.out.println("Heatlh Power (HP)   : " +burung.getHp());
        System.out.println("Attack Point        : " +burung.getAttackPoin());
        burung.attack();
        burung.walk();
        burung.jump();
        burung.fly();
    }
}
