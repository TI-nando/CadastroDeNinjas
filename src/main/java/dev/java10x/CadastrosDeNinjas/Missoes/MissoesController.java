package dev.java10x.CadastrosDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes") //ROTA - Todo mundo vai seguir o caminho de missoes.
public class MissoesController {

    // ----- SUB ROTAS -----

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/criar")
    public MissoesModel criarMissoes(@RequestBody MissoesModel missoes) {
        return missoesService.criarMissao(missoes);
    }

    //GET -- Mandar uma requisiçãp para CRIAR as missoes.
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Missões listadas com sucesso";
    }

    //DELETE -- Mandar uma requisição para DELETAR as missoes.
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";
    }
}
