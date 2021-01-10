package com.demotivirus.Day_020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===CLASS GEN===");
        System.out.println("EXAMPLE: class MyClass String text, String pass");
        System.out.print("Input your text: ");
        String str = null;
        while (scanner.hasNext()){
            str = scanner.next();
            switch (str){
                case "controller":
                    str = scanner.next();
                    Controller.start(str); break;
                case "class":
                    str = scanner.next();
                    Class.start(str, scanner); break;
                case "main":
                    System.out.println("public class Main {\n" +
                            "    public static void main(String[] args) {\n" +
                            "        \n" +
                            "    }\n" +
                            "}"); break;
                default:
                    System.out.println("START AGAIN");
            }
        }
    }
}
