
package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreProyecto;
    private String descripcioProyecto;
 @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechainicProyecto;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechafinProyecto;
    public Proyectos() {
    }

  

    public Proyectos(Long id, String nombreProyecto, String descripcioProyecto, Date fechainicProyecto, Date fechafinProyecto) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.descripcioProyecto = descripcioProyecto;
        this.fechainicProyecto = fechainicProyecto;
        this.fechafinProyecto = fechafinProyecto;
    }
    
    
}
