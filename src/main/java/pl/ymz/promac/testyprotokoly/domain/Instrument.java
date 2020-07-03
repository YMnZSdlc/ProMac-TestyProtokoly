package pl.ymz.promac.testyprotokoly.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "instruments")
public class Instrument extends BaseEntity {
    //Urządzenie pomiarowe

    @NotBlank(message = "Nazwa przyrządu jet wymagana")
    private String name;          //Nazwa przyrządu pomiarowego.
    @NotBlank(message = "Nazwa producenta przyrządu jest wymagana")
    private String producer;      //Producent przyrządu pomiarowego.
    @NotBlank(message = "Typ przyrządu jest wymagany")
    private String type;          //Typ przyrządu pomiarowego.
    @NotBlank(message = "Numer seryjny przyrządu jest wymagany")
    private String serialNo;        //Numer fabryczny/seryjny przyrządu pomiarowego.
    @OneToMany
    @JoinColumn(name = "instruments_id")
    private List<Product> products; //lista produktów testowana przez urządzenie

    @Builder
    public Instrument(Integer id,
                      String name,
                      String producer,
                      String type,
                      String serialNo) {
        super(id);
        this.name = name;
        this.producer = producer;
        this.type = type;
        this.serialNo = serialNo;
    }
}
