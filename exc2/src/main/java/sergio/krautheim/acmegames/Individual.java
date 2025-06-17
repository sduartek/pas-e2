package sergio.krautheim.acmegames;

import jakarta.persistence.Entity;

@Entity
public class Individual extends ClienteJPA {
    
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }       
   

}
