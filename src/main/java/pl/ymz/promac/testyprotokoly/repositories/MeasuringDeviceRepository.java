package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ymz.promac.testyprotokoly.domain.MeasuringDevice;

public interface MeasuringDeviceRepository extends JpaRepository<MeasuringDevice, Integer> {
}
