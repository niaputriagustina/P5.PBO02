package asosiasi;

//Membuat Superclass
class CarClass {
    //Membuat Variabel
    String carName;
    int carId;

    //Membuat Method
    CarClass (String name, int id) {
        this.carName = name;
        this.carId = id;
    }
}

//Membuat Subclass
class Driver extends CarClass {
    //Membuat Variabel
    String driverName;

    //Membuat Method
    Driver (String name, String cName, int cId) {
        super (cName, cId);
        this.driverName = name;
    }
}

public class P10_TestDrive {
    public static void main(String[] args) {
        //Membuat Objek
        Driver obj = new Driver("Andy", "Ford", 9988);
        System.out.println(obj.driverName+ "Is A Drive Of Car Id : " +obj.carId);
    }
}
