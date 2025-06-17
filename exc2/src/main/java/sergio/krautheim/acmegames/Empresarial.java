package sergio.krautheim.acmegames;

public class Empresarial extends ClienteJPA {

    private String CNPJ;
    private String nomeFantasia;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;

    }
}
