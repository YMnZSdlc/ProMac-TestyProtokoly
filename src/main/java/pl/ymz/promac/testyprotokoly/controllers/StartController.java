package pl.ymz.promac.testyprotokoly.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.ymz.promac.testyprotokoly.repositories.ElementRepository;
import pl.ymz.promac.testyprotokoly.repositories.ProductRepository;
import pl.ymz.promac.testyprotokoly.repositories.TestPositionRepository;
import pl.ymz.promac.testyprotokoly.repositories.WorkerRepository;

@Controller
@RequestMapping("/all")
class StartController {

    public static final Logger logger = LoggerFactory.getLogger(StartController.class);
    private final WorkerRepository workerRepository;
    private final ProductRepository productRepository;
    private final ElementRepository elementRepository;
    private final TestPositionRepository testPositionRepository;


    public StartController(WorkerRepository workerRepository, ProductRepository productRepository,
                           ElementRepository elementRepository, TestPositionRepository testPositionRepository) {
        this.workerRepository = workerRepository;
        this.productRepository = productRepository;
        this.elementRepository = elementRepository;
        this.testPositionRepository = testPositionRepository;
    }

    @GetMapping
    public String getUsers(Model model) {
        logger.info("Get all things from bootstrap");
        model.addAttribute("workers", workerRepository.findAll());
        model.addAttribute("products", productRepository.findAll());
        model.addAttribute("elements", elementRepository.findAll());
        model.addAttribute("tests", testPositionRepository.findAll());
        return "index";
    }

//    @GetMapping(path = "/prod")
//    ResponseEntity<?> getAllProducts(){
//        logger.warn("Nie wiem ale ostrzegam");
//        return ResponseEntity.ok(productRepository.findAll());
//    }

}
