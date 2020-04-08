package pl.ymz.promac.testyprotokoly.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ymz.promac.testyprotokoly.repositories.UserRepository;

@Controller
public class StartController {

    private final UserRepository userRepository;

    public StartController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());

        return "index";
    }

}
