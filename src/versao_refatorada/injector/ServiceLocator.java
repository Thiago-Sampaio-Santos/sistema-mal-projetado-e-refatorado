package versao_refatorada.injector;


import versao_refatorada.repository.TarefaRepository;
import versao_refatorada.service.TarefaService;

// Service Locator que fornece instâncias dos serviços e repositórios.
public class ServiceLocator {
    private static TarefaRepository tarefaRepository = new TarefaRepository();
    private static TarefaService tarefaService = new TarefaService(tarefaRepository);

    public static TarefaService getTarefaService() {
        return tarefaService;
    }
}
