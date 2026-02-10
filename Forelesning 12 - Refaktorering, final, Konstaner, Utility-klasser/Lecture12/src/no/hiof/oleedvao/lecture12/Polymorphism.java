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


        for(Person currentPerson : listOfPersons) {
            switch (currentPerson) {
                case BusDriver currentBusDriver ->
                        System.out.println(currentPerson.getFirstName() + " is a bus driver with route " +
                                currentBusDriver.getRoute());
                case CarpenterApprentice currentApprentice->
                        System.out.println(currentApprentice.getFirstName() + " is a carpenter apprentice with training" +
                                "period that starts " + currentApprentice.getTrainingStartDate());
                case Carpenter currentCarpenter ->
                        System.out.println(currentPerson.getFirstName() + " is a carpenter and has built " +
                        currentCarpenter.getNumHousesBuilt() + " houses!");
                default ->
                        System.out.println(currentPerson.getFirstName() + " is a person!");
            }
        }



       /* for (Person currentPerson : listOfPersons) {
            if (currentPerson instanceof BusDriver currentBusDriver) {
                System.out.println(currentPerson.getFirstName() + " is a bus driver with route " +
                        currentBusDriver.getRoute());
            }
            else if (currentPerson instanceof CarpenterApprentice currentApprentice) {
                System.out.println(currentApprentice.getFirstName() + " is a carpenter apprentice with training" +
                                "period that starts " + currentApprentice.getTrainingStartDate()
                        );
            }
            else if (currentPerson instanceof Carpenter currentCarpenter) {
                System.out.println(currentPerson.getFirstName() + " is a carpenter and has built " +
                        currentCarpenter.getNumHousesBuilt() + " houses!");
            }
            else {
                System.out.println(currentPerson.getFirstName() + " is a person!");
            }
        } */

    }
}
