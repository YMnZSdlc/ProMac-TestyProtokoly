package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ymz.promac.testyprotokoly.domain.TestPattern;

public interface TestPatternRepository extends JpaRepository<TestPattern, Integer> {
}
