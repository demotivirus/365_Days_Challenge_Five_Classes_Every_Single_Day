package com.demotivirus.Day_035.main;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor
@RequiredArgsConstructor
public class Roles {
    int id;
    @NonNull
    String roleName;
}
