package com.demotivirus.Day_040.testSmthngGenerators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    private List<Integer> numbers = new ArrayList<>();

    public void generation(int nums){
        Random random = new Random();
        while (nums > 0){
//            try {
//                Thread.sleep(random.nextInt(1000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            this.numbers.add(random.nextInt(1_000_000));
            nums--;
        }
    }

    public void printNumbers(){
        System.out.println(Arrays.asList(numbers));
    }

    public void checkAndPrintNumbers(long milliseconds){
        while (milliseconds > 0){
            printNumbers();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            milliseconds -= 1000;
        }
    }
}
