package com.demotivirus.Day_031.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "goods")
@Data @NoArgsConstructor
@RequiredArgsConstructor
public class Goods {
    @NonNull
    private int id;

    @NonNull
    private String name;
}
