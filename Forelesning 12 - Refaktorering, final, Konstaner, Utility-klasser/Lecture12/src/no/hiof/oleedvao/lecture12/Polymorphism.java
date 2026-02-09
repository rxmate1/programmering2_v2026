package no.hiof.oleedvao.lecture12;



import no.hiof.oleedvao.lecture12.model.BusDriver;
import no.hiof.oleedvao.lecture12.model.Carpenter;
import no.hiof.oleedvao.lecture12.model.CarpenterApprentice;
import no.hiof.oleedvao.lecture12.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {

        Person person1 = new Person("Ola", "Nordmann", 20);
        Person person2 = new Person("Ola-E", "Ørebæk", 28);
        Carpenter carpenter = new Carpenter("Rudolf", "Arnesen", 45, 3);
        CarpenterApprentice apprentice = new CarpenterApprentice("Jon", "Då", 19, 0,
                LocalDate.now(), LocalDate.of(2028, 10, 10));

        person1.compareAgeTo(person2);
        person1.compareAgeTo(carpenter);
        person1.compareAgeTo(apprentice);


        System.out.println("\n--- List of Persons ---");

        ArrayList<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(carpenter);
        listOfPersons.add(apprentice);
        listOfPersons.add(new BusDriver("Buzz", "Driver", 40,
                "630 - Moss, Halden"));

        for (Person currentPerson : listOfPersons) {
            if (currentPerson instanceof BusDriver) {
                BusDriver busDriver = (BusDriver) currentPerson;
                System.out.println(busDriver.getFirstName() + " is a bus driver with route " +
                        busDriver.getRoute());
            }
            else if (currentPerson instanceof CarpenterApprentice) {
                System.out.println(currentPerson.getFirstName() + " is a carpenter apprentice with training" +
                                "period that starts " + ((CarpenterApprentice) currentPerson).getTrainingStartDate()
                        );
            }
            else if (currentPerson instanceof Carpenter) {
                System.out.println(currentPerson.getFirstName() + " is a carpenter and has built " +
                        ((Carpenter) currentPerson).getNumHousesBuilt() + " houses!");
            }
            else {
                System.out.println(currentPerson.getFirstName() + " is a person!");
            }
        }

    }
}
