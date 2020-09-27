package lsc.tests;

public class PersonBuilder {

    private Person object = new Person();

    public Person build() {
        return object;
    }

    public PersonBuilder setName(java.lang.String value) {
        object.setName(value);
        return this;
    }

    public PersonBuilder setCountry(java.lang.String value) {
        object.setCountry(value);
        return this;
    }

    public PersonBuilder setAge(int value) {
        object.setAge(value);
        return this;
    }

}
