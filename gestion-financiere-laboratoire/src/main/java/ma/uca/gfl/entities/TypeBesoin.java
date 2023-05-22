package ma.uca.gfl.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TypeBesoin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;

	@OneToMany(mappedBy = "typeBesoin")
	private List<ExpressionBesoin> expressionBesoins;
}
