package dev.java10x.CadastrosDeNinjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas () {
        return "Essa e a minha primeira mensagem nessa rota.";
    }

}
