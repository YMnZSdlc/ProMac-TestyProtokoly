package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.ymz.promac.testyprotokoly.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
