package lt.vtmc.FOApp.payload.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InstitutionInsertRequest {

	@NotNull
	private Long codeName;
	
	@NotBlank
	private String businessName;
	
	@NotBlank
	private String address;
	
//	public InstitutionInsertRequest(@NotBlank Long codeName, @NotBlank String businessName, @NotBlank String address) {
//		this.codeName = codeName;
//		this.businessName = businessName;
//		this.address = address;
//	}
	
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
	
	@Override
    public String toString() {
        return "InstitutionInsertRequest{" +
                ", codeName='" + this.codeName + '\'' +
                ", businessName='" + this.businessName + '\'' +
                ", address='" + this.address + '\'' +
                '}';
    }

}
