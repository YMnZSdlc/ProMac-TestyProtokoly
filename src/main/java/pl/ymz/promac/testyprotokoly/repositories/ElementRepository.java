package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.ymz.promac.testyprotokoly.domain.Element;

@Repository
public interface ElementRepository extends JpaRepository<Element, Integer> {
}
