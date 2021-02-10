package insea.soa.mdepartement.mdepartement.repo;

import insea.soa.mdepartement.mdepartement.model.*;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DepartementRepo extends CrudRepository<Departement, Long> {
    Optional<Departement> findByReference(String reference);
    Optional<Departement> findByNom(String nom);
}
