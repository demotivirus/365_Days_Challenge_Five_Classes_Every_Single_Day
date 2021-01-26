package com.demotivirus.Day_036;

public class Main {
    public static void main(String[] args) {
        Users mikle = new Users("Mikle");
        Roles roleAdmin = new Roles("roleAdmin");
        Roles roleUser = new Roles("roleUser");

        mikle.addRole(roleAdmin);
        mikle.addRole(roleUser);
        roleAdmin.addUser(mikle);
        roleUser.addUser(mikle);

        System.out.println(mikle.getName() + " has roles: " + mikle.getRoles());

        Users thomas = new Users("Thomas");
        thomas.addRole(roleUser);
        roleUser.addUser(thomas);

        System.out.println(roleUser.getName() + " has users: " + roleUser.getUsers());

        Houses house = new Houses();
        house.setHouseNumber(14);

        house.addUser(thomas);
        house.addUser(mikle);

        System.out.println(house);
        System.out.println(house.getUsers().get(1).getRoles());

        Town london = new Town();
        london.addHouse(house);
        london.addHouse(house);

        System.out.println("People in London: " + london.getNumOfPeoples());
    }
}
