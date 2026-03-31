package dev.java10x.CadastrosDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas () {
        return "Essa e a minha primeira mensagem nessa rota.";
    }

            // ----- CRUD -----

     // Adicionar ninja (CREATE)

    @PostMapping("/criar")
    public String criarNInja() {
        return "Ninja Criado";
    }

    // Mostrar ninja por ID (CREATE)

    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar Ninjas";
    }

    // Mostrar todos os ninjas (READ)

    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasID() {
        return "Mostrar Ninjas ID";
    }

    // Alterar dados dos ninjas (UPDATE)

    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninja ID";
    }

    // Deletar ninja (DELETE)

    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Ninja Deletado Por Id";
    }
}
