package pl.ymz.promac.testyprotokoly.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Setter
//@Entity
public class Element {
    //Spisywany element składowy produktu

    private String elementType;     //typ elementu np EDS150
    private String elementSymbol;   //symbol w module np. N2, Q1, D1
    private String elementSN;       //numer seryjny elementu
}
