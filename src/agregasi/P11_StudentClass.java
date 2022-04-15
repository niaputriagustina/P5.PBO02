package agregasi;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class P11_StudentClass {
    //Membuat Variabel
    int rollNum;
    String studentName;
    //Creating HAS-A Relationship With Address Class
    P11_Address studentAddress;

    P11_StudentClass (int rollNum, String studentName, P11_Address studentAddress) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public static void main(String[] args) {
        P11_Address address = new P11_Address(8,"Bengkalis", "Riau", "Indonesia");
        P11_StudentClass obj = new P11_StudentClass(123, "Budi Gunawan", address);
        System.out.println("Roll Number     : " +obj.rollNum);
        System.out.println("Student Name    : " +obj.studentName);
        System.out.println("Student Number  : " +obj.studentAddress.streetNum);
        System.out.println("City            : " +obj.studentAddress.city);
        System.out.println("State           : " +obj.studentAddress.state);
        System.out.println("Country         : " +obj.studentAddress.country);
    }
}
