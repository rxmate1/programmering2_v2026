package no.hiof.oleedvao.lecture11;

import no.hiof.oleedvao.lecture11.model.BusDriver;
import no.hiof.oleedvao.lecture11.model.Carpenter;
import no.hiof.oleedvao.lecture11.model.CarpenterApprentice;
import no.hiof.oleedvao.lecture11.model.Person;

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

            /*
            Vi kan sjekke om et objekt er av en spesifikk type klasse ved bruk av nøkkelordet instanceof, som
            returnerer true hvis objektet er av den spesifiserte klassen og false hvis ikke.
            Vi kan altså benytte dette til å definere unik logikk for håndtering av de forskjellige typene objekter.
             */
            if (currentPerson instanceof BusDriver) {
                /*
                På grunn av polymorfisme vil Java fremdeles tolke currentPerson som et objekt av Person og
                funksjonaliteten tilgjengelig gjennom denne variabelen vil fortsatt være begrenset til
                Person-funksjonalitet.
                Hvis vi ønsker å benytte spesifikk funksjonalitet for BusDriver, slik som
                getRoute() og setRoute(), må vi dermed fortelle Java at objektvariabelen skal
                spesifikt tolkes som et BussDriver-objekt. Dette gjør vi med Object Type Casting.
                Altså som vi kan se under Type Caster vi currentPerson til å tolkes som et BusDriver-object
                med koden ((BusDriver) currentPerson), og vi kan kalle funksjonalitet tilhørende
                gjennom den ytre parantesen. Den ytre parantesen blir altså et objekt.
                 */
                BusDriver busDriver = (BusDriver) currentPerson;
                System.out.println(busDriver.getFirstName() + " is a bus driver with route " +
                        busDriver.getRoute());
            }
            /*
            Merk også at vi må først lage if-tester for barneklassene for å forsikre oss om at disse blir håndtert.
            Dette er fordi alle barneklasse-objekter er også objekter av dens foreldreklasser, så f.eks. hvis vi i
            stedet sjekker slik...:

                if (currentPerson instanceof Carpenter {...}
                else if (currentPerson instanceof CarpenterApprentice {...}

            ... vil alle CarpenterApprentice-objekter bare bli håndtert som Carpenter, ettersom dette blir sjekket
            først.

            Altså som en tommelfingerregel: Definer if-tester for
            underklasser først og så for mer generelle overklasser.
             */
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
