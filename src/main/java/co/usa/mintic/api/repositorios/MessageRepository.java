
package co.usa.mintic.api.repositorios;

import co.usa.mintic.api.modelos.Message;
import co.usa.mintic.api.repositorios.crud.InterfaceMessage;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    @Autowired
    private InterfaceMessage crud;
    
    public List<Message> getAll(){
        return (List<Message>) crud.findAll();
    }
    public Optional <Message> getMessage(int id){
        return crud.findById(id);
    }
    
    public Message save(Message message){
        return crud.save(message);
    }
    
    public void delete (Message message){
        crud.delete(message);
    }
    
}
