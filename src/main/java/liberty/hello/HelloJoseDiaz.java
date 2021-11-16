package liberty.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJoseDiaz {

    @GetMapping("/jose-diaz")
    public String hello(){
        return "Hello, José A. Díaz";
    }

    @GetMapping("/hola-todos")
    public String helloTodos(){
        return "Hola, a todos";
    }
}
