package net.guides.springboot2.springboot2jpacrudexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/home")
	public String home() {
        return"Data comes from.. <br>"
        		+ "HomeController->home().. <br>"
        		+ "--190120-0851--";  
	}
}
