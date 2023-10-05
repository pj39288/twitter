package com.doongie.twitter.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPostController {

	 @RequestMapping("/post/main")
	   public String ex02() {  
		 return "/post/main"; 
	   }
}
