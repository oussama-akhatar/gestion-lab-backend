package ma.uca.gfl.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("RA")
public class ResponsableAffaireFinanciere extends Responsable {
}
