
package co.usa.mintic.api.repositorios.crud;


import co.usa.mintic.api.modelos.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceMessage extends CrudRepository<Message,Integer> {
    
}
