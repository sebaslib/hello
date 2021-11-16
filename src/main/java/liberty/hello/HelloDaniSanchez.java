package liberty.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDaniSanchez {
	
	@GetMapping("/daniel-sanchez")
	public String hello() {
		return "Hello, Daniel Sanchez";
	}
	@GetMapping("/pep-sanchez")
	public String hello2() {
		return "Hello, pepe sanchez";
	}

}
