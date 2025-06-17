package sergio.krautheim.acmegames;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class ClienteJPA {

    @Id
    private int numero;
    private String nome;
    private String endereco;

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
