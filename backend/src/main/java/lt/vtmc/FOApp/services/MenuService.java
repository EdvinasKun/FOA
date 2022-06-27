package lt.vtmc.FOApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import lt.vtmc.FOApp.models.Dish;
//import lt.vtmc.FOApp.models.Institution;
import lt.vtmc.FOApp.models.Menu;
import lt.vtmc.FOApp.payload.requests.MenuInsertRequest;
import lt.vtmc.FOApp.payload.responses.MenuResponse;
import lt.vtmc.FOApp.repositories.InstitutionRepository;
import lt.vtmc.FOApp.repositories.MenuRepository;

@Service
public class MenuService {
	
	private MenuRepository menuRepository;
	private InstitutionRepository institutionRepository;
	
	@Autowired
	public MenuService(MenuRepository menuRepository, InstitutionRepository institutionRepository) {
		this.menuRepository = menuRepository;
		this.institutionRepository = institutionRepository;
	}

	public MenuResponse insertMenu(MenuInsertRequest menuRequest) {
		Menu menu = new Menu(
				);
		
		menu.setMenuName(menuRequest.getMenuName());
		menu.setInstitution(institutionRepository.getById(menuRequest.getInstitutionId()));
		menuRepository.save(menu);
		
		return new MenuResponse(
				menu.getMenuId(),
				menuRequest.getMenuName(),
				menu.getInstitution().getBusinessName()
				);
	}
	
	public List<Menu> getAllMenu(){
		return this.menuRepository.findAll();
		
	}
	
}
