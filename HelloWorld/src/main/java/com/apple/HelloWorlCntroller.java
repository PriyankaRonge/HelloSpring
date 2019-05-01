package com.apple;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorlCntroller {
 String message = "welcome to spring mvc123";

 @RequestMapping("/hello")
 public ModelAndView showmessage (@RequestParam(value= "name" ,required=false) String name) {
	 ModelAndView mv = new ModelAndView("helloworld");
	 mv.addObject("message", message);
	 mv.addObject("name", name);
	 return mv;
 }
}
