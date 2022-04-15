import javafx.scene.Parent;

//Membuat Parent Class
class ParentClass {
    int id;

    //Membuat Parent Constructor
    ParentClass () {
        id = 7;
        System.out.println("Constructor Of Parent");
    }
}


public class P3_TestInheritance extends ParentClass {
    int id;

    //Child Class Constructor
    P3_TestInheritance () {
        /*
        Secara Implisit Melibatkan Konstruktor Default ParentClass
        Gunakan super() Untuk Merujuk Ke Konstruktor ParentClass
        super() Ini Harus Diletakkan Di Baris Awal
         */
        this.id = 9;
        System.out.println("Constructor Of Child");
    }

    void printid () {
        System.out.println("id Kelas P3_TestInheritance : " + this.id);
        System.out.println("id Kelas ParentClass        : " + super.id);
    }
    public static void main(String[] args) {
        //Creating The Object Of Child Class
        P3_TestInheritance testInheritance = new P3_TestInheritance();
        testInheritance.printid();
    }
}
