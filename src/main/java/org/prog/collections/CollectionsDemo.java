package org.prog.collections;

import org.prog.cars.Car;

import java.util.*;

public class CollectionsDemo {

    //TODO: Homework 1: add owners list ad parameter for addCarToCompany;
    //TODO*: Do only if you want! Make owners random! WARNING: make list of owers to pick from

    public static void main(String[] args) {
        Map<Car, List<String>> carsAndOwners = new HashMap<>();

        List<String> owners1 = Arrays.asList("John", "Jane");
        List<String> owners2 = Arrays.asList("Alice", "Bob");
        List<String> owners3 = Arrays.asList("Eve", "Charlie");
        List<String> owners4 = Arrays.asList("Mike", "Anna");

        addCarToCompany(carsAndOwners, "black", owners1);
        addCarToCompany(carsAndOwners, "white", owners2);
        addCarToCompany(carsAndOwners, "red", owners3);
        addCarToCompany(carsAndOwners, "blue", owners4);

        String requestedOwnerName = "John";
        Set<Car> carsOwnedBySpecificPerson = findCars(carsAndOwners, requestedOwnerName);

        for (Car c : carsOwnedBySpecificPerson) {
            System.out.println(c);
        }
    }

    public static void addCarToCompany(Map<Car, List<String>> carsAndOwners,
                                       String color, List<String> owners) {
        Car car = new Car();
        car.color = color;
        carsAndOwners.put(car, new ArrayList<>(owners));
    }

    public static Set<Car> findCars(Map<Car, List<String>> carsAndOwners, String requestedOwnerName) {
        Set<Car> carsOwnedBySpecificPerson = new HashSet<>();
        Iterator<Map.Entry<Car, List<String>>> iterator = carsAndOwners.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Car, List<String>> entry = iterator.next();
            Car carUnderInspection = entry.getKey();
            List<String> owners = entry.getValue();
            if (owners.contains(requestedOwnerName)) {
                carsOwnedBySpecificPerson.add(carUnderInspection);
            }
        }

        return carsOwnedBySpecificPerson;
    }
}
