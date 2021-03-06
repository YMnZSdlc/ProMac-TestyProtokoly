package pl.ymz.promac.testyprotokoly.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ymz.promac.testyprotokoly.domain.Instrument;
import pl.ymz.promac.testyprotokoly.repositories.InstrumentRepository;

@Controller
@RequestMapping("/instrument")
public class InstrumentController {

    public static final Logger logger = LoggerFactory.getLogger(InstrumentController.class);
    private final InstrumentRepository instrumentRepository;

    public InstrumentController(InstrumentRepository instrumentRepository) {
        this.instrumentRepository = instrumentRepository;
    }

    @GetMapping
    public String getDevices (Model model){
        logger.info("Pobranie listy urządzeń pomiarowych");
        model.addAttribute("instruments", instrumentRepository.findAll());
        return "instrument/main";
    }

    @GetMapping("/new")
    public String newInstrument (Model model){
        logger.info("Tworzenie urządzenia pomiarowego. Dodanie do modelu");
        model.addAttribute("instrument", new Instrument());
        return "instrument/create";
    }

//    @GetMapping("/edit")
//    public String editInstrument (Model model){
//        logger.info("Edycja urządzenia pomiarowego");
//        model.addAttribute("instrument", instrumentRepository.existsById());
//        return "instrument/create";
//    }

    @PostMapping
    public String addInstrument (@ModelAttribute("instrument") Instrument instrument,
                             Model model){
        logger.warn("Próba dodania urządzenia pomiarowego");
        instrumentRepository.save(instrument);
        model.addAttribute("message", "Dodano urządzenie pomiarowe");
        model.addAttribute("instruments", instrumentRepository.findAll());
        return "instrument/main";
    }


}
