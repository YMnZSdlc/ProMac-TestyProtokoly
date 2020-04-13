package pl.ymz.promac.testyprotokoly.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.ymz.promac.testyprotokoly.domain.*;
import pl.ymz.promac.testyprotokoly.repositories.ElementRepository;
import pl.ymz.promac.testyprotokoly.repositories.ProductRepository;
import pl.ymz.promac.testyprotokoly.repositories.TestPositionRepository;
import pl.ymz.promac.testyprotokoly.repositories.UserRepository;

import java.time.LocalDate;

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

        User user1 = new User().builder()
                .firstName("Grzegorz")
                .lastName("Marciniak")
                .login("MarcG")
                .admin(false)
                .tester(true)
                .build();
        User user2 = new User().builder()
                .firstName("YoMan")
                .lastName("ZSiedlc")
                .login("YMZ")
                .pass("gg")
                .admin(true)
                .tester(true).build();

        Product upl1 = new Product().builder()
                .productSN("2002016")
                .productType("UPL710-2-63-ISO-BP-12-B16")
                .productSymbol("TIT-3")
                .testDate(LocalDate.now())
                .build();

        Element atics1 = new Element().builder()
                .elementType("ATiCS-2-63-ISO")
                .elementSymbol("Q1")
                .elementSN("1909502928")
                .build();
        Element eds1 = new Element().builder()
                .elementType("ED151")
                .elementSymbol("N1")
                .elementSN("1910515741")
                .build();
        Element eds2 = new Element().builder()
                .elementType("ED151")
                .elementSymbol("N2")
                .elementSN("1910515742")
                .build();
        Element rcms1 = new Element().builder()
                .elementType("RCMS150")
                .elementSymbol("N3")
                .elementSN("1910515743")
                .build();
        Element com1 = new Element().builder()
                .elementType("COM465IP")
                .elementSymbol("D1")
                .elementSN("1910515465")
                .build();

        TestPosition test1 = new TestPosition().builder()
                .testNumber(1)
                .testSection(TestSection.VISUAL_CHECK)
                .testDescription("Kontrola wizualna")
                .product(upl1)
                .build();

        TestPosition test2 = new TestPosition().builder()
                .testNumber(3)
                .testSection(TestSection.CONTINUITY_CHECK)
                .testDescription("Kontrola ciągłości przewodów")
                .product(upl1)
                .build();

        TestPosition test3 = new TestPosition().builder()
                .testNumber(5)
                .testSection(TestSection.INSULATION_RESISTANCE)
                .testDescription("Pomiar rezystancji izolacji")
                .product(upl1)
                .build();

        TestPosition test4 = new TestPosition().builder()
                .testNumber(7)
                .testSection(TestSection.SPECIFIC_TEST)
                .testDescription("Testy układu właściwe dla typu urządzenia")
                .product(upl1)
                .build();

//        user1.getProducts().add(upl1);
        upl1.setUser(user1);
        atics1.setProduct(upl1);
        eds1.setProduct(upl1);
        eds2.setProduct(upl1);
        rcms1.setProduct(upl1);
        com1.setProduct(upl1);

        test1.setProduct(upl1);
        test2.setProduct(upl1);
        test3.setProduct(upl1);
        test4.setProduct(upl1);

        userRepository.save(user1);
        userRepository.save(user2);

        productRepository.save(upl1);

        elementRepository.save(atics1);
        elementRepository.save(eds1);
        elementRepository.save(eds2);
        elementRepository.save(rcms1);
        elementRepository.save(com1);

        testPositionRepository.save(test1);
        testPositionRepository.save(test2);
        testPositionRepository.save(test3);
        testPositionRepository.save(test4);

        System.out.println("Dane załadowane z bootstrap");
    }
}
