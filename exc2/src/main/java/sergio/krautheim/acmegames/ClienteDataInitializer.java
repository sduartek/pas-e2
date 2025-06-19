package sergio.krautheim.acmegames;

import sergio.krautheim.acmegames.Repository.IClienteRepository;
import sergio.krautheim.acmegames.Entidade.Cliente;
import sergio.krautheim.acmegames.Entidade.Empresarial;
import sergio.krautheim.acmegames.Entidade.Individual;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ClienteDataInitializer implements CommandLineRunner {

    private final IClienteRepository clienteRepository;

    public ClienteDataInitializer(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void run(String... args) {
        Cliente[] clientes = {
            new Empresarial(1L, 1001, "João Silva", "Rua A, 123", "Empresa X", "12.345.678/0001-90"),
            new Empresarial(2L, 1002, "Maria Souza", "Avenida B, 456", "Empresa A",  "98.765.432/0001-01"),
            new Individual(3L, 1003, "Pedro Santos", "Travessa C,  789", "123.456.789-00"),
            new Individual(4L, 1004, "Ana Oliveira", "Rua D, 101",  "321.654.987-00"),
            new Empresarial(5L, 1005, "Carlos Costa", "Avenida E, 202", "Empresa B",  "11.222.333/0001-11"),
            new Individual(6L, 1006, "Fernanda Lima", "Rua F, 303", "987.654.321-00"),
        };
        clienteRepository.saveAll(Arrays.asList(clientes));

        System.out.println("Dados de clientes inicializados com sucesso.");
    }
}