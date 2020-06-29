package pl.ymz.promac.testyprotokoly.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ymz.promac.testyprotokoly.domain.MeasuringDevice;
import pl.ymz.promac.testyprotokoly.repositories.MeasuringDeviceRepository;

@Controller
@RequestMapping("/md")
public class MeasuringDeviceController {

    public static final Logger logger = LoggerFactory.getLogger(MeasuringDeviceController.class);
    private final MeasuringDeviceRepository repository;

    public MeasuringDeviceController(MeasuringDeviceRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getDevices (Model model){
        logger.info("Pobranie listy urządzeń pomiarowych");
        model.addAttribute("devices", repository.findAll());
        model.addAttribute("device", new MeasuringDevice());
        return "device";
    }

    @PostMapping
    public String addDevice (@ModelAttribute("device")MeasuringDevice device,
                             Model model){
        logger.warn("Próba dodania urządzenia pomiarowego");
        repository.save(device);
        model.addAttribute("devices", repository.findAll());
        return "device";
    }


}
