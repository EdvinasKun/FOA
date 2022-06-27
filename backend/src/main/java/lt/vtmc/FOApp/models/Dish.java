package lt.vtmc.FOApp.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="dishes")
public class Dish {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dishId;

	@NotBlank
	private String dishName;

	@ManyToOne
	@JoinColumn(name = "menu_Id")
	private Menu menu;
}
