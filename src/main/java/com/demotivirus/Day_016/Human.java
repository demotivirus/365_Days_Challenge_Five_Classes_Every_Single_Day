package com.demotivirus.Day_016;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public abstract class Human {
    @NonNull
    private String name;
    private List<Profession> professions;
    private Work work;

    public Human(String name, String profession){
        this.name = name;
        this.professions = new ArrayList<>();
        professions.add(new Profession(profession));
    }

    public void addProfession(String profession){
        checkProfessionInit();
        professions.add(new Profession(profession));
    }

    public void addProfessions(String... professions){
        checkProfessionInit();
        for (String profession : professions)
            this.professions.add(new Profession(profession));
    }

    private void checkProfessionInit(){
        if(professions == null)
            professions = new ArrayList<>();
    }

    private List<Profession> getProfessions() {
        return professions;
    }

    private void setProfessions(List<Profession> professions) {
        this.professions = professions;
    }

    public boolean checkProfession(Profession profession){
        if (professions.contains(profession))
            return true;
        else return false;
    }
}
