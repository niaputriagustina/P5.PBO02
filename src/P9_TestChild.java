//Membuat Parent Class
class Parent {
    //Overridden Method
    public void display () {
        System.out.println("display() Mehtod Of Parent Class");
    }
}

//Membuat Child Class
public class P9_TestChild extends Parent {
    //Overriding Method
    @Override
    public void display () {
        System.out.println("display() Method Of Child Class");
    }

    public static void main(String[] args) {
        Parent myParent = new Parent();
        myParent.display();

        Parent myChild = new P9_TestChild();
        myChild.display();
    }
}
