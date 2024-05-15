package com.example.CRUDAppliaction.Model;

import io.micrometer.observation.GlobalObservationConvention;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Books")

//Lomboktan geliyor Getter setter constructer yazmaya gerek kalmiyor
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )

    private long id;
    private String title;
    private String author;


}
