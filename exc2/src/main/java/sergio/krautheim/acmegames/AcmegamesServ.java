package sergio.krautheim.acmegames;

@Service
public class AcmegamesServ {

    private final AluguelJogoRepository repo;

    public AluguelJogoService(AluguelJogoRepository repo) {
        this.repo = repo;
    }

    public List<AluguelJogoDto> listarPorCodigoJogo(Long codigoJogo) {
        return repo.findByCodigoJogo(codigoJogo)
                   .stream()
                   .map(AluguelJogoDto::new)
                   .toList();
    }
}
