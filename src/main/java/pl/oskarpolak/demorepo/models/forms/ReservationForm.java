package pl.oskarpolak.demorepo.models.forms;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ReservationForm {
    @Getter
    private String name;
    @Getter
    private String lastname;
    private String date;
    @Getter
    private String adres;

    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public Date getDate(){
        //YYYY-MM-DD
        try {
            return new Date(format.parse(date).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
