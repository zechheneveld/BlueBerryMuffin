package com.zech.blueberryMuffins.controller;

import com.zech.blueberryMuffins.data.UserRepository;
import com.zech.blueberryMuffins.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class IntroController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/person/{name}")
    public String personPage(@PathVariable String name, ModelMap modelMap){
        User user = userRepository.findByName(name);
        modelMap.put("user", user);
        return "user";
    }

    @RequestMapping("/everyone")
    public String getAllPeople(ModelMap modelMap){
        List<User> everyone = userRepository.getAllPeople();
        modelMap.put("everyone", everyone);
        return "everyone";
    }
}
