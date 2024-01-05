package main;

public class BuilderImpl implements Builder{
    Person person = new Person();

    BuilderImpl(String name,String lastname,int age){
        person.name=name;
        person.lastname=lastname;
        person.age=age;
    }

    @Override
    public BuilderImpl setName(String name) {
        person.name=name;
        return this;

    }

    @Override
    public BuilderImpl setMiddleName(String middlename) {
        person.middlename=middlename;
        return this;
    }

    @Override
    public BuilderImpl setLastName(String lastname) {
        person.lastname=lastname;
        return this;
    }

    @Override
    public BuilderImpl setAge(int age) {
        person.age=age;
        return this;
    }

    @Override
    public BuilderImpl setEmail(String email) {
        person.email=email;
        return this;
    }

    @Override
    public BuilderImpl setPhoneNumber(String phonenumber) {
        person.phonenumber=phonenumber;
        return this;
    }

    @Override
    public BuilderImpl setBirthDate(String birthdate) {
        person.birthdate=birthdate;
        return this;
    }

    public Person build() {
        return person;
    }

}
