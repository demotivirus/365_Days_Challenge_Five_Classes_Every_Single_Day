package com.demotivirus.Day_015;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User_Amount {
    @NonNull
    private User user;

    @NonNull
    private Amount amount;
}
