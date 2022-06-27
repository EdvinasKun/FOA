package lt.vtmc.FOApp.payload.responses;

public class InstitutionResponse {

	private Long institutionId;
	
	private Long codeName;
	
	private String address;

	private String businessName;
	
	public InstitutionResponse(Long institutionId, Long codeName, String address, String businessName) {
		this.institutionId = institutionId;
		this.codeName = codeName;
		this.address = address;
		this.businessName = businessName;
	}

	public void setCodeName(Long codeName) {
		this.codeName = codeName;
	}
	
	public Long getCodeName() {
		return this.codeName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public String getBusinessName() {
		return this.businessName;
	}
	
	public void setId(Long id) {
		this.institutionId = id;
	}
	
	public Long getId() {
		return this.institutionId;
	}
	
	@Override
    public String toString() {
        return "InstitutionResponse{" +
        		"institutionId='" + institutionId + '\'' +
                "codeName='" + codeName + '\'' +
                ", businessName='" + businessName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
