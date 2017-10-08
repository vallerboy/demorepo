package pl.oskarpolak.demorepo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.demorepo.models.ReservationModel;
import pl.oskarpolak.demorepo.models.repositories.ReservationRepository;
import pl.oskarpolak.demorepo.models.services.StringService;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.Calendar;

@Controller
public class MainController {

    @Autowired
    StringService stringService;

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/")
    @ResponseBody
    public String index(){
        // w tym miejscu bedziemy sobie reecznie zapisywac cos do tabeli (encji)
        ReservationModel model = new ReservationModel();
        model.setAdres("Kraków Rynek");
        model.setDate(new Date(Calendar.getInstance().getTimeInMillis()));
        model.setLastname("Polak");
        model.setName("Oskar");

        reservationRepository.save(model);

        return "Hej, zapisałem dane";
    }
}
