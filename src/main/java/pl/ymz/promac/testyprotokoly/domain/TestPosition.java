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
@Table(name = "test_positions")
public class TestPosition extends BaseEntity {
    //Pozycja w testach

    private Integer orderNo;     //liczba porządkowa testu
    @Enumerated(EnumType.ORDINAL)
    private TestSection section;//sekcja testu
    private String description; //opis testu
    private Boolean result;     //wynik testu
    private String comments;        //uwagi do testu
    @ManyToOne
    private Product product;

    @Builder
    public TestPosition(Integer id, Integer orderNo, TestSection section,
                        String description, Boolean result, String comments,
                        Product product) {
        super(id);
        this.orderNo = orderNo;
        this.section = section;
        this.description = description;
        this.result = result;
        this.comments = comments;
        this.product = product;
    }
}
