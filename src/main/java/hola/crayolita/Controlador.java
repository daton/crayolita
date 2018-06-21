package hola.crayolita;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controlador {

    @GetMapping("/")
    public String hola() {
        return "hola";
    }
}