package pl.oskarpolak.demorepo.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "keymodel")
public class KeyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String text;
    private int counter;
}
