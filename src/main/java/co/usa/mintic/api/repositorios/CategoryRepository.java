
package co.usa.mintic.api.repositorios;

import co.usa.mintic.api.modelos.Category;
import co.usa.mintic.api.repositorios.crud.InterfaceCategory;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {
    
     @Autowired
    private InterfaceCategory crud;
    
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    public Optional <Category> getCategoria(int id){
        return crud.findById(id);
    }
    
    public Category save(Category categoria){
        return crud.save(categoria);
    }
    
    public void delete (Category category){
        crud.delete(category);
    }
}
