package pl.oskarpolak.demorepo.models.forms;

import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ReservationForm {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String lastname;
    @Getter
    @Setter
    @Pattern(regexp = "2[0-9]{3}-[0-9][1-9]-[0-9][1-9]")
    private String date;
    @Getter
    @Setter
    private String adres;

    //Stare podejscie do czasu
    //DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    // Nowe podejscie do czasu
    DateTimeFormatter format =  DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public LocalDate getFormatedDate(){
        return LocalDate.parse(date, format);
    }
}
