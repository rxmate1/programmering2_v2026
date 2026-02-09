package no.hiof.oleedvao.lecture12;

import no.hiof.oleedvao.lecture12.model.BusDriver;
import no.hiof.oleedvao.lecture12.model.Carpenter;
import no.hiof.oleedvao.lecture12.model.CarpenterApprentice;
import no.hiof.oleedvao.lecture12.model.Person;

import java.time.LocalDate;

public class UsingStatic {
    public static void main(String[] args) {

        System.out.println("---Number of persons created (static variable)---");

        System.out.println("Number of persons created: " + Person.getNumPersons());

        Person ola = new Person("Ola", "Nordmann", 20);
        System.out.println("Number of persons created: " + Person.getNumPersons());

        Person oleE = new Person("Ole-Edvard" , "Ørebæk", 28);
        System.out.println("Number of persons created: " + Person.getNumPersons());


        Carpenter carpenter = new Carpenter("John", "Carpenter", 50);
        CarpenterApprentice carpenterApprentice = new CarpenterApprentice("Jon", "Då", 21);
        BusDriver busDriver = new BusDriver("Buzz", "Driver", 30);
        System.out.println("Number of persons created: " + Person.getNumPersons());

        System.out.println("Call through ola: " + ola.getNumPersons());
        System.out.println("Call through oleE: " + oleE.getNumPersons());

        System.out.println("\n---Examples of static variables and methods in other classes---");
        System.out.println(Math.PI);
        System.out.println(Math.max(6, 300));
        System.out.println(LocalDate.now());


    }
}
