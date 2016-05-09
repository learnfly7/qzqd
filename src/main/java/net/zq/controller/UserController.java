package net.zq.controller;

import java.util.List;
import java.util.Map;

import net.zq.model.User;
import net.zq.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
    @RequestMapping(value="/list",method=RequestMethod.GET)
    public String getUsers(Map<String,Object> model){
        List<User> list = this.userService.getUsers();
        model.put("userList", list);
        return "list";
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public String getUserById(@PathVariable String id,Map<String,Object> model){
        User user = this.userService.getUserById(id);
        model.put("user", user);
        return "detail";
    }
}
