package lt.vtmc.FOApp.payload.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuInsertRequest {
	
	@NotBlank
	private String menuName;
	
	@NotNull
	private Long institutionId;

}
