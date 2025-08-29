package versao_refatorada.repository;

import java.util.HashMap;
import java.util.Map;
import versao_refatorada.model.Usuario;
import versao_refatorada.model.Tarefa;

public class TarefaRepository implements ITarefaRepository {
    private Map<String, Usuario> usuarios = new HashMap<>();

    @Override
    public void salvarUsuario(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    @Override
    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarios.get(email);
    }

    @Override
    public void adicionarTarefa(String email, Tarefa tarefa) {
        Usuario usuario = buscarUsuarioPorEmail(email);
        if (usuario != null) {
            usuario.adicionarTarefa(tarefa);
        }
    }

    @Override
    public void listarTarefas(String email) {
        Usuario usuario = buscarUsuarioPorEmail(email);
        if (usuario != null) {
            System.out.println("Tarefas de " + usuario.getNome() + " (" + usuario.getEmail() + "):");
            for (Tarefa t : usuario.getTarefas()) {
                System.out.println("- " + t.getTitulo() + ": " + t.getDescricao());
            }
        }
    }
}