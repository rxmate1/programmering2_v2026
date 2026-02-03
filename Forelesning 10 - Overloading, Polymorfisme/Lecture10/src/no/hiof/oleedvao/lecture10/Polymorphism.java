package no.hiof.oleedvao.lecture10;

import no.hiof.oleedvao.lecture10.model.Carpenter;
import no.hiof.oleedvao.lecture10.model.CarpenterApprentice;
import no.hiof.oleedvao.lecture10.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {

        Person person1 = new Person("Ola", "Nordmann", 20);
        Person person2 = new Person("Ola-E", "Ørebæk", 28);
        Carpenter carpenter = new Carpenter("Rudolf", "Arnesen", 45, 3);
        CarpenterApprentice apprentice = new CarpenterApprentice("Jon", "Då", 19, 0,
                LocalDate.now(), LocalDate.of(2028, 10, 10));

        /*
        Vi ser at compareAgeTo() på grunn av polymorfisme i parameteren (av typen Person) kan benyttes til å
        sammenligne alle typer objekter som er av  typen Person eller arver fra Person. Denne metoden er altså veldig
        fleksibel til typen objekt, så lenge det arver fra og konseptuelt er en Person, som er noe vi kan si om både
        BussDriver, Carpenter og CarpenterApprentice.
         */
        person1.compareAgeTo(person2);
        person1.compareAgeTo(carpenter);
        person1.compareAgeTo(apprentice);


        System.out.println("\n--- List of Persons ---");

        /*
        Vi benytter her polymorfisme til å opprette en liste som kan holde på alle typer Person-objekter. Det
        inkluderer altså objekter av Person sine barneklasser, BussDriver, Carpenter og CarpenterApprentice.
         */
        ArrayList<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(carpenter);
        listOfPersons.add(apprentice);

        /*
        Vi kan også benytte polymorfisme til å gå gjennom alle Person-objekter i listen. Dette vil inkludere de
        objektene som er av Person sine barneklasser. Merk likevel at vi bare har tilgang Person-funksjonalitet når
        vi benytter dette som datatype på referansen(e). Hvis vi vil benytte barneklassefunksjonalitet må vi gjøre noe
        mer. Dette kommer i neste forelesning...
         */
        for (Person currentPerson : listOfPersons) {
            System.out.println(currentPerson);
            System.out.println();
        }

    }
}
