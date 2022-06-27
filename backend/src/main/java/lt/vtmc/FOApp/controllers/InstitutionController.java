package lt.vtmc.FOApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import lt.vtmc.FOApp.models.Institution;
import lt.vtmc.FOApp.payload.requests.*;
import lt.vtmc.FOApp.payload.responses.InstitutionResponse;
import lt.vtmc.FOApp.services.InstitutionService;

@CrossOrigin
@RestController
@RequestMapping("/api/institutions")
public class InstitutionController {

	private InstitutionService institutionService;
	
	public InstitutionController(InstitutionService institutionService) {
		this.institutionService = institutionService;
	}
	
	@PostMapping
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@ResponseStatus(HttpStatus.CREATED)
	public InstitutionResponse addInstitution(@Valid @RequestBody InstitutionInsertRequest institutionRequest) {
		return this.institutionService.saveInstitution(institutionRequest);
	}
	
	@PutMapping("/{insitutionId}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@ResponseStatus(HttpStatus.OK)
	public InstitutionResponse updateInstitution(@Valid @RequestBody InstitutionUpdateRequest institutionRequest) {
		return this.institutionService.updateInstitution(institutionRequest);
	}
	
	
	@DeleteMapping("/{institutionId}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@ResponseStatus(HttpStatus.OK)
	public InstitutionResponse deleteInstitution(@PathVariable Long institutionId) {
		return this.institutionService.deleteInstitution(institutionId);
	}
	
	@GetMapping
	public List<Institution> getAllInstitutions(){
		return this.institutionService.getAllInstitutions();
		
	}
	
}
