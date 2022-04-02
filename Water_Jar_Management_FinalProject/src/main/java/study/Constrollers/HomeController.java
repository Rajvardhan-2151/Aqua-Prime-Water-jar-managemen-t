package study.Constrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@GetMapping(path="/Water_Jar_Management")
	public String welcomePage()
	{
		System.out.println("Inside it");
		return "Home";
		
	}
	
	
}
