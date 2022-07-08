
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Estudios;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


public interface IEstudiosService {
    public List<Estudios> verEstudios();
    
    public void crearEstudios(Estudios est);
    
    public void borrarEstudios(Long id);
    
    public Estudios buscarEstudios(Long id);
    
    public void modificarEstudios(Estudios estud);
    
    public List<Estudios> verEtudiosOrdenados();
    
}
