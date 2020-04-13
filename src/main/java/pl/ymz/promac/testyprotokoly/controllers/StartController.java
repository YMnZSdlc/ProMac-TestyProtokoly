package pl.ymz.promac.testyprotokoly.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ymz.promac.testyprotokoly.repositories.ElementRepository;
import pl.ymz.promac.testyprotokoly.repositories.ProductRepository;
import pl.ymz.promac.testyprotokoly.repositories.TestPositionRepository;
import pl.ymz.promac.testyprotokoly.repositories.UserRepository;

@Controller
public class StartController {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final ElementRepository elementRepository;
    private final TestPositionRepository testPositionRepository;


    public StartController(UserRepository userRepository, ProductRepository productRepository,
                           ElementRepository elementRepository, TestPositionRepository testPositionRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.elementRepository = elementRepository;
        this.testPositionRepository = testPositionRepository;
    }

    @RequestMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("products", productRepository.findAll());
        model.addAttribute("elements", elementRepository.findAll());
        model.addAttribute("tests", testPositionRepository.findAll());
        return "index";
    }

}
