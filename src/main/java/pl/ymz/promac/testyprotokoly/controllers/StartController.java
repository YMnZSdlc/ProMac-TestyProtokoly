package pl.ymz.promac.testyprotokoly.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ymz.promac.testyprotokoly.repositories.ElementRepository;
import pl.ymz.promac.testyprotokoly.repositories.UserRepository;

@Controller
public class StartController {

    private final UserRepository userRepository;
    private final ElementRepository elementRepository;

    public StartController(UserRepository userRepository, ElementRepository elementRepository) {
        this.userRepository = userRepository;
        this.elementRepository = elementRepository;
    }

    @RequestMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("elements", elementRepository.findAll());

        return "index";
    }

}
