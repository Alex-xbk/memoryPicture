package memorypicture.Controller;


import memorypicture.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by alex on 2017/10/12.
 */
@RestController
public class Controller {

    @Autowired
    private User user;
    @RequestMapping(value="/xbk", method = RequestMethod.GET)

    public String say(){
        return user.getName()+":"+user.getAge();
    }
    public String sayhi(){return "h1";}
    public String sayhello(){return "hello";}
}
