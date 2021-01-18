package com.demotivirus.Day_028;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Human extends Person{
    private Message message;
    private List<Friend> friends;

    public Human(){
        message = new Message();
        friends = new ArrayList<>();
    }

    public Human(@NonNull String name) {
        super(name);
        message = new Message();
        friends = new ArrayList<>();
    }

    public void sendMessage(String text){
        message.setText(text);
        System.out.println(this + " send message: " + message.getText());
    }

    public void addFriend(Friend friend){
        friends.add(friend);
    }

    public Friend getFriend(String friend){
        Friend searchFriend = null;
        for (Friend f : friends){
            if (f.getName().equals(friend))
                return f;
        }
        return searchFriend;
    }
}
