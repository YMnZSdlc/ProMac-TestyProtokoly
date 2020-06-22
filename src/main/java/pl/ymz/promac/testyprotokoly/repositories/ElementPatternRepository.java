package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ymz.promac.testyprotokoly.domain.ElementPattern;

public interface ElementPatternRepository extends JpaRepository<ElementPattern, Integer> {
}
