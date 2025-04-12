# Gerenciador Escolar

O **Gerenciador Escolar** é uma aplicação web desenvolvida para gerenciar informações de alunos e professores, permitindo realizar operações de CRUD (Create, Read, Update, Delete) para ambos. O sistema foi desenvolvido utilizando o framework **Spring Boot** no back-end, com uma interface simples e intuitiva.

O **back-end** foi completamente desenvolvido por mim, utilizando **Java** e o framework **Spring Boot**. Para o **front-end**, foi utilizado um template de exemplo, que foi personalizado e adaptado conforme as necessidades do projeto.

## Tecnologias Usadas

- **Back-end**: Desenvolvido em **Java** com o framework **Spring Boot**.
- **Front-end**: Utilizou-se um template de exemplo, com **Thymeleaf** para renderizar o conteúdo dinâmico no lado do servidor e **HTML/CSS** para o design da interface.
- **Banco de Dados**: Usado para persistir os dados dos alunos e professores ( MySQL).

## Funcionalidades

### Para Alunos
- **Listar Alunos**: Exibe todos os alunos cadastrados.
- **Cadastrar Novo Aluno**: Permite cadastrar um novo aluno.
- **Editar Aluno**: Permite editar as informações de um aluno.
- **Deletar Aluno**: Remove um aluno do sistema.

### Para Professores
- **Listar Professores**: Exibe todos os professores cadastrados.
- **Cadastrar Novo Professor**: Permite cadastrar um novo professor.
- **Editar Professor**: Permite editar as informações de um professor.
- **Deletar Professor**: Remove um professor do sistema.

## Endpoints

### Alunos

- **GET /alunos**: Lista todos os alunos cadastrados.
- **GET /alunos/novo**: Exibe o formulário para cadastro de um novo aluno.
- **POST /alunos/salvar**: Salva um novo aluno no banco de dados.
- **GET /alunos/editar/{id}**: Exibe o formulário para editar os dados de um aluno.
- **POST /alunos/atualizar/{id}**: Atualiza as informações de um aluno existente.
- **GET /alunos/deletar/{id}**: Deleta um aluno do sistema.

### Professores

- **GET /professores**: Lista todos os professores cadastrados.
- **GET /professores/novo**: Exibe o formulário para cadastro de um novo professor.
- **POST /professores/salvar**: Salva um novo professor no banco de dados.
- **GET /professores/editar/{id}**: Exibe o formulário para editar os dados de um professor.
- **POST /professores/atualizar/{id}**: Atualiza as informações de um professor existente.
- **GET /professores/deletar/{id}**: Deleta um professor do sistema.


