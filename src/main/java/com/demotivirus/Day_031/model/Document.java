package com.demotivirus.Day_031.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "document")
@Data @NoArgsConstructor
//@RequiredArgsConstructor
public class Document {
    private int id;
    private String name;
    private List<Goods> goods;
}
