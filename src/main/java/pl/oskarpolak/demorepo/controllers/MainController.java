package pl.oskarpolak.demorepo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.demorepo.models.ReservationModel;
import pl.oskarpolak.demorepo.models.forms.ReservationForm;
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
    public String index(Model model){
        model.addAttribute("reservationForm", new ReservationForm());
        return "index";
    }

    @PostMapping("/")
    public String index(@ModelAttribute("reservationForm") ReservationForm form){
        reservationRepository.save(new ReservationModel(form));
        return "index";
    }
}
