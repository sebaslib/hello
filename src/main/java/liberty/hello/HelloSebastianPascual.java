package liberty.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSebastianPascual {
	
	@GetMapping("/sebastian-pascual")
	public String hello() {
		
		return "Hola, Sebastián Pascual";
		
	}

}
