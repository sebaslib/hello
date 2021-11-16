package liberty.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloColmMcRory {
	
	@GetMapping("/colm-mcrory")
	public String hello() {
		return "Hola, Colm McRory";
	}

}
