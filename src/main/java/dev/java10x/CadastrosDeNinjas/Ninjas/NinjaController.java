package dev.java10x.CadastrosDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas () {
        return "Essa e a minha primeira mensagem nessa rota.";
    }

}
