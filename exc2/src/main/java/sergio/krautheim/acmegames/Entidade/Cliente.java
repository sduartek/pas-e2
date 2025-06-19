package sergio.krautheim.acmegames.Entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class Cliente {

    @Id
    private Long id;
    private int numero;
    private String nome;
    private String endereco;

    protected Cliente() {
    }

    public Cliente(Long id, int numero, String nome, String endereco) {
        this.numero = numero;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Long getId() {
        return id;
    }

}
