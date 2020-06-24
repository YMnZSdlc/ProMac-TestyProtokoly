package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ymz.promac.testyprotokoly.domain.ElementPattern;

@Repository
public interface ElementPatternRepository extends JpaRepository<ElementPattern, Integer> {
}
