
package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Hobbies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreHobbie;
    private String descripcioHobbie;
    

    public Hobbies() {
    }

    public Hobbies(Long id, String nombreHobbie, String descripcioHobbie, Persona person) {
        this.id = id;
        this.nombreHobbie = nombreHobbie;
        this.descripcioHobbie = descripcioHobbie;
    
    }
    
    
    
}
