package lt.vtmc.FOApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.vtmc.FOApp.models.Institution;
import lt.vtmc.FOApp.payload.requests.InstitutionInsertRequest;
import lt.vtmc.FOApp.payload.requests.InstitutionUpdateRequest;
import lt.vtmc.FOApp.payload.responses.InstitutionResponse;
import lt.vtmc.FOApp.repositories.InstitutionRepository;

@Service
public class InstitutionService {
	
	private InstitutionRepository institutionRepository;
	
	@Autowired
	public InstitutionService(InstitutionRepository institutionRepository) {
		this.institutionRepository = institutionRepository;
	}
	
	public InstitutionResponse saveInstitution(InstitutionInsertRequest institutionRequest) {

		Institution institution = new Institution(
				);
		
		institution.setAddress(institutionRequest.getAddress().substring(0, 1).toUpperCase() + institutionRequest.getAddress().substring(1));
		institution.setBusinessName(institutionRequest.getBusinessName().substring(0, 1).toUpperCase() + institutionRequest.getBusinessName().substring(1));
		institution.setCodeName(institutionRequest.getCodeName());
		
		institutionRepository.save(institution);
		
		return new InstitutionResponse(
				institution.getInstitutionId(),
				institutionRequest.getCodeName(),
				institutionRequest.getAddress(),
				institutionRequest.getBusinessName());
	}
	
	public InstitutionResponse updateInstitution(InstitutionUpdateRequest institutionRequest) {
		
		Institution institution = institutionRepository.getById(institutionRequest.getInstitutionId());
		
		institution.setAddress(institutionRequest.getAddress().substring(0, 1).toUpperCase() + institutionRequest.getAddress().substring(1));
		institution.setBusinessName(institutionRequest.getBusinessName().substring(0, 1).toUpperCase() + institutionRequest.getBusinessName().substring(1));
		institution.setCodeName(institutionRequest.getCodeName());
		
		institutionRepository.save(institution);
		
		return new InstitutionResponse(
				institution.getInstitutionId(),
				institutionRequest.getCodeName(),
				institutionRequest.getAddress(),
				institutionRequest.getBusinessName());
	}
	
	public InstitutionResponse deleteInstitution(Long institutionId) {
		
		Institution institution = institutionRepository.getById(institutionId);
		institutionRepository.delete(institution);
		return null;
		
	}
	
	
	
	public Optional<Institution> getInstitutionBybusinessName(String businessName) {
		return this.institutionRepository.findByBusinessName(businessName);
	}
	
	public List<Institution> getAllInstitutions(){
		return this.institutionRepository.findAll();
		
	}

}
