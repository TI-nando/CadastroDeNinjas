package dev.java10x.CadastrosDeNinjas.Missoes;

import org.springframework.stereotype.Service;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Método para criar uma nova missão (CREATE)
    public MissoesModel criarMissao(MissoesModel missao) {
        return missoesRepository.save(missao);
    }
}
