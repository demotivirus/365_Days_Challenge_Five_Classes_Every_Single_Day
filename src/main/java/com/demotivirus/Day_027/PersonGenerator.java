package com.demotivirus.Day_027;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class PersonGenerator {
    @NonNull
    private LocalDB localDB;
    private List<String> firstNames;
    private List<String> lastNames;

    public void generateOne() {
        addPerson();
    }

    public void generateMany(int num) {
        for (int i = 0; i < num; i++) {
            addPerson();
        }
    }

    public void printPersons() {
        for (Person p : localDB.getPersons()) {
            System.out.println(p);
        }
    }

    private String generateFirstName() {
        if (firstNames == null)
            firstNames = new ArrayList<>();

        firstNames.add("Aaron");
        firstNames.add("Poul");
        firstNames.add("Pavel");
        firstNames.add("Drake");
        firstNames.add("Moana");

        return firstNames.get(getRandom(firstNames.size()));
    }

    private String generateLastName() {
        if (lastNames == null)
            lastNames = new ArrayList<>();

        lastNames.add("Smith");
        lastNames.add("Adams");
        lastNames.add("Suri");
        lastNames.add("Heromy");
        lastNames.add("Berkly");

        return lastNames.get(getRandom(lastNames.size()));
    }

    private int getRandom(int parameter) {
        Random r = new Random();
        return r.nextInt(parameter);
    }

    private void addPerson() {
        if (localDB == null)
            localDB = new LocalDB();

        localDB.addPerson(new Person(generateFirstName(), generateLastName(), (byte) getRandom(127)));
    }
}
