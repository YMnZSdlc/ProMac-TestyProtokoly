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

    private Integer orderNo;         //liczba porządkowa testu
    @Enumerated(EnumType.ORDINAL)
    private TestSection section;    //sekcja testu
    private String description;     //opis testu
    @ManyToOne
    private ProductPattern productPattern;
    @Embedded
    private Audit audit = new Audit();  //Springowy mechanizm trzymania daty utworzenia i edycji

    @Builder
    public TestPattern(Integer id,
                       Integer orderNo,
                       TestSection section,
                       String description,
                       ProductPattern productPattern) {
        super(id);
        this.orderNo = orderNo;
        this.section = section;
        this.description = description;
        this.productPattern = productPattern;
    }
}
