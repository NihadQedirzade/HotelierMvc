package com.example.hoteliermvc.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rooms")

public class Rooms{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String aboutRoom;
    private Integer numroom ;
    private Double price;
    private String photo;

    @ManyToOne
    private Category category;

}
