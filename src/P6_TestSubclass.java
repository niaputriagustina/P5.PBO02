//Membuat Parentclass
class Parentclass {
    //Overridden Method
    void display () {
        System.out.println("Parent Class Method");
    }
}

//Membuat Subclass
public class P6_TestSubclass extends Parentclass {
    //Overridden Mehod
    @Override
    void display () {
        System.out.println("Child Class Method");
    }

    void printMsg () {
        //This Would Call Overriding Method
        display();
        ////This Would Call Overridden Method
        super.display();
    }

    public static void main(String[] args) {
        P6_TestSubclass obj = new P6_TestSubclass();
        obj.printMsg();
    }
}
