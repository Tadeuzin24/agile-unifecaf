# 📌 Sistema de Gerenciamento de Tarefas Ágil

## 📖 Descrição do Projeto
Este projeto consiste no desenvolvimento de um **sistema básico de gerenciamento de tarefas**, criado para aplicar, na prática, os conceitos de **Engenharia de Software** e **Metodologias Ágeis**, utilizando o GitHub como ferramenta central de versionamento, organização e controle de qualidade.

O sistema permite cadastrar, visualizar, atualizar e remover tarefas, além de acompanhar o progresso do desenvolvimento por meio de um quadro Kanban.

---

## 🎯 Objetivo
O objetivo do projeto é demonstrar:
- Aplicação de metodologias ágeis (Kanban)
- Organização e versionamento de código com Git e GitHub
- Planejamento e acompanhamento de tarefas
- Implementação de testes automatizados
- Uso de Integração Contínua (CI) com GitHub Actions
- Gestão de mudanças ao longo do desenvolvimento

---

## 📌 Escopo Inicial
O escopo inicial do projeto contempla:
- Implementação de um **CRUD (Create, Read, Update, Delete) de tarefas**
- Organização das tarefas em um **quadro Kanban no GitHub Projects**
- Criação de testes automatizados básicos
- Configuração de pipeline de Integração Contínua

---

## 🧩 Metodologia Ágil Utilizada
Foi utilizada a metodologia **Kanban**, por meio da aba **GitHub Projects**, com as seguintes colunas:
- **To Do**
- **In Progress**
- **Done**

Essa metodologia permitiu melhor visualização do fluxo de trabalho, priorização de tarefas e acompanhamento contínuo do progresso do projeto.

---

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java  
- **IDE:** IntelliJ IDEA  
- **Controle de Versão:** Git e GitHub  
- **Testes Automatizados:** JUnit  
- **Integração Contínua:** GitHub Actions  
- **Gerenciador de Build:** Maven ou Gradle  

---

## 📂 Estrutura do Projeto
```yaml
├── src/
│ ├── main/
│ │ └── java/
│ │ └── app/
│ │ └── TaskManager.java
│ └── test/
│ └── java/
│ └── app/
│ └── TaskManagerTest.java
├── docs/
│ └── diagramas/
├── .github/
│ └── workflows/
│ └── ci.yml
└── README.md
```
---

## ▶️ Como Executar o Projeto
### Pré-requisitos
- Java JDK 17 ou superior
- IntelliJ IDEA
- Maven ou Gradle configurado

### Passos
1. Clone o repositório:
```bash
git clone https://github.com/Tadeuzin24/agile-unifecaf.git
````
Abra o projeto no IntelliJ IDEA.

Aguarde o carregamento das dependências.

Execute a classe principal:

```java
TaskManager.java
```
🧪 Testes Automatizados

Os testes automatizados foram implementados utilizando JUnit, garantindo a validação das funcionalidades principais do sistema, como:

Criação de tarefas

Atualização de dados

Remoção de tarefas

Para executar os testes:

```bash
mvn test
```
ou pelo próprio IntelliJ IDEA.

🔁 Integração Contínua (CI)
O projeto possui um pipeline de Integração Contínua configurado com GitHub Actions, que:

Compila o projeto

Executa os testes automatizados

Garante maior confiabilidade a cada commit realizado

🔄 Gestão de Mudanças
Durante o desenvolvimento, foi simulada uma mudança de escopo, com a adição de uma nova funcionalidade (exemplo: prioridade das tarefas).

Justificativa

A mudança foi necessária para atender a novas necessidades identificadas durante o desenvolvimento, demonstrando a flexibilidade das metodologias ágeis.

As alterações foram:

Registradas no Kanban

Implementadas com novos commits

Documentadas neste README

👥 Principais Beneficiados

Desenvolvedores, para organização e controle de tarefas

Gestores de projetos, para acompanhamento do progresso

Empresas, para melhoria da produtividade e organização do fluxo de trabalho

## Metodologia Ágil e Organização do Projeto

Este projeto foi desenvolvido utilizando a metodologia ágil Kanban, com o objetivo de visualizar o fluxo de trabalho e facilitar o acompanhamento das tarefas ao longo do desenvolvimento.

O quadro Kanban foi criado utilizando a aba Projects do GitHub, organizado nas seguintes colunas:

- To Do: tarefas planejadas e ainda não iniciadas
- In Progress: tarefas em desenvolvimento
- Done: tarefas concluídas

Essa abordagem permitiu maior controle do andamento do projeto, melhor organização das atividades e rápida adaptação a mudanças de escopo, como a inclusão da prioridade das tarefas.


📌 Considerações Finais

Este projeto evidencia a importância da Engenharia de Software, mostrando como planejamento, versionamento, testes automatizados e adaptação a mudanças são essenciais para o desenvolvimento de software de qualidade.


📎 Autor: João Victor Tadeu
🐙 GitHub: https://github.com/Tadeuzin24
📚 Disciplina: Software Engineering
🏫 Instituição: UniFecaf
