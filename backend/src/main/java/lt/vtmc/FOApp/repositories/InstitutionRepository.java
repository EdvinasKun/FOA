package lt.vtmc.FOApp.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lt.vtmc.FOApp.models.Institution;

@Repository
public interface InstitutionRepository extends JpaRepository<Institution, Long> {
	
	Optional<Institution> findByBusinessName(String businessName);
//	List<Institution> findAll();

}
