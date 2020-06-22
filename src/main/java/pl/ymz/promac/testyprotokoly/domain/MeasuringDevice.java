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
@Table(name = "measuring_devices")
public class MeasuringDevice extends BaseEntity {
    //Urządzenie pomiarowe

    @NotBlank(message = "Nazwa przyrządu jet wymagana")
    private String nameMD;          //Nazwa przyrządu pomiarowego.
    @NotBlank(message = "Nazwa producenta przyrządu jest wymagana")
    private String producerMD;      //Producent przyrządu pomiarowego.
    @NotBlank(message = "Typ przyrządu jest wymagany")
    private String typeMD;          //Typ przyrządu pomiarowego.
    @NotBlank(message = "Numer seryjny przyrządu jest wymagany")
    private String serialMD;        //Numer fabryczny/seryjny przyrządu pomiarowego.
    @OneToMany
    @JoinColumn(name = "measuring_device_id")
    private List<Product> products; //lista produktów testowana przez urządzenie

    @Builder
    public MeasuringDevice(Integer id,
                           String nameMD,
                           String producerMD,
                           String typeMD,
                           String serialMD) {
        super(id);
        this.nameMD = nameMD;
        this.producerMD = producerMD;
        this.typeMD = typeMD;
        this.serialMD = serialMD;
    }
}
