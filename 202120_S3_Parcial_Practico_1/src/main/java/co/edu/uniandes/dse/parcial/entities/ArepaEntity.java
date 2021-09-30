package co.edu.uniandes.dse.parcial.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import uk.co.jemos.podam.common.PodamExclude;

@Entity
@Getter
@Setter
public class ArepaEntity extends BaseEntity {
	private   String  nombre; 
	private  Integer tamano ;
	private  Date fechaElaboracion;
	@PodamExclude
	@ManyToOne
	IngredienteEntity Ingrediente ;
	@PodamExclude
	@OneToOne
    private SitioVentaEntity sitio;

}
