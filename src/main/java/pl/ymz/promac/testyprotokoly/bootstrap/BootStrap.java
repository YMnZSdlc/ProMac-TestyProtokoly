package pl.ymz.promac.testyprotokoly.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.ymz.promac.testyprotokoly.domain.User;
import pl.ymz.promac.testyprotokoly.repositories.UserRepository;

@Component
public class BootStrap implements CommandLineRunner {

    private final UserRepository userRepository;

    public BootStrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start ładowania danych z bootstrap do H2");

        User grzegorz = new User();
        grzegorz.setFirstName("Grzegorz");
        grzegorz.setLastName("Marciniak");
        grzegorz.setLogin("Grzes");
        grzegorz.setAdmin(false);
        grzegorz.setTester(true);

        userRepository.save(grzegorz);

        userRepository.save(User.builder().firstName("YoMan")
                .lastName("ZSiedlc")
                .login("YMZ")
                .pass("gg")
                .admin(true)
                .tester(true).build());

        System.out.println("Użytkownicy załadowani");
    }
}
