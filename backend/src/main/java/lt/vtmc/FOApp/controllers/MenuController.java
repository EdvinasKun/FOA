package lt.vtmc.FOApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lt.vtmc.FOApp.models.Menu;
import lt.vtmc.FOApp.payload.requests.MenuInsertRequest;
import lt.vtmc.FOApp.payload.responses.MenuResponse;
import lt.vtmc.FOApp.services.MenuService;

@CrossOrigin
@RestController
@RequestMapping("api/institutions/menus")
public class MenuController {
	
	private MenuService menuService;
	
	@Autowired
	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@ResponseStatus(HttpStatus.CREATED)
	public MenuResponse insertMenu(@Valid @RequestBody MenuInsertRequest menuRequest) {
		return this.menuService.insertMenu(menuRequest);
	}
	
	@GetMapping
	public List<Menu> getAllMenu(){
		return this.menuService.getAllMenu();
	}

}
