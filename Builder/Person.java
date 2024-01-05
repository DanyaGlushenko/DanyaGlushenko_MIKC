package main;

public class Person {
    String name;
    String middlename;
    String lastname;
    int age;
    String email;
    String phonenumber;
    String birthdate;

    public String toString() {
        return 	"Name: "+ name+
                " Middle name: "+middlename+
                " Last name: "+lastname+
                " Age: "+age+
                " E-mail: "+email+
                " Phone number: "+phonenumber+
                " Birth date: "+birthdate+"\n";
    }
}
