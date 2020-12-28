package com.demotivirus.Day_007;

import lombok.Data;

@Data
public class Chat {
    private String comment;

    public void printComment(User user, String comment){
        this.comment = comment;
        System.out.println(user + ": " + comment);
    }
}
