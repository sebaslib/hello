package liberty.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBryanGalligan {
	
	@GetMapping("/bryan-galligan")
	public String hello() {
		return "Hello, Bryan";
	}

}
