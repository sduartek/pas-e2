package sergio.krautheim.acmegames;

@RestController
@RequestMapping("/acmegames/aluguel")
public class AcmegamesController {

    private final AcmegamesServ service;

    public AcmegamesController(AcmegamesServ service) {
        this.service = service;
    }

    @GetMapping("/valorjogo/{codigo}")
    public ResponseEntity<List<AluguelJogoDto>> getValorJogo(
            @PathVariable("codigo") Long codigoJogo) {

        List<AluguelJogoDto> lista = service.listarPorCodigoJogo(codigoJogo);

        if (lista.isEmpty()) {

            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(lista);
    }
}
