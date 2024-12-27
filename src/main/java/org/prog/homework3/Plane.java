package org.prog.homework3;

import java.util.Objects;

//TODO: write class Plane with fields "flightId", "destination", "airlines"
//TODO: write hashCode and Equals (see Car)
//TODO: compare planes with null flightId and catch exception, in catch write "flight id is missing"
//TODO: in try-catch-finally add finally and print "works anyway"

public class Plane {
    public String flightId;
    public String destination;
    public String airlines;


    public Plane(String flightId, String destination, String airlines) {
        this.flightId = flightId;
        this.destination = destination;
        this.airlines = airlines;
    }


    @Override
    public String toString() {
        return "Plane{" +
                "flightId='" + flightId + '\'' +
                ", destination='" + destination + '\'' +
                ", airlines='" + airlines + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(flightId, destination, airlines);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Plane plane = (Plane) obj;
        return Objects.equals(flightId, plane.flightId) &&
                Objects.equals(destination, plane.destination) &&
                Objects.equals(airlines, plane.airlines);
    }


    public static void main(String[] args) {
        Plane plane1 = new Plane(null, "Kyiv", "Air Kyiv"); // flightId == null
        Plane plane2 = new Plane("F123", "Kyiv", "Air Kyiv");
        Plane plane3 = new Plane("F124", "Lviv", "Air Lviv");

        try {
            // Порівняння літаків за допомогою flightId
            if (plane1.flightId == null) {
                throw new NullPointerException("flightId is null");
            }
            if (plane1.flightId.equals(plane2.flightId)) {
                System.out.println("Planes have the same flight ID.");
            } else {
                System.out.println("Planes have different flight IDs.");
            }
        } catch (NullPointerException e) {

            System.out.println("flight id is missing");
        } finally {
            
            System.out.println("works anyway");
        }


        System.out.println("plane1 equals plane2: " + plane1.equals(plane2));
        System.out.println("plane1 equals plane3: " + plane1.equals(plane3));


        System.out.println("HashCode plane1: " + plane1.hashCode());
        System.out.println("HashCode plane2: " + plane2.hashCode());
        System.out.println("HashCode plane3: " + plane3.hashCode());
    }
}