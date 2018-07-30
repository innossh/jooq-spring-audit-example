package innossh.jooq.spring.audit.example.controller;

import innossh.jooq.spring.audit.example.db.tables.pojos.User;
import innossh.jooq.spring.audit.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @ResponseBody
    public List<User> listUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    @ResponseBody
    public User createUser(String name) {
        User newUser = new User();
        newUser.setName(name);
        userService.createUser(newUser);
        return newUser;
    }

}
