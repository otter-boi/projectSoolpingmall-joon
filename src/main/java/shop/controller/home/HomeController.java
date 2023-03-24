package shop.controller.home;


import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@WebListener
public class HomeController implements ServletRequestListener{
	
	@GetMapping("index")
	public String mainpageProcess(Model model) {
		
		return "home";
	}
}
