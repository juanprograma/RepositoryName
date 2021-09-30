package co.edu.uniandes.dse.parcial.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import uk.co.jemos.podam.common.PodamExclude;

@Entity
@Getter
@Setter
public class SitioVentaEntity extends BaseEntity{
	private String nombre;
	  @PodamExclude  
	    @OneToOne(
	        mappedBy = "sitio",
	    	fetch = FetchType.LAZY
	    )
	    private ArepaEntity arepa;

}
