package main;

public interface Builder {
    BuilderImpl setName(String name);
    BuilderImpl setMiddleName(String middlename);
    BuilderImpl setLastName(String lastname);
    BuilderImpl setAge(int age);
    BuilderImpl setEmail(String email);
    BuilderImpl setPhoneNumber(String phonenumber);
    BuilderImpl setBirthDate(String birthdate);
    Person build();

}
