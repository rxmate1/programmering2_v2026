package no.hiof.oleedvao.lecture11.model;

public class BusDriver extends Person {

    private String route;

    public BusDriver(String firstName, String lastName, int age) {
        super(firstName, lastName, age);

        route = "Not set"; // Standardverdi for route hvis ikke satt manuelt
    }

    public BusDriver(String firstName, String lastName, int age, String route) {
        super(firstName, lastName, age);

        this.route = route;
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                "\nLast name: " + lastName +
                "\nAge: " + age +
                "\nRoute: " + route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
