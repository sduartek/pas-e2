package sergio.krautheim.acmegames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sergio.krautheim.acmegames.Entidade.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findAllClientes();
    List<String> findByNome();
    List<String> findByEndereco();
    List<String> findByTipo();
    List<String> findByCNPJ();
    List<String> findByCPF();
    List<String> findByNomeFantasia();

}
