package com.demotivirus.Day_020;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Controller {
    public static void start(String className) {
        System.out.println("@RequestMapping()\n" +
                "public class " +
                className.substring(0, 1).toUpperCase().concat(className.substring(1, className.trim().length())) +
                "Controller {\n" +
                "    @GetMapping(\"\")\n" +
                "    public String startPage(){\n" +
                "        return \"index\";\n" +
                "    }\n" +
                "}");
    }
}
