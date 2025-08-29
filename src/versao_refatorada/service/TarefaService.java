package versao_refatorada.service;

import versao_refatorada.model.Usuario;
import versao_refatorada.model.Tarefa;
import versao_refatorada.repository.ITarefaRepository;

public class TarefaService {
    private ITarefaRepository tarefaRepository;

    public TarefaService(ITarefaRepository tarefaRepository) {
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

    public Usuario obterUsuario(String email) {
        return tarefaRepository.buscarUsuarioPorEmail(email);
    }
}