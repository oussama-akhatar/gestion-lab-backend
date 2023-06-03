package ma.uca.gfl.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("RM")
public class ResponsableMarche extends Responsable {

}
