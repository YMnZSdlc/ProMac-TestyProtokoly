package pl.ymz.promac.testyprotokoly.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    //Przetestowany produkt, moduł

    @NotBlank(message = "Numer seryjny jest wymagany.")
    private String serialNo;           //numer seryjny produktu ze zlecenia.
    @NotBlank(message = "Typ modułu/produktu jest wymagany.")
    private String type;         //typ modułu np. UPL710-2-63-ISO-12-B16.
    private String symbol;       //oznaczenie rozdzielnicy, jeśli istnieje.
    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Element> elements;     //lista elementów
    @OneToMany
    @JoinColumn(name = "product_id")
    private List<TestPosition> tests;   //lista testów dla danego produktu
    @ManyToOne
    private Instrument instrument;
    @ManyToOne
    private Worker worker;              //osoba testująca produkt
    private LocalDate testDate;         //data wykonania testu
    @Embedded
    private Audit audit = new Audit();  //Springowy mechanizm trzymania daty utworzenia i edycji

    @Builder
    public Product(Integer id,
                   String serialNo,
                   String type,
                   String symbol,
                   List<Element> elements,
                   List<TestPosition> tests,
                   Worker worker,
                   LocalDate testDate) {
        super(id);
        this.serialNo = serialNo;
        this.type = type;
        this.symbol = symbol;
        this.elements = elements;
        this.tests = tests;
        this.worker = worker;
        this.testDate = testDate;
    }
}
