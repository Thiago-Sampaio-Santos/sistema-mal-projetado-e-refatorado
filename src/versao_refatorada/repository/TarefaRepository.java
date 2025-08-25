package versao_refatorada.repository;

// Repositório que armazena usuários e permite manipular tarefas.
import java.util.HashMap;
import java.util.Map;
import versao_refatorada.model.Usuario;
import versao_refatorada.model.Tarefa;

public class TarefaRepository {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void salvarUsuario(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarios.get(email);
    }

    public void adicionarTarefa(String email, Tarefa tarefa) {
        Usuario usuario = buscarUsuarioPorEmail(email);
        if (usuario != null) {
            usuario.adicionarTarefa(tarefa);
        }
    }

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
