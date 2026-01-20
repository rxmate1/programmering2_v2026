package no.hiof.oleedvao.lecture6;

import no.hiof.oleedvao.lecture6.model.Course;
import no.hiof.oleedvao.lecture6.model.Student;

public class ObjectInObject {
    public static void main(String[] args) {

        Student oleE = new Student("Ole-Edvard", "Ørebæk", 28,
                "123456");

        Course programming2 = new Course("Programming 2", "ITF10619",
                10);

        /*
        Vi setter her Student-objektet sitt "favorittkurs" til å være et Course-objekt. Altså har vi et eksempel på
        hvor et objekt "inneholder" et annet objekt. Men egentlig er det riktigere å si at Student-objektet har en
        "referanse" til et Course-objekt. Vi kan alternativt si at Student-objektet har et forhold til et Course-objekt,
        og mer spesifikt at forholdet er at Course-objektet er "studenten" sitt favorittkurs.
         */
        oleE.setFavoriteCourse(programming2);

        /*
        Vi kan nå aksessere Course-objektet gjennom Student-objektet sine gettere og settere.
         */
        Course oleEsFavoriteCourse = oleE.getFavoriteCourse();
        System.out.println("Ole-Es favorite course: " + oleEsFavoriteCourse.getCourseName());

         /*
        Det følgende henter ut Course-objektet sitt navn gjennom Student-objektet.
        Vi kunne også gjort dette ved å hente ut objektet først, f.eks.
            String favoriteCourseName = studentsFavoriteCourse.getCourseName();
        Men slik som vi gjør under medfører akkurat det samme og gjør at vi slipper å mellomlagre objektet i en
        variabel. Dette er altså en liten optimalisering i forhold til kodelinjer.
         */
        String oleEsFavoriteCourseName = oleE.getFavoriteCourse().getCourseName();
        System.out.println("Ole-Es favorite course: " + oleEsFavoriteCourseName);

        /*
        Det følgende ender Course-objektet sitt navn gjennom Student-objektet.
         */
        programming2.setCourseName("Programming 2077");

        /*
        Merk at en endring på et objekt vil medføre denne endringen for ALLE referanser til objektet, om dette er en
        vanlig variabel eller en instansvariabel.
         */
        System.out.println();
        System.out.println("Course reference after change: " + oleEsFavoriteCourse.getCourseName());
        System.out.println("Course refence in Student object after change: " +
                oleE.getFavoriteCourse().getCourseName());

    }
}
