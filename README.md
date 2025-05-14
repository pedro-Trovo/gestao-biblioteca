<h1>Gestão de Biblioteca</h1>

## Tópicos

- [Sobre o Projeto](#sobre-o-projeto)
- [Tecnologias](#tecnologias)
- [Contribuidores](#contribuidores)
- [Pré-requisitos](#pré-requisitos)
- [Inicializando o Projeto](#inicializando-o-projeto)
- [Endpoints Disponíveis](#endpoints-disponíveis)

# Sobre o Projeto
Este projeto é uma API de gestão de biblioteca, desenvolvida para gerenciar livros, com funcionalidades para cadastro, pesquisa, atualização, remoção, e a capacidade de emprestar e devolver livros. A aplicação é voltada para uso interno, com foco em facilitar a organização e controle de livros de uma biblioteca.

# Tecnologias
Este projeto utiliza o Spring Boot para a construção de uma API RESTful, com persistência em banco de dados MySQL. O gerenciamento das operações de banco de dados é feito com Spring Data JPA. Para a parte de validação de dados, foi utilizado o Hibernate Validator.
<table align="center">
    <tr>
        <th>
            Linguagens
        </th>
        <td>
            <img alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <th>
            Frameworks
        </th>
        <td>
            <img alt="Spring" src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white"/>
            <img alt="MySQL" src="https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white">
        </td>
    </tr>
    <tr>
        <th>
            Editor
        </th>
        <td>
            <img alt="Visual Studio Code" src="https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white"/>
        </td>
    </tr>
</table>


# Contribuidores
<a href="https://github.com/pedro-Trovo/gestao-biblioteca/graphs/contributors"> <img src="https://contrib.rocks/image?repo=pedro-Trovo/gestao-biblioteca" /> </a>

# Pré-requisitos
1. Instale o [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) (ou superior) em sua máquina.
2. Instale o [MySQL](https://dev.mysql.com/downloads/mysql/) e crie um banco de dados para o projeto.
3. Configure o arquivo `application.properties` com as informações do banco de dados.

# Inicializando o projeto
1. Faça um `git clone` do repositório:
```console
git clone https://github.com/pedro-Trovo/gestao-biblioteca
```
2. Acesse a pasta `biblioteca-api`, abra o CMD e execute o seguinte código:
```console
cd biblioteca-api
```
3. Execute o projeto com Maven:
```console
./mvnw spring-boot:run
```
# Endpoints Disponíveis

### 1. Cadastro de Livro
**POST** `/api/livros`  
Cadastra um novo livro.

### 2. Atualização de Livro
**PUT** `/api/livros`  
Atualiza um livro existente.

### 3. Excluir Livro
**DELETE** `/api/livros/{id}`  
Remove um livro pelo ID.

### 4. Buscar Livro por ID
**GET** `/api/livros/{id}`  
Busca um livro pelo ID.

### 5. Listar Todos os Livros
**GET** `/api/livros`  
Lista todos os livros cadastrados.

### 6. Buscar Livro por Termo
**GET** `/api/livros/busca/{termo}`  
Busca livros pelo título ou autor.

### 7. Buscar Livro por ISBN
**GET** `/api/livros/isbn/{isbn}`  
Busca livro pelo ISBN.

### 8. Buscar Livro por Ano de Publicação
**GET** `/api/livros/ano/{ano}`  
Busca livros por ano de publicação.

### 9. Emprestar Livro
**PUT** `/api/livros/emprestar/{id}`  
Marca um livro como emprestado.

### 10. Devolver Livro
**PUT** `/api/livros/devolver/{id}`  
Marca um livro como devolvido.

