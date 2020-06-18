package pl.ymz.promac.testyprotokoly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.ymz.promac.testyprotokoly.domain.Worker;

@RepositoryRestResource
public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
