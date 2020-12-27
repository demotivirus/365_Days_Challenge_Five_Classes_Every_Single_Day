package com.demotivirus.Day_006;

import lombok.Data;

@Data
public class ConcreteBuilding implements Building{
    private final int maxFloor;
    private final int minFloor;
//    private final Lift lift;
//
//    public void goToTheMaxFloor(){
//        lift.setFloor(maxFloor);
//    }
//
//    public void goDown() {
//        lift.goDown();
//    }
//
//    public void goUp() {
//        lift.goUp();
//    }


}
