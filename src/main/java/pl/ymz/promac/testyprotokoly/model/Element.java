package pl.ymz.promac.testyprotokoly.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Element extends BaseEntity {
    //Spisywany element składowy produktu

    private String elementName;     //typ elementu np EDS150
    private String elementSymbol;   //symbol w module np. N2, Q1, D1
    private String elementSN;       //numer seryjny elementu
}
