package pl.ymz.promac.testyprotokoly.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product extends BaseEntity {
    //Przetestowany produkt, moduł

    private String productSN;           //numer seryjny produktu ze zlecenia
    private String productType;         //typ modułu np UPL710-2-63-ISO-12-B16
    private String productSymbol;       //oznaczenie rozdzielnicy jeśli istnieje
    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Element> elements;     //lista elementów
    @OneToMany
    @JoinColumn(name = "product_id")
    private List<TestPosition> tests;   //lista testów dla danego produktu
    @ManyToOne
    private User user;                  //osoba testująca produkt
    private LocalDate testDate;              //data wykonania testu

    @Builder
    public Product(Integer id, String productSN, String productType,
                   String productSymbol, List<Element> elements, List<TestPosition> tests,
                   User user, LocalDate testDate) {
        super(id);
        this.productSN = productSN;
        this.productType = productType;
        this.productSymbol = productSymbol;
        this.elements = elements;
        this.tests = tests;
        this.user = user;
        this.testDate = testDate;
    }
}
