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
    private String type;     //typ elementu np EDS150
    private String symbol;   //symbol w module np. N2, Q1, D1
    @NotBlank(message = "Numer seryjny jest wymagany.")
    private String serialNo;       //numer seryjny elementu
    @ManyToOne
    private Product product;        //Produkt ma wiele elementów składowych.

    @Builder
    public Element(Integer id,
                   String type,
                   String symbol,
                   String serialNo,
                   Product product) {
        super(id);
        this.type = type;
        this.symbol = symbol;
        this.serialNo = serialNo;
        this.product = product;
    }
}
