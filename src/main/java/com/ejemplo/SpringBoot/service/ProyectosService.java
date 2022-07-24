
package com.ejemplo.SpringBoot.service;


import com.ejemplo.SpringBoot.model.Proyectos;
import com.ejemplo.SpringBoot.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
 @Autowired
       public ProyectosRepository proyRepo;
    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();    }

    @Override
    public void crearProyectos(Proyectos pro) {
        proyRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void modifProyectos(Proyectos proy) {
  
                proyRepo.save(proy);    }

    @Override
    public List<Proyectos> verProyectosOrdenados() {
 Sort sortOrder = Sort.by("fechainicProyecto").descending(); 
 
       return proyRepo
               .findAll(sortOrder);    }

}
