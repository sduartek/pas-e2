package sergio.krautheim.acmegames;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository
        extends JpaRepository<ClienteJPA, Integer> {

}
