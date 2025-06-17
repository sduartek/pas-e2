package sergio.krautheim.acmegames;

@Service
public class ClienteService {

    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public List<ClienteDto> listarTodos() {
        return repo.findAll()
                   .stream()
                   .map(ClienteDto::new)
                   .toList();
    }
}

