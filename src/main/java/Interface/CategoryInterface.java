package Interface;

import org.springframework.data.repository.CrudRepository;
import Modelo.Category;


public interface CategoryInterface extends CrudRepository< Category, Integer>{
    
}

