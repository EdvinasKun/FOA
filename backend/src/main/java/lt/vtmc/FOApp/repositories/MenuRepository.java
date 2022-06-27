package lt.vtmc.FOApp.repositories;

import lt.vtmc.FOApp.models.Menu;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

	Optional<Menu> findByMenuName(String menuName);
	
}
