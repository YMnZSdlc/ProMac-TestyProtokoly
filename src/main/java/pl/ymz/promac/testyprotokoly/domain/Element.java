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
@Table(name = "elements")
public class Element extends BaseEntity {
    //Spisywany element składowy produktu

    @NotBlank(message = "Typ elementu jest wymagany.")
    private String elementType;     //typ elementu np EDS150
    private String elementSymbol;   //symbol w module np. N2, Q1, D1
    @NotBlank(message = "Numer seryjny jest wymagany.")
    private String elementSN;       //numer seryjny elementu
    @ManyToOne
    private Product product;        //Produkt ma wiele elementów składowych.

    @Builder
    public Element(Integer id,
                   String elementType,
                   String elementSymbol,
                   String elementSN,
                   Product product) {
        super(id);
        this.elementType = elementType;
        this.elementSymbol = elementSymbol;
        this.elementSN = elementSN;
        this.product = product;
    }
}
