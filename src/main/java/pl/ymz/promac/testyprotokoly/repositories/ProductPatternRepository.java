package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ymz.promac.testyprotokoly.domain.ProductPattern;

@Repository
public interface ProductPatternRepository extends JpaRepository<ProductPattern, Integer> {
}
