package versao_refatorada.repository;

import versao_refatorada.model.Usuario;
import versao_refatorada.model.Tarefa;

public interface ITarefaRepository {
    void salvarUsuario(Usuario usuario);
    Usuario buscarUsuarioPorEmail(String email);
    void adicionarTarefa(String email, Tarefa tarefa);
    void listarTarefas(String email);
}
