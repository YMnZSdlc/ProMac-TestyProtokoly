package pl.ymz.promac.testyprotokoly.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "element_patterns")
public class ElementPattern extends BaseEntity {
    //Spisywany element składowy produktu

    @NotBlank(message = "Typ elementu jest wymagany.")
    private String elementType;             //typ elementu np EDS150
    @ManyToOne
    private ProductPattern productPattern;  //Produkt ma wiele elementów składowych

    @Builder
    public ElementPattern(Integer id,
                          String elementType,
                          ProductPattern productPattern) {
        super(id);
        this.elementType = elementType;
        this.productPattern = productPattern;
    }
}
