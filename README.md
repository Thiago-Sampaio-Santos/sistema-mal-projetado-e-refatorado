# Gestão de Tarefas Simples

Projeto desenvolvido para demonstrar a diferença entre uma implementação mal projetada e uma versão refatorada utilizando boas práticas de programação, como princípios SOLID e o padrão Service Locator.

---

## Objetivo

Este projeto tem como finalidade ilustrar a evolução de um sistema de gerenciamento de tarefas, partindo de uma versão inicial com alto acoplamento e baixa coesão, até uma versão refatorada com separação clara de responsabilidades, aplicação dos princípios SOLID e uso do padrão Service Locator com inicialização centralizada (init()), além da introdução da interface ITarefaRepository para promover inversão de dependência.

---

## Estrutura do Projeto

```plaintext
Gestão de Tarefas Simples/
├─ src/
│   ├─ versao_inicial/         # Código mal projetado
│   └─ versao_refatorada/      # Código refatorado com boas práticas
├─ docs/
│   ├─ diagramas/              # Diagramas UML
│   │   ├─ diagrama_inicial.png
│   │   └─ diagrama_refatorado.png
│   └─ relatorio_tecnico.pdf   # Relatório técnico do projeto
└─ README.md                   # Este arquivo
``` 

---

## Como Executar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- Terminal ou uma IDE como:
  - [Visual Studio Code](https://code.visualstudio.com/)
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/)

---

### Versão Inicial

```bash
# Acesse o diretório da versão inicial
cd src/versao_inicial

# Compile os arquivos Java
javac *.java

# Execute o programa
java App
```

### Versão refatorada

```bash
# Acesse o diretório da versão refatorada
cd src/versao_refatorada

# Compile os arquivos Java (ajuste os nomes conforme sua estrutura)
javac injector/ServiceLocator.java \
      service/TarefaService.java \
      repository/ITarefaRepository.java \
      repository/TarefaRepository.java \
      model/Usuario.java \
      model/Tarefa.java \
      App.java

# Execute o programa
java App
```

---

## Diagramas UML

Os diagramas que ilustram a estrutura e evolução do projeto estão disponíveis na pasta `docs/diagramas`:

- [Diagrama da Versão Inicial](docs/diagramas/diagrama_inicial.png)  
  Representa a arquitetura original do sistema, com alto acoplamento e baixa coesão.

- [Diagrama da Versão Refatorada](docs/diagramas/diagrama_refatorado.png)  
  Mostra a nova estrutura com aplicação de boas práticas e separação de responsabilidades.

---

## Relatório Técnico

O relatório técnico detalha o processo de desenvolvimento, análise das versões e justificativas para a refatoração. 

- [Relatório Técnico (PDF)](docs/relatorio_tecnico.pdf)

---

## Discentes 

Hildemar Lemos de Santana Júnior, Kleberson de Jesus Sousa e Thiago Sampaio Santos 


