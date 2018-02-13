package newstart.springboot; /**
 * Created by krsi1016 on 2/9/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibDB implements CommandLineRunner {
    private Lib_Repository lib_repo;

    @Autowired
    public LibDB(Lib_Repository lib_repo) {
        this.lib_repo = lib_repo;
    }
@Override
    public void run(String... arg0) throws Exception {
        // TODO Auto-generated method stub
        lib_repo.save(new Lib_pojo("One night At call center", "Chetan Bhagat"));
        lib_repo.save(new Lib_pojo("2 States", "Chetan Bhagat"));
        lib_repo.save(new Lib_pojo("5. someone", "Chetan Bhagat"));
        lib_repo.save(new Lib_pojo("Can love happen twice", "Ravinder Singh"));
        lib_repo.save(new Lib_pojo("I too had a luv story", "Ravinder Singh"));

    }

}
