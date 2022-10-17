
package Interface;
import Modelo.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageInterface extends CrudRepository< Message, Integer>{  
    
}

