package liberty.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPaulSaltos {
	
	@GetMapping("/paul-saltos")
	public String hello() {
		return "Ciao, Paúl Carlos Saltos Del Hierro";
	}

}
