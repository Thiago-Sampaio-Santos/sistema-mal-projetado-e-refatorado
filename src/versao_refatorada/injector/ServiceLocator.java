package versao_refatorada.injector;


import versao_refatorada.repository.ITarefaRepository;
import versao_refatorada.repository.TarefaRepository;
import versao_refatorada.service.TarefaService;

// Service Locator que fornece instâncias dos serviços e repositórios.
public class ServiceLocator {
    private static ITarefaRepository tarefaRepository;
    private static TarefaService tarefaService;

    public static void init() {
        tarefaRepository = new TarefaRepository();
        tarefaService = new TarefaService(tarefaRepository);
    }

    public static TarefaService getTarefaService() {
        return tarefaService;
    }
}
