package newstart.springboot; /**
 * Created by krsi1016 on 2/9/2018.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Lib_Repository extends CrudRepository<Lib_pojo,Long>{
    Lib_pojo findByid(Long id);

}