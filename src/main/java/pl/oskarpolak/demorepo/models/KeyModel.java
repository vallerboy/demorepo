package pl.oskarpolak.demorepo.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "key")
public class KeyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String key;
    private int counter;
}
