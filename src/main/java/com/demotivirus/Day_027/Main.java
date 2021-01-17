package com.demotivirus.Day_027;

public class Main {
    public static void main(String[] args) {
        LocalDB db = new LocalDB();
        //PersonGenerator personGenerator = new PersonGenerator(db);

        //personGenerator.generateOne();
        //System.out.println(personGenerator);
        //System.out.println(db);

        db.generateManyPersons(100);
        //personGenerator.generateMany(100);
        db.printPersons();

        War war = new War(db);
        war.killPersons(99);
        db.printPersons();

        db.generateManyPersons(9);
        db.printPersons();
    }
}
