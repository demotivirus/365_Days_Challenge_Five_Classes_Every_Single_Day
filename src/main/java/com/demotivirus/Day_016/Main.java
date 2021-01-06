package com.demotivirus.Day_016;

public class Main {
    public static void main(String[] args) {
        Human human = new Man("Mike");
        Human human2 = new Women("Anna");
        Work trainer = new Work("Trainer", 680);
        Work builder = new Work("Builder", 600);
        System.out.println(human.getName());
        System.out.println(human2.getName());
        System.out.println("================");

        Human human1 = new Women("Mandy", "Babysitter");
        human1.addProfession("Pilot");
        System.out.println(human1);
        System.out.println("================");

        Human arnoldSchwarzenegger = new Man("Arnold");
        arnoldSchwarzenegger.addProfessions("BodyBuilder", "Trainer", "TV Star", "Gubernator", "Terminator");
        System.out.println(arnoldSchwarzenegger);
        System.out.println("================");

        Human iHaveAWork = new Man("Astron", "Trainer");
        Work trainer2 = new Work("Trainer", 700);
        trainer2.setWorker(iHaveAWork);
        System.out.println(iHaveAWork);
        System.out.println("================");

        Human iNotHaveAWork = new Women("Billi", "Writer");
        trainer2.setWorker(iNotHaveAWork);
        System.out.println(iNotHaveAWork);
        System.out.println("================");

        WorkPlace workPlace = new WorkPlace();
        workPlace.addWorks(trainer, trainer2, builder);
        System.out.println(workPlace);
    }
}
