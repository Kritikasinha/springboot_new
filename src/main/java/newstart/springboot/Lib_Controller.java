package newstart.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/lib")
public class Lib_Controller {
    private Lib_Repository lib_repository;
@Autowired
    public Lib_Controller(Lib_Repository lib_repository) {
        this.lib_repository = lib_repository;
    }

    @RequestMapping(value="/all", method = RequestMethod.GET)
    public  Iterable<Lib_pojo> getall(){
        return lib_repository.findAll();
    }
}

