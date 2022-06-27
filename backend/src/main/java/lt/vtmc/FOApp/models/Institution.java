package lt.vtmc.FOApp.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "institutions")
public class Institution {
	
//	@ManyToOne
//    @JoinColumn(name = "user_id")
//    @JsonIgnore
//    private User user;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long institutionId;
	
	@NotBlank
	private String businessName;
	
	@NotNull
	private Long codeName;
	
	@NotBlank
	private String address;
	
	public Institution() {
	}
	
	public Institution( @NotBlank String businessName, @NotNull Long codeName, @NotBlank String address) {
		this.businessName = businessName;
		this.codeName = codeName;
		this.address = address;
	}
	
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public Long getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(Long institutionId) {
		this.institutionId = institutionId;
	}

	public String getBusinessName() {
		return this.businessName;
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

	@Override
	public String toString() {
		return "Institution [id=" + institutionId + ", businessName=" + businessName + ", codeName=" + codeName + ", address="
				+ address + "]";
	}
	
}
