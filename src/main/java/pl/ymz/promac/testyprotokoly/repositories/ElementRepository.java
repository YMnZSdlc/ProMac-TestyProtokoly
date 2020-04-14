package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.ymz.promac.testyprotokoly.domain.Element;

@RepositoryRestResource
public interface ElementRepository extends JpaRepository<Element, Integer> {
}
