package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.ymz.promac.testyprotokoly.domain.Element;

public interface ElementRepository extends CrudRepository<Element, Integer> {
}
