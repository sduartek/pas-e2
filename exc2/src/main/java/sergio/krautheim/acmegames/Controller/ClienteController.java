package sergio.krautheim.acmegames.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sergio.krautheim.acmegames.Entidade.Cliente;
import sergio.krautheim.acmegames.Service.ClienteService;

@RestController
@RequestMapping("/acmegames/cadastro")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/listaclientes")
    public List<Cliente> getAllClientes() {
        return service.getAllClientes();
    }
}

