package versao_refatorada;

import versao_refatorada.injector.ServiceLocator;
import versao_refatorada.service.TarefaService;
import versao_refatorada.model.Usuario;
import versao_refatorada.model.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {
        TarefaService tarefaService = ServiceLocator.getTarefaService();

        // Criando usuários
        Usuario felipe = new Usuario("Felipe", "felipe@ifba.edu.br", "felipe123"); 
        Usuario kleberson = new Usuario("Kleberson", "kleberson@email.com", "senha456");
        Usuario hildemar = new Usuario("Hildemar", "hildemar@email.com", "senha789");
        Usuario thiago = new Usuario("Thiago", "thiago@email.com", "senha321");

        tarefaService.criarUsuario(felipe);
        tarefaService.criarUsuario(kleberson);
        tarefaService.criarUsuario(hildemar);
        tarefaService.criarUsuario(thiago);

        // Adicionando as tarefas
        tarefaService.adicionarTarefa("felipe@ifba.edu.br",
            new Tarefa("Corrigir trabalhos", "Corrigir os trabalhos dos alunos, incluindo os relatórios técnicos e a codificação."));

        tarefaService.adicionarTarefa("kleberson@email.com",
            new Tarefa("Codificar", "Implementação inicial do sistema e criação do diagrama UML."));

        tarefaService.adicionarTarefa("hildemar@email.com",
            new Tarefa("Fazer a documentação", "Elaborar o relatório técnico e preparar o arquivo README com instruções do projeto."));

        tarefaService.adicionarTarefa("thiago@email.com",
            new Tarefa("Codificar", "Implementar a versão refatorada do código com separação de responsabilidades."));

        //Mostrar os resultados
        System.out.println("\n============================================");
        System.out.println("             LISTAGEM DE TAREFAS  ");
        System.out.println("============================================\n");

        tarefaService.listarTarefas("felipe@ifba.edu.br");
        tarefaService.listarTarefas("kleberson@email.com");
        tarefaService.listarTarefas("hildemar@email.com");
        tarefaService.listarTarefas("thiago@email.com");

        System.out.println("\n============================================");
        System.out.println("              FIM DA EXECUÇÃO  ");
        System.out.println("============================================\n");
    }
}
