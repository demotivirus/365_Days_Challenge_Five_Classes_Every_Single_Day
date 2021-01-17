package com.demotivirus.Day_027;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LocalDB {
    private List<Person> persons;
    private PersonGenerator personGenerator;

    public void printPersons(){
        System.out.println("TOTAL PERSONS: " + persons.size());
        for (Person p : persons)
            System.out.println(p);
    }

    public void addPerson(Person person){
        if (persons == null)
            persons = new ArrayList<>();
        persons.add(person);
    }

    public void generateManyPersons(int num){
        if (personGenerator == null)
            personGenerator = new PersonGenerator(this);
        personGenerator.generateMany(num);
    }
}
