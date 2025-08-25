package versao_refatorada.model;

// Entidade que representa uma tarefa com título e descrição.
public class Tarefa {
    private String titulo;
    private String descricao;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
}
