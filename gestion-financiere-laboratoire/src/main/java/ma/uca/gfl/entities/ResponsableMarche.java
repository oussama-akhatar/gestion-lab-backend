package ma.uca.gfl.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

//@Entity
//@DiscriminatorValue("RM")
//@Data
public class ResponsableMarche extends Responsable {
	private String marche;

}
