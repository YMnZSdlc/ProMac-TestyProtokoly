package pl.ymz.promac.testyprotokoly.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Product extends BaseEntity {
    //Przetestowany produkt, moduł

    private String productSN;       //numer seryjny produktu ze zlecenia
    private String productName;     //typ modułu np UPL710-2-63-ISO-12-B16
    private String productSymbol;   //oznaczenie rozdzielnicy jeśli istnieje
    private List<Element> elements; //lista elementów
    private Long userId;            //osoba testująca produkt
}
