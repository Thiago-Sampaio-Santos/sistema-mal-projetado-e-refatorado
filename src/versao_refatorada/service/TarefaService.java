package versao_refatorada.service;


import versao_refatorada.model.Usuario;
import versao_refatorada.model.Tarefa;
import versao_refatorada.repository.TarefaRepository;

// Serviço que encapsula a lógica de criação de usuários e tarefas.
public class TarefaService {
    private TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public void criarUsuario(Usuario usuario) {
        tarefaRepository.salvarUsuario(usuario);
    }

    public void adicionarTarefa(String email, Tarefa tarefa) {
        tarefaRepository.adicionarTarefa(email, tarefa);
    }

    public void listarTarefas(String email) {
        tarefaRepository.listarTarefas(email);
    }
}
