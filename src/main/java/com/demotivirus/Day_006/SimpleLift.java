package com.demotivirus.Day_006;

import lombok.Data;

@Data
public class SimpleLift implements Lift{
    private int nowFloor;

    @Override
    public void setFloor(int floor) {
        this.nowFloor = floor;
    }

    @Override
    public int getNowFloor() {
        return nowFloor;
    }

    @Override
    public void goDown() {
        nowFloor--;
    }

    @Override
    public void goUp() {
        nowFloor++;
    }
}
