package sergio.krautheim.acmegames.Entidade;

import jakarta.persistence.Entity;

@Entity
public class Individual extends Cliente {
    
    private String CPF;


    public Individual(Long id, int numero, String nome, String endereco, String CPF) {
        super(id, numero, nome, endereco);
        this.CPF = CPF;
    }
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }       
   

}
