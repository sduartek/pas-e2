package sergio.krautheim.acmegames;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acmegames/cadastro")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/listaclientes")
    public ResponseEntity<List<ClienteDto>> listAllClientes() {
        List<ClienteDto> lista = service.listarTodos();
        if (lista.isEmpty()) {

            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }
}
