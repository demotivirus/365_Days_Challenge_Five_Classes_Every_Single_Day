package com.demotivirus.Day_047_Dictionary.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eng_phrases")
@Data
@RequiredArgsConstructor
public class EngPhrases {
    @Id
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    @JoinColumn(name = "eng_id")
    private Eng engId;

    @Column(name = "phrase")
    private String phrase;
}
