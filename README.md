Sistema de Cadastro de Brinquedos

Descrição

Este projeto é uma aplicação desenvolvida com Spring Boot e Java que permite gerenciar o cadastro de brinquedos voltados para crianças de até 12 anos. A aplicação oferece operações básicas de CRUD (Create e Read) utilizando uma API REST que interage com um banco de dados Oracle para armazenar as informações dos brinquedos.

Funcionalidades

Cadastro de Brinquedos: Inserção de novos brinquedos via POST.
Consulta de Brinquedos: Recuperação de todos os brinquedos cadastrados ou de um brinquedo específico via GET.

Estrutura de Dados

Cada brinquedo é armazenado no banco de dados com as seguintes informações:

Id: Identificador único gerado automaticamente.

Nome: Nome do brinquedo.

Tipo: Categoria do brinquedo (por exemplo, veículo, jogo de mesa).

Classificação: Faixa etária recomendada (exemplo: "3+ anos").

Tamanho: Descrição do tamanho (pequeno, médio, grande).

Preço: Valor em moeda (R$).

Exemplo de Requisição (POST)

Aqui está um exemplo de como cadastrar um brinquedo utilizando o Postman ou outra ferramenta de teste de API:

Endpoint:

POST http://localhost:8080/brinquedos

Corpo da Requisição (JSON):

json
    {
        "id": 4,
        
        "nome": "Boneca",
        
        "tipo": "Boneca de Pano",
        
        "classificacao": "5+ anos",
        
        "tamanho": "Médio",
        
        "preco": 49.9
        
    }
Exemplo de Resposta (JSON):

json

    {
        "id": 4,
        
        "nome": "Boneca",
        
        "tipo": "Boneca de Pano",
        
        "classificacao": "5+ anos",
        
        "tamanho": "Médio",
        
        "preco": 49.9
        
    }
Corpo da Requisição (JSON):

json
    {
    
    "nome": "Quebra-cabeça",
    
    "tipo": "Jogo de Mesa",
    
    "classificacao": "6+ anos",
    
    "tamanho": "Grande",
    
    "preco": 79.90
    
}
Exemplo de Resposta (JSON):

json
    {
    
    "nome": "Quebra-cabeça",
    
    "tipo": "Jogo de Mesa",
    
    "classificacao": "6+ anos",
    
    "tamanho": "Grande",
    
    "preco": 79.90
    
}

Exemplo de Requisição (GET)

Endpoint para listar todos os brinquedos:

GET http://localhost:8080/brinquedos

Endpoint para buscar um brinquedo por ID:

GET http://localhost:8080/brinquedos/{id}

Tecnologias Utilizadas

Java 17

Spring Boot 3.2.10

Spring Data JPA

Oracle Database

Maven

Postman (para testes de API)


Como Executar o Projeto

Clone o repositório do GitHub:
git clone https://github.com/seu-usuario/brinquedos-spring-boot.git

Navegue até o diretório do projeto:

cd brinquedos-spring-boot

Configure a conexão com o banco de dados Oracle no arquivo application.properties:

properties

spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL

spring.datasource.username=seu_usuario

spring.datasource.password=sua_senha

spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update

spring.jpa.database-platform=org.hibernate.dialect.OracleDialect

Compile e execute o projeto:

mvn spring-boot:run

Acesse o aplicativo via Postman ou outro cliente HTTP usando os endpoints mencionados acima.

Contribuidores

Giovanna Lima Giantomaso - RM553369

Gabriel Artacho - RM553527

Rebeca Lopes - RM553764

SEGUE FOTOS QUE MOSTRA O SUCESSO DO GET E POST:

![post1](https://github.com/user-attachments/assets/a506bba0-c1e1-494b-bc62-4531bcf435b6)
![post2](https://github.com/user-attachments/assets/b7ef56f8-b1f7-40bd-92f1-1d8541cd1fdd)
![post4](https://github.com/user-attachments/assets/fba38043-d943-4942-aab8-e813433ade38)
![get4](https://github.com/user-attachments/assets/1ab026c9-b632-4476-b0a8-db0939ec6087)
![get3](https://github.com/user-attachments/assets/ffc10f3e-4104-4b30-9f82-5b34a09f83f9)






