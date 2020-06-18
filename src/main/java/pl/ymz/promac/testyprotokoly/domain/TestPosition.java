package pl.ymz.promac.testyprotokoly.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tests")
public class TestPosition extends BaseEntity {
    //Pozycja w testach

    private Integer testNumber;     //liczba porządkowa testu
    @Enumerated(EnumType.ORDINAL)
    private TestSection testSection;//sekcja testu
    private String testDescription; //opis testu
    private Boolean testResult;     //wynik testu
    private String comments;        //uwagi do testu
    @ManyToOne
    private Product product;

    @Builder
    public TestPosition(Integer id, Integer testNumber, TestSection testSection,
                        String testDescription, Boolean testResult, String comments,
                        Product product) {
        super(id);
        this.testNumber = testNumber;
        this.testSection = testSection;
        this.testDescription = testDescription;
        this.testResult = testResult;
        this.comments = comments;
        this.product = product;
    }
}
