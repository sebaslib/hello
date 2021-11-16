package liberty.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJohnDaly {
	
	@GetMapping("/john-daly")
	public String hello() {
		return "Hello, John";
	}

}
