package versao_inicial;

// Representa um usuário com nome, email, senha e lista de tarefas.
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public String nome;
    public String email;
    public String senha;
    public List<Tarefa> tarefas = new ArrayList<>();

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
