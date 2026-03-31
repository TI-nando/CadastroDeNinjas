package dev.java10x.CadastrosDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes") //ROTA - Todo mundo vai seguir o caminho de missoes.
public class MissoesController {

    // ----- SUB ROTAS -----

    //GET -- Mandar uma requisiçãp para CRIAR as missoes.
    @GetMapping("/listar")
    public String listarMissoes () {
        return "Missões listadas com sucesso";
    }

    //PUT -- Mandar uma requisição para ALTERAR as missoes.
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada com sucesso";
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
