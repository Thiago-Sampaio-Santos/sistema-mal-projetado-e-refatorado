package versao_refatorada.model;

// Entidade que representa um usuário com dados pessoais e tarefas.
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Tarefa> tarefas = new ArrayList<>();

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public List<Tarefa> getTarefas() { return tarefas; }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }
}
