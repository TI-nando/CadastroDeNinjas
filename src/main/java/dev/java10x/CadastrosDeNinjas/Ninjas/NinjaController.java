package dev.java10x.CadastrosDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas") // ----- ROTA -----
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa e a minha primeira mensagem nessa rota.";
    }
    // ----- CRUD -----

    // ----- SUB ROTAS -----

    // Adicionar ninja (CREATE)

    @PostMapping("/criar")
    public String criarNInja() {
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (READ)

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
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
