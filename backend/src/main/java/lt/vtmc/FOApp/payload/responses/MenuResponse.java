package lt.vtmc.FOApp.payload.responses;

//import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lt.vtmc.FOApp.models.Dish;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuResponse {

	private Long menuId;
	
	private String menuName;
	
	private String InstitutionBusinessName;
	
}
