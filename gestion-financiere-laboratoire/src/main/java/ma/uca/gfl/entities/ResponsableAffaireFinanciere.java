package ma.uca.gfl.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

//@Entity
//@DiscriminatorValue("RA")
//@Data
public class ResponsableAffaireFinanciere extends Responsable {
	private String affaire;
}
