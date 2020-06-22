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
@Table(name = "test_patterns")
public class TestPattern extends BaseEntity {
    //Szablon pozycji w testach

    private Integer testNumber;         //liczba porządkowa testu
    @Enumerated(EnumType.ORDINAL)
    private TestSection testSection;    //sekcja testu
    private String testDescription;     //opis testu
    @ManyToOne
    private ProductPattern productPattern;
    @Embedded
    private Audit audit = new Audit();  //Springowy mechanizm trzymania daty utworzenia i edycji

    @Builder
    public TestPattern(Integer id,
                       Integer testNumber,
                       TestSection testSection,
                       String testDescription,
                       ProductPattern productPattern) {
        super(id);
        this.testNumber = testNumber;
        this.testSection = testSection;
        this.testDescription = testDescription;
        this.productPattern = productPattern;
    }
}
