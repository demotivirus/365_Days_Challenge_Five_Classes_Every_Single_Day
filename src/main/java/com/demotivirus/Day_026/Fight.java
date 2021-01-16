package com.demotivirus.Day_026;

public class Fight {
    public void start(Unit one, Unit two){
        while (one.getHp() > 0 && two.getHp() > 0){
//            two.setHp(two.getHp() - one.getDamage());
//            System.out.println(two.getName() + ": " + two.getHp());
//            one.setHp(one.getHp() - two.getDamage());
//            System.out.println(one.getName() + ": " + one.getHp());
            one.doDamage(two);
            two.doDamage(one);
        }
    }

    public void start(Unit one, Unit[] many){
        System.out.println("Enemies is: " + (many.length-1));
        while (one.getHp() > 0){
            for (int i = 0; i < many.length;) {
                if (i == many.length-1)
                    return;
                one.doDamage(many[i]);
                many[i].doDamage(one);
                if (many[i].getHp() <= 0){
                    System.out.println("Rat " + i + " id defeat");
                    System.out.println("================================");
                    i++;
                }
            }
        }
    }
}
