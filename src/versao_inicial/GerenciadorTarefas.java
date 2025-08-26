package versao_inicial;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Usuario> usuarios = new ArrayList<>();

    public void criarUsuario(String nome, String email, String senha) {
        usuarios.add(new Usuario(nome, email, senha));
    }

    public void adicionarTarefa(String nomeUsuario, String titulo, String descricao) {
        for (Usuario u : usuarios) {
            if (u.nome.equals(nomeUsuario)) {
                u.tarefas.add(new Tarefa(titulo, descricao));
            }
        }
    }

    public void listarTarefas(String nomeUsuario) {
        for (Usuario u : usuarios) {
            if (u.nome.equals(nomeUsuario)) {
                System.out.println("Tarefas de " + u.nome + " (" + u.email + "):");
                for (Tarefa t : u.tarefas) {
                    System.out.println("- " + t.titulo + ": " + t.descricao);
                }
            }
        }
    }
}
