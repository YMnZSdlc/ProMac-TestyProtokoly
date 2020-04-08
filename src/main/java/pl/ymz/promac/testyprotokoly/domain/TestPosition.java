package pl.ymz.promac.testyprotokoly.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
//@Entity
public class TestPosition {
    //Pozycja w testach

    private Integer testNumber;     //liczba porządkowa testu
//    @Enumerated (EnumType.ORDINAL)
    private TestSection testSection;//sekcja testu
    private String testDescription; //opis testu
    private Boolean testResult;     //wynik testu
    private String comments;        //uwagi do testu
}
