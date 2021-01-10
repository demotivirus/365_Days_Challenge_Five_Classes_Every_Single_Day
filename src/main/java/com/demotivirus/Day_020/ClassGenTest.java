package com.demotivirus.Day_020;

import java.util.Scanner;

public class ClassGenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        if(scanner.hasNextLine())
            str = scanner.nextLine();

        switch (str){
            case "controller" :
                System.out.println("@RequestMapping(\"admin\")\n" +
                        "public class Controller {\n" +
                        "    @GetMapping(\"\")\n" +
                        "    public String startPage(){\n" +
                        "        return \"index\";\n" +
                        "    }\n" +
                        "}"); break;
            case "controller: admin" :
                System.out.println("@RequestMapping(\"admin\")\n" +
                        "public class AdminController {\n" +
                        "    @GetMapping(\"\")\n" +
                        "    public String adminStartPage(){\n" +
                        "        return \"admin-index\";\n" +
                        "    }\n" +
                        "}"); break;
            case "main":
                System.out.println("public class Main {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        \n" +
                        "    }\n" +
                        "}"); break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
