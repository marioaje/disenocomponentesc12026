package org.example.apis.viewapi;

import org.example.apis.controller.PersonaController;
import org.example.apis.model.personasModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonasAPI {

    PersonaController controller = new PersonaController();



    @PostMapping
    public String insertar(@RequestBody personasModel personas) {
        controller.insertar(personas);
        return "Persona Creada";
    }

    @GetMapping
    public List<personasModel> listar(){
        return controller.listar();
    }
}
