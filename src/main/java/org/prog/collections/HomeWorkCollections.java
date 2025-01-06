package org.prog.collections;
import java.util.*;
//TODO: Write code where single car be owned by multiple unique owners
//TODO: some cars can have multiple owners
//TODO: print owner names for all owners that share cars

// > Jane : Car1, Car2, Car3
// > John : Car4
// > Bill: Car1, Car5
// > Sarah : Car4
// > ...
// > ...

// >>>> Car1: Jane, Bill
// >>>> Car4: John, Sarah
public class HomeWorkCollections {

    private Map<String, List<String>> carToOwners;

    public HomeWorkCollections() {
        carToOwners = new HashMap<>();
    }

    public void addCar(String car, String owner) {
        if (!carToOwners.containsKey(car)) {
            carToOwners.put(car, new ArrayList<>());
        }

        List<String> owners = carToOwners.get(car);
        if (!owners.contains(owner)) {
            owners.add(owner);
        }
    }
    public List<String> getOwnersOfCar(String car) {
        return carToOwners.getOrDefault(car, new ArrayList<>());
    }

    public void displaySharedOwners() {

        Set<String> sharedOwners = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : carToOwners.entrySet()) {
            List<String> owners = entry.getValue();
            if (owners.size() > 1) {

                sharedOwners.addAll(owners);
            }
        }

        System.out.println("Owners who share cars: " + String.join(", ", sharedOwners));
    }


    public void displayAllOwnerships() {
        for (Map.Entry<String, List<String>> entry : carToOwners.entrySet()) {
            String car = entry.getKey();
            List<String> owners = entry.getValue();
            System.out.println(car + ": " + String.join(", ", owners));
        }
    }

    public static void main(String[] args) {
        HomeWorkCollections homeworkCollections = new HomeWorkCollections();

        // Додаємо автомобілі і власників
        homeworkCollections.addCar("Car1", "Jane");
        homeworkCollections.addCar("Car1", "Bill");
        homeworkCollections.addCar("Car2", "Jane");
        homeworkCollections.addCar("Car3", "Jane");
        homeworkCollections.addCar("Car4", "John");
        homeworkCollections.addCar("Car4", "Sarah");
        homeworkCollections.addCar("Car5", "Bill");


        homeworkCollections.displayAllOwnerships();


        homeworkCollections.displaySharedOwners();
    }
}