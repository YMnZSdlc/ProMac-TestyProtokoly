package pl.ymz.promac.testyprotokoly.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TestPosition extends BaseEntity {
    //Pozycja w testach


    private String testDescription; //opis testu
    private Boolean testResult;     //wynik testu
    private String comments;        //uwagi do testu
}
