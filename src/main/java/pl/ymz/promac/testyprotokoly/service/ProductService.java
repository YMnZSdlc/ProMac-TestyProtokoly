package pl.ymz.promac.testyprotokoly.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.ymz.promac.testyprotokoly.domain.Product;

public interface ProductService {

    public Page<Product> findAllProduct (Pageable pageable);

}
