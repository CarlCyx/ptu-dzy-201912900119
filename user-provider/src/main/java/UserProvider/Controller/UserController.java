package UserProvider.Controller;

import UserProvider.Dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired(required = false)
    UserDao userDao;
    @RequestMapping("/register")
    public int register(@RequestParam(value = "upassword") String upassword,
                        @RequestParam(value = "uname") String uname,
                        @RequestParam(value = "usex") String usex)
    {
        int tmp = userDao.register(upassword,uname,usex);
        System.out.println(tmp);
        return tmp;
    }
    @RequestMapping("/login")
    public User login(@RequestParam(value = "uname") String uname){
        return userDao.login(uname);
    }
}
