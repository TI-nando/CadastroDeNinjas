package dev.java10x.CadastrosDeNinjas.Ninjas;

import dev.java10x.CadastrosDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity tranforma uma classe comum em uma entidade de banco de dados
// JPA - Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "imgUrl")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;

    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou Chave estrangeira.
    private MissoesModel missoes;

}
