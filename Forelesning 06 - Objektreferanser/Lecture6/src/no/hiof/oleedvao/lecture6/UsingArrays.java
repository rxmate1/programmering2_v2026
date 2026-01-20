package no.hiof.oleedvao.lecture6;

import no.hiof.oleedvao.lecture6.model.Student;

public class UsingArrays {
    public static void main(String[] args) {
        System.out.println("---Primitive Array---");

        /*
        Vi oppretter her en Array for int verdier. Merk at en Array i Java er fast i lengde. Vi spesifiserer lengden
        når vi oppretter Arrayen. Under defineres Arrayen til å være 3 i lengde ved
            ... new int[3];
        Arrayens lengde vil da alltid være 3, verken mindre eller lengere. Når arrayen opprettes vil alle elementene
        settes til en standard verdi avhengig av datatypen. For int er dette 0.
         */
        int[] intArray = new int[3];

        System.out.println("Array values after init: " + intArray[0] +
                ", " + intArray[1] + ", " + intArray[2]);
        /*
        Den kommenterte linjen under forsøker å aksessere et element utenfor rekkevidden av Arrayen (Arrayen har en
        lengde på 3, mens linjen forsøker å aksessere fjerde element). Dette vil krasje programmet under kjøring
        og det er ingen måte å utvide lengden på arrayen utenom å opprette en helt ny array med en større lengde.
        Arrays er altså ganske ufleksible.
         */
        //int value = intArray[3];

        /*
        Vi kan aksessere elementene i en Array ved å benytte indexer som under.
         */
        intArray[0] = 1; // Setter første element (index 0) til 1.
        intArray[1] = 2; // Setter andre element (index 1) til 2.
        intArray[2] = 3; // Setter tredje element (index 2) til 3.

        /*
        Vi henter ut verdier av en Array på samme måte som når vi setter dem, bare at vi utelater =.
         */
        System.out.println("Array values after setting them: " + intArray[0] + ", " + intArray[1] + ", " + intArray[2]);

        System.out.println("\n---Object Array (Student)---");

        /*
        Vi kan også sette en Array til å holde på objekter, her Student-objekter. For eksempelets skyld settes lengden
        til å være 1. Standard verdi for objekter etter opprettelse er null.
         */
        Student[] studentArray = new Student[1];
        System.out.println("Student array value after init: " + studentArray[0]);

        /* Merk at vi får en feil under kjøring hvis vi forsøker å benytte et objekt på en posisjon som ikke inneholder
        noen verdi (NullPointerException).
         */
        //studentArray[0].getFirstName();

        /*
        Vi setter her første element til å være et Student-objekt. Etter dette kan objektet aksesseres gjennom
        arrayen.
         */
        studentArray[0] = new Student("Bingus", "Dingus", 30, "987654");
        System.out.println("Student object in array name: " + studentArray[0].getFirstName());


        /*
        Vi kan iterere gjennom en array ved bruk av en for-løkke. Vi benytter iterasjonsvariabelen(i) til å representere
        indexene og teller disse oppover. Vi kan dermed aksessere hvert element i arrayen i sekvens med
        iterasjonsvariabelen.
         */
        System.out.println("\nFor loop through array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + ": " + intArray[i]);
        }

    }
}
