package com.demotivirus.Day_040.testOpenConsoleFiles;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OpenConsole {
    public static void main(String[] args) {
        String path = "..\\.\\365_Days_Challenge_Five_Classes_Every_Single_Day" +
                "\\365_Days_Challenge_Five_Classes_Every_Single_Day" +
                "\\src\\main\\java\\com\\demotivirus\\Day_040\\dir.bat";

        File file = new File(path);
        Desktop desktop = Desktop.getDesktop();

        System.out.println(file.exists());
        if (file.exists()) {
            try {
                desktop.open(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
