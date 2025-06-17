package sergio.krautheim.acmegames;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AcmeGRepo {
        extends JpaRepository<AluguelJogo, Long> 

    // busca todos os alugueis pelo código do jogo
    List<AluguelJogo> findByCodigoJogo(Long codigoJogo);
}
