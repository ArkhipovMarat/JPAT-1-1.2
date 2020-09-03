public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String adress) {
        this.address = adress;
        return this;
    }

    public Person build() throws IllegalStateException {
        Person person;

        if (!(name != null && !name.isEmpty() ||
                surname != null && !surname.isEmpty()))
            throw new IllegalStateException("поле ФИО не заполнено");

        if (age == 0) {
            person = new Person(name, surname);
        } else {
            if (age > 0 & age < 100) {
                person = new Person(name, surname, age);
            } else {
                throw new IllegalStateException("возраст указан неверно");
            }
        }
        person.setAddress(address);
        return person;
    }

}
