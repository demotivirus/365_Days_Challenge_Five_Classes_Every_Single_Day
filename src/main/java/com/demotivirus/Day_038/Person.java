package com.demotivirus.Day_038;

import lombok.Data;

@Data
public class Person {
    private String name;
    private Clothes clothes;
    private Clothes.Shirt shirtColors;
    private Shirt shirt;
    private Pet pet;

    @Data
    public static class Builder {
        private Person person;

        public Builder() {
            person = new Person();
        }

        public Builder name(String name){
            person.name = name;
            return this;
        }

        public Builder clothes(Clothes clothes){
            person.clothes = clothes;
            return this;
        }

        public Builder shirtColors(Clothes.Shirt shirtColor){
            if (person.shirt == null){
                person.clothes = Clothes.SHIRT;
                person.shirtColors = shirtColor;
                return this;
            }
            return this;
        }

        public Builder shirtColors(Shirt shirt){
            if (person.shirtColors == null){
                person.clothes = Clothes.SHIRT;
                person.shirt = shirt;
                return this;
            }
            return this;
        }

        public Builder pet(Pet pet){
            person.pet = pet;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
