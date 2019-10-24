package com.pet.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pet.shop.service.UserService;


@Controller
@RequestMapping("/User/")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping("deleteUser")
    public String deleteUser(Integer id){
		userService.deleteUser(id);
		return "delete ok";
        
    }
	
}
