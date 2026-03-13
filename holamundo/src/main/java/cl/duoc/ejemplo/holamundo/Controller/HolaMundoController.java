package cl.duoc.ejemplo.holamundo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaMundoController {

    @GetMapping("/hola")

    public String holamundo(){
        return "Viernes De Therians!";
    }
}
