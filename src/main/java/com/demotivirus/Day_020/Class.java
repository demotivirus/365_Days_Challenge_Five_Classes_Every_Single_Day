package com.demotivirus.Day_020;

import java.util.Scanner;

public class Class {
    public static void start(String className, Scanner scn) {
        String field = null;
        if (scn.hasNext())
            field = scn.nextLine();
        System.out.println("import lombok.Data;\n" +
                "import lombok.NonNull;\n" +
                "import lombok.RequiredArgsConstructor;\n" +
                "\n" +
                "@Data\n" +
                "@RequiredArgsConstructor\n" +
                "public class " +
                className.substring(0, 1).toUpperCase().concat(className.substring(1, className.trim().length())) +
                "{\n" +
                "    @NonNull\n" +
                "   " + field +
                ";\n" +
                "}");
    }
}
