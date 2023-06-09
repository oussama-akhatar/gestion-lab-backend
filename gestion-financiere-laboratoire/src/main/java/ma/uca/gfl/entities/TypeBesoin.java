package ma.uca.gfl.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
public class TypeBesoin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;

	@OneToMany(mappedBy = "typeBesoin", cascade = CascadeType.ALL)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private List<ExpressionBesoin> expressionBesoins;
}
