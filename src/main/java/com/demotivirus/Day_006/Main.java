package com.demotivirus.Day_006;

public class Main {
    public static void main(String[] args) {
        testDoubleList();
        testBuildingAndLift();
    }

    private static void testDoubleList(){
        DoubleList<String, Integer> doubleList = new DoubleList<>();
        //doubleList.setList1(new ArrayList<>());
        //doubleList.setList2(new ArrayList<>());
        doubleList.addList1("Hello");
        doubleList.addList2(88);
        doubleList.addList2(78);
        System.out.println(doubleList.getList1("Hello") + ", " + doubleList.getList2(78));

        doubleList.add("My money", 6000);
        System.out.println(doubleList);
        System.out.println(doubleList.getForKey("My money"));
    }

    private static void testBuildingAndLift(){
        //Lift lift = new SimpleLift();
        //Building building = new ConcreteBuilding(10, lift);
        //System.out.println(building);

//        building.goToTheMaxFloor();
//        System.out.println(lift.getNowFloor());
//        building.goDown();
//        System.out.println(lift.getNowFloor());
//        for (int i = 0; i < 5; i++) {
//            building.goDown();
//        }
//        System.out.println(building.getLift().getNowFloor());
//        building.goUp();
        //System.out.println(building);

        Building building = new ConcreteBuilding(10, -3);
        Lift lift = new SimpleLift();
        LiftDispatcher liftDispatcher = new LiftDispatcher(building, lift);
        System.out.println(building);
        System.out.println(liftDispatcher);
        System.out.println(lift);

        for (int i = 0; i < 5; i++) {
            liftDispatcher.goDown();
        }
        System.out.println(liftDispatcher);
        for (int i = 0; i < 15; i++) {
            liftDispatcher.goDown();
            System.out.println(liftDispatcher);
        }

        for (int i = 0; i < 20; i++) {
            liftDispatcher.goUp();
            System.out.println(liftDispatcher);
        }
        for (int i = 0; i < 5; i++) {
            liftDispatcher.goDown();
        }

        liftDispatcher.goToFloor(8);
        liftDispatcher.goToFloor(1);
        liftDispatcher.goToFloor(-6);
        liftDispatcher.goToFloor(20);
    }
}
