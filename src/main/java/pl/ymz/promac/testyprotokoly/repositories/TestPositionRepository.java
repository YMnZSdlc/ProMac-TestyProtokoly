package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.ymz.promac.testyprotokoly.domain.TestPosition;

public interface TestPositionRepository extends CrudRepository<TestPosition, Integer> {
}
