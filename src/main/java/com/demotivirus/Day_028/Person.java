package com.demotivirus.Day_028;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor
@RequiredArgsConstructor
public abstract class Person {
    @NonNull
    private String name;

    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public Pet getPet(String petName){
        Pet search = null;
        for (Pet pet : pets){
            if (pet.getName().equals(petName))
                return pet;
        }
        return new Pet("NOT FOUND");
    }
}
