package no.hiof.oleedvao.lecture11;

import no.hiof.oleedvao.lecture11.model.BusDriver;
import no.hiof.oleedvao.lecture11.model.Carpenter;
import no.hiof.oleedvao.lecture11.model.CarpenterApprentice;
import no.hiof.oleedvao.lecture11.model.Person;

import java.time.LocalDate;

public class UsingStatic {
    public static void main(String[] args) {

        System.out.println("---Number of persons created (static variable)---");

        /*
        Statiske variabler benyttes for variabler som ikke skal ha unike verdier per objekt, altså variabler som ikke
        er instansvariabler. Vi sier da konseptuelt at slike statiske variabler tilhører klassen selv, og
        ikke objektene av klassen.

        For å aksessere en statisk variabel referer vi til dette direkte gjennom klassen (klassen navn)
        Merk også at det kommenterte eksemplet under er basert på at den statiske variabelen er deklarert som public.
        Dette er fremdeles "bad practise" i Java og vi bør heller benytte innkapsling.

            Person.numPersons = 10;
            System.out.println(Person.numPersons);

         */

        /*
        Under benyttes en statisk metode getNumPersons() for å hente ut verdien av den statiske variablen.
        Her bør vi også kalle denne direkte gjennom Klassen.
         */
        System.out.println("Number of persons created: " + Person.getNumPersons());

        Person ola = new Person("Ola", "Nordmann", 20);
        System.out.println("Number of persons created: " + Person.getNumPersons());

        Person oleE = new Person("Ole-Edvard" , "Ørebæk", 28);
        System.out.println("Number of persons created: " + Person.getNumPersons());


        Carpenter carpenter = new Carpenter("John", "Carpenter", 50);
        CarpenterApprentice carpenterApprentice = new CarpenterApprentice("Jon", "Då", 21);
        BusDriver busDriver = new BusDriver("Buzz", "Driver", 30);
        System.out.println("Number of persons created: " + Person.getNumPersons());

         /*
        Merk at vi også teknisk sett kan aksessere statiske metoder og variabler gjennom objekter, men dette er typisk
        ansett som FEIL Å GJØRE da disse variablene og metodene ikke "tilhører" objektene. Men vi kan her gjøre dette
        for å illustrere at verdien for den statiske variabelen numPersons er den samme uansett hvilket objekt.
         */
        System.out.println("Call through ola: " + ola.getNumPersons());
        System.out.println("Call through oleE: " + oleE.getNumPersons());

        System.out.println("\n---Examples of static variables and methods in other classes---");
        /*
        Vi kan også se eksempler på ferdiglagde klasser, slik som LocalDate, som benytter statiske metoder for å
        opprette objekter. Å gjøre det på denne måten er litt spesielt, men det viktigste er at vi ser at disse metodene
        aksesseres direkte gjennom klassen.
         */
        System.out.println(Math.PI);
        System.out.println(Math.max(6, 300));
        System.out.println(LocalDate.now());


    }
}
