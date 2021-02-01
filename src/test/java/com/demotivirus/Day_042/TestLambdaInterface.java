package com.demotivirus.Day_042;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLambdaInterface {
    @Test
    public void testLambdaInterface(){
        LambdaInterface reversed = (str) -> {
            String res = "";
            for (int i = str.length()-1; i >= 0; i--){
                res += str.charAt(i);
            }
            return res;
        };

        Assertions.assertEquals("adbmaL", reversed.reverse("Lambda"));
    }
}
