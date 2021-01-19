package com.demotivirus.Day_029;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor
@RequiredArgsConstructor
public class Sleep {
    @NonNull
    private Human human;

    public void sleep(){
        human.setStatus("sleep");
    }

    public void wakeUp(){
        human.setStatus("wake up");
    }
}
