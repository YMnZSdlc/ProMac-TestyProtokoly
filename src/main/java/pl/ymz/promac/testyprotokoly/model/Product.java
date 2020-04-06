package pl.ymz.promac.testyprotokoly.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
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
    private List<Element> elements;     //lista elementów

    @OneToMany
    private List<TestPosition> tests;   //lista testów
    private Long userId;                //osoba testująca produkt
    private Date testDate;              //data wykonania testu
}
