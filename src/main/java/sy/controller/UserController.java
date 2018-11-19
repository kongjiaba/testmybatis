package sy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sy.model.User;
import sy.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author WJUN
 * @create 2018/10/29 22:50
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/showUser/{id}")
    public String showUser(@PathVariable  String id, HttpServletRequest request){
        User user = userService.getUserById(id);
        request.setAttribute("user",user);
        return "jsp/showUser";
    }
}
