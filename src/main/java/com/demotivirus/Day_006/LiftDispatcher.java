package com.demotivirus.Day_006;

import lombok.Data;

@Data
public class LiftDispatcher {
    private final Building building;
    private final Lift lift;

    public LiftDispatcher(Building building, Lift lift){
        this.building = building;
        this.lift = lift;
        lift.setNowFloor(building.getMaxFloor());
    }

    public void setFloor() {
       lift.setFloor(building.getMaxFloor());
    }

    public int getNowFloor() {
        return lift.getNowFloor();
    }

    public void setNowFloor(int floor){
        lift.setNowFloor(floor);
    }

    public void goDown() {
        if (lift.getNowFloor() > building.getMinFloor())
            lift.goDown();
        else System.out.println("THIS IS MIN FLOOR");
    }

    public void goUp(){
        if (lift.getNowFloor() < building.getMaxFloor())
            lift.goUp();
        else System.out.println("THIS IS MAX FLOOR");
    }

    public void goToFloor(int floor){
        boolean up = floor > lift.getNowFloor();
        int floors = floor - lift.getNowFloor();
        if(up){
            for (int i = 0; i < floors; i++) {
                if (building.getMaxFloor() == lift.getNowFloor())
                    break;
                lift.goUp();
                System.out.println("UP to " + lift.getNowFloor());
            }
            System.out.println("NOW FLOOR IS " + lift.getNowFloor());
        }
        else {
            for (int i = lift.getNowFloor(); i > floor; i--) {
                if (lift.getNowFloor() == building.getMinFloor())
                    break;
                lift.goDown();
                System.out.println("DOWN to " + lift.getNowFloor());

            }
            System.out.println("NOW FLOOR IS " + lift.getNowFloor());
        }
    }
}
