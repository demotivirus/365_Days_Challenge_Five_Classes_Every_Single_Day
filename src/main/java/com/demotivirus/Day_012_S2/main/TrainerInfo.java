package com.demotivirus.Day_012_S2.main;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trainer_info")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class TrainerInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(mappedBy = "trainerInfo",
            cascade = {
                    CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST
            })
    private Trainer trainer;

    @NonNull
    @Column(name = "power")
    private Integer power;

    @NonNull
    @Column(name = "hobby")
    private String hobby;

    @Override
    public String toString() {
        return "TrainerInfo{" +
                "id=" + id +
                ", power=" + power +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
