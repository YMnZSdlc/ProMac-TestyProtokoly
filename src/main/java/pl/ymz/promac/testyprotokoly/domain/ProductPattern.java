package pl.ymz.promac.testyprotokoly.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product_patterns")
public class ProductPattern extends BaseEntity {
    //Pusty szablon produktu danego typu do przetworzenia w produkt

    @NotBlank(message = "Typ modułu/produktu jest wymagany.")
    private String productType;                     //typ modułu np. UPL710-2-63-ISO-12-B16.
    @OneToMany
    @JoinColumn(name = "product_pattern_id")
    private List<ElementPattern> elementPatterns;   //lista elementów
    @OneToMany
    @JoinColumn(name = "product_pattern_id")
    private List<TestPattern> testPatterns;         //lista testów dla danego produktu
    @Embedded
    private Audit audit = new Audit();              //Springowy mechanizm trzymania daty utworzenia i edycji

    @Builder
    public ProductPattern(Integer id,
                          String productType,
                          List<ElementPattern> elementPatterns,
                          List<TestPattern> testPatterns) {
        super(id);
        this.productType = productType;
        this.elementPatterns = elementPatterns;
        this.testPatterns = testPatterns;
    }
}
