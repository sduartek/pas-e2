package sergio.krautheim.acmegames.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sergio.krautheim.acmegames.Entidade.Cliente;
import sergio.krautheim.acmegames.Repository.IClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository repo;

    public List<Cliente> getAllClientes() {
        return repo.findAll();
    }

}
