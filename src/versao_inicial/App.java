package versao_inicial;
public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        gerenciador.criarUsuario("Felipe", "felipe@ifba.edu.br", "felipe123"); 
        gerenciador.criarUsuario("Kleberson", "kleberson@email.com", "senha456");
        gerenciador.criarUsuario("Hildemar", "hildemar@email.com", "senha789");
        gerenciador.criarUsuario("Thiago", "thiago@email.com", "senha321");

        gerenciador.adicionarTarefa("Felipe", "Corrigir trabalhos", "Corrigir os Relatórios e os Projetos\n");
        gerenciador.adicionarTarefa("Kleberson", "Codificar", "Implementação Inicial e criar diagrama UML\n");
        gerenciador.adicionarTarefa("Hildemar", "Fazer a documentação", "Criar um Relatório e o arquivo README\n");
        gerenciador.adicionarTarefa("Thiago", "Codificar", "Implementar o código refatorado.");

        // Exibir resultados com enfeites
        System.out.println("\n============================================");
        System.out.println("             LISTAGEM DE TAREFAS  ");
        System.out.println("============================================\n");

        gerenciador.listarTarefas("Felipe");
        gerenciador.listarTarefas("Kleberson");
        gerenciador.listarTarefas("Hildemar");
        gerenciador.listarTarefas("Thiago");

        System.out.println("\n============================================");
        System.out.println("              FIM DA EXECUÇÃO  ");
        System.out.println("============================================\n");

    }
}
