package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {

    // Mapeia a rota GET "/hello"
    @GetMapping
    public String olaMundo() {
        // Retorna a string "Hello World!"
        return "Hello World!";
    }
}

