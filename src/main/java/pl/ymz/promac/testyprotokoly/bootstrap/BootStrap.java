package pl.ymz.promac.testyprotokoly.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.ymz.promac.testyprotokoly.domain.Element;
import pl.ymz.promac.testyprotokoly.domain.Product;
import pl.ymz.promac.testyprotokoly.domain.User;
import pl.ymz.promac.testyprotokoly.repositories.ElementRepository;
import pl.ymz.promac.testyprotokoly.repositories.ProductRepository;
import pl.ymz.promac.testyprotokoly.repositories.TestPositionRepository;
import pl.ymz.promac.testyprotokoly.repositories.UserRepository;

import java.time.LocalDate;
import java.util.Date;

@Component
public class BootStrap implements CommandLineRunner {

    private final ElementRepository elementRepository;
    private final ProductRepository productRepository;
    private final TestPositionRepository testPositionRepository;
    private final UserRepository userRepository;

    public BootStrap(ElementRepository elementRepository, ProductRepository productRepository,
                     TestPositionRepository testPositionRepository, UserRepository userRepository) {
        this.elementRepository = elementRepository;
        this.productRepository = productRepository;
        this.testPositionRepository = testPositionRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start ładowania danych z bootstrap do H2");

        User grzegorz = new User();
        grzegorz.setFirstName("Grzegorz");
        grzegorz.setLastName("Marciniak");
        grzegorz.setLogin("Grześ");
        grzegorz.setAdmin(false);
        grzegorz.setTester(true);

        userRepository.save(grzegorz);

        userRepository.save(User.builder()
                .firstName("YoMan")
                .lastName("ZSiedlc")
                .login("YMZ")
                .pass("gg")
                .admin(true)
                .tester(true).build());

        System.out.println("Użytkownicy załadowani");

        productRepository.save(Product.builder()
                .productSN("2002016")
                .productType("UPL710-2-63-ISO-BP-12-B16")
                .productSymbol("TIT-3")
                .testDate(LocalDate.now())
                .build());

        elementRepository.save(Element.builder()
                .elementType("ATiCS-2-63-ISO")
                .elementSymbol("Q1")
                .elementSN("1909502928")
                .build());
        elementRepository.save(Element.builder()
                .elementType("ED151")
                .elementSymbol("N1")
                .elementSN("1910515741")
                .build());
        elementRepository.save(Element.builder()
                .elementType("ED151")
                .elementSymbol("N2")
                .elementSN("1910515742")
                .build());
        elementRepository.save(Element.builder()
                .elementType("RCMS150")
                .elementSymbol("N3")
                .elementSN("1910515743")
                .build());
        elementRepository.save(Element.builder()
                .elementType("COM465IP")
                .elementSymbol("D1")
                .elementSN("1910515465")
                .build());

    }
}
