package no.hiof.oleedvao.lecture12.model;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    private static int numPersons = 0;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        numPersons++;
    }

    public static int getNumPersons() {
        return numPersons;
    }

    public void compareAgeTo(Person otherPerson) {
        if (this.age > otherPerson.age) {
            System.out.println(this.firstName + " " + this.lastName + " is older");
        }
        else if (this.age < otherPerson.age) {
            System.out.println(otherPerson.firstName + " " + otherPerson.lastName +
                    " is older");
        }
        else {
            System.out.println("The persons are the same age");
        }
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                "\nLast name: " + lastName +
                "\nAge: " + age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
