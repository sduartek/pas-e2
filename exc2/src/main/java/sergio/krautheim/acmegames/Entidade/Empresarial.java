package sergio.krautheim.acmegames.Entidade;

public class Empresarial extends Cliente {

    private String CNPJ;
    private String nomeFantasia;

    public Empresarial(Long id, int numero, String nome, String endereco, String nomeFantasia, String CNPJ) {
        super(id, numero, nome, endereco);
        this.nomeFantasia = nomeFantasia;
        this.CNPJ = CNPJ;
    }

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
