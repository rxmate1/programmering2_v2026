package no.hiof.oleedvao.lecture10;

import no.hiof.oleedvao.lecture10.model.BusDriver;
import no.hiof.oleedvao.lecture10.model.Carpenter;
import no.hiof.oleedvao.lecture10.model.CarpenterApprentice;

import java.time.LocalDate;

public class Overloading {
    public static void main(String[] args) {

        /*
        Overloading betyr at vi kan opprette flere metoder med samme navn. Konseptuelt kan dette benyttes til å opprette
        flere unike implementasjoner av samme "handling". Vi slipper altså å definere unike navn for hver metode når vi
        har behov for flere alternative implementasjoner. Overloading er gyldig så lenge Java kan skille dem på
        parameterene (antall og/eller rekkefølge av datatyper). Dette gjelder både i definisjon og når vi kaller
        metodene.
         */

        /*
        Vi benytter her de "nye" konstruktørene til å opprette objekter med bare de helt essensielle egenskapene
        (firsName, lastName og age). Dette er i motsetning til hvordan objektene opprettes i Polymorphism.java hvor
        disse opprettes ved å sette alle egenskaper. Dette er underforstått eksempler på bruk av overloadede
        konstruktører. Java kan skille på hvilken konstruktør som skal benyttes basert på hvor mange verdier og typene
        verdier vi sender med. Her sender vi med verdier av typene String, String og int, som kan spores til én
        konstruktør med nøyaktig de samme type parametere.
         */
        BusDriver busDriver = new BusDriver("Buzz" , "Driver", 30);
        Carpenter carpenter = new Carpenter("John", "Carpenter", 60);
        CarpenterApprentice carpenterApprentice = new CarpenterApprentice(
                "Carpenter", "Apprentice", 20
        );

        System.out.println("-BusDriver-");
        System.out.println(busDriver);
        System.out.println("\n-Carpenter-");
        System.out.println(carpenter);
        System.out.println("\n-CarpenterApprentice-");
        System.out.println(carpenterApprentice);


        /*
        Her ser vi at vi benytter den andre konstruktøren for CarpenterApprentice, som krever verdier av typene
        String, String int, int LocalDate, LocalDate.
         */
        CarpenterApprentice apprentice2 = new CarpenterApprentice(
                "Jon", "Då", 21, 0,
                LocalDate.now(), LocalDate.of(2027, 6, 15)
        );

        System.out.println("\n---Apprentice with original training period---");
        System.out.println(apprentice2);

        /*
        Her benytter vi overloading for å ha alternative muligheter for å utvide en CarpenterApprentice sin
        treningsperiode.
        Her benytter vi de overloadede metodene for å utvide en CarpenterApprentice sin treningsperiode. Vi har to
        alternativer, sette en ny utvidet sluttdato (LocalDate) eller utvide med et visst antall dager (int).
        Håndteringen av denne "utvidelse-logikken" varierer avhengig av hvilken kontruktør vi velger å benytte, altså
        basert på hvilken type verdi vi sender med. Gir vi LocalDate, vil den sette denne som ny dato, gir vi int vil
        den utvide med dette antallet dager.
         */
        System.out.println("\n---Apprentice with extended training period (new date)---");
        apprentice2.extendTrainingPeriod(LocalDate.of(2027, 12, 24));
        System.out.println(apprentice2);

        System.out.println("\n---Apprentice with extended training period (number of days)");
        apprentice2.extendTrainingPeriod(65);
        System.out.println(apprentice2);

    }
}
