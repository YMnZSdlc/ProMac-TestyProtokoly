package pl.ymz.promac.testyprotokoly.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class TestPosition extends BaseEntity {
    //Pozycja w testach

    private Integer testNumber;     //liczba porządkowa testu
    private TestSection testSection;//sekcja testu
    private String testDescription; //opis testu
    private Boolean testResult;     //wynik testu
    private String comments;        //uwagi do testu
}
