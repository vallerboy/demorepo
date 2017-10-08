package pl.oskarpolak.demorepo.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.oskarpolak.demorepo.models.forms.ReservationForm;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "reservation")
@NoArgsConstructor
public class ReservationModel {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     //@Column(name = "name1")
     private String name;
     private String lastname;
     private Date date;
     private String adres;

     public ReservationModel(ReservationForm form){
          name = form.getName();
          lastname = form.getLastname();
          date = form.getFormatedDate();
          adres = form.getAdres();
     }
}
