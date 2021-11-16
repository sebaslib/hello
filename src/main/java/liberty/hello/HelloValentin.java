package liberty.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloValentin {

	@GetMapping("/valentin")
	public String hello() {
		return "Hola Valentin";
	}
}
