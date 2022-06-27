package lt.vtmc.FOApp.payload.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InstitutionUpdateRequest {
	
	@NotNull
	private Long institutionId;

	@NotNull
	private Long codeName;
	
	@NotBlank
	private String businessName;
	
	@NotBlank
	private String address;
	
	public void setCodeName(Long codeName) {
		this.codeName = codeName;
	}
	
	public Long getCodeName() {
		return this.codeName;
	}
	
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public String getBusinessName() {
		return this.businessName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}

	
	public Long getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(Long institutionId) {
		this.institutionId = institutionId;
	}

	@Override
    public String toString() {
        return "InstitutionUpdateRequest{" +
        		"id='" + this.institutionId + '\'' +
                ", codeName='" + this.codeName + '\'' +
                ", businessName='" + this.businessName + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }
	
}
