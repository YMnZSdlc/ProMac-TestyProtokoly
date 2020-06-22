package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ymz.promac.testyprotokoly.domain.ProductPattern;

public interface ProductPatternRepository extends JpaRepository<ProductPattern, Integer> {
}
