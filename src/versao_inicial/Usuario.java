package versao_inicial;

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
