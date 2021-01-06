package com.demotivirus.Day_016;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Work {
    private Profession profession;
    private Money money;

    public Work(String profession, double money) {
        this.profession = new Profession(profession);
        this.money = new Money(money);
    }

    public void setWorker(Human human){
        if (human.checkProfession(profession))
            human.setWork(this);
    }
}
