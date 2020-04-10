package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.ymz.promac.testyprotokoly.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
