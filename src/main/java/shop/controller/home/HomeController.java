package shop.controller.home;


import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@WebListener
public class HomeController implements ServletRequestListener{
	
	@GetMapping("/")
	public String mainpageProcess() {
		
		return "layout/layout";
	}
	
}
