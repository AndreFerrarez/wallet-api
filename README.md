# Projeto Wallet API com Spring Boot

Uma API RESTful simples para gerenciar transações financeiras (Depósitos e Saques), construída com Java e Spring Boot. O projeto implementa um CRUD completo e segue as melhores práticas de uma arquitetura em camadas.

## 🚀 Tecnologias Principais

- **Java 21 (LTS)**
- **Spring Boot 3.5**
- **Spring Data JPA & Hibernate**
- **H2 Database (In-Memory)**
- **Maven**
- **Lombok**

## 🔧 Pré-requisitos

- JDK 21 ou superior
- Maven 3.8 ou superior

## ▶️ Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/AndreFerrarez/wallet-api.git
    ```

2.  **Navegue até a pasta do projeto:**
    ```bash
    cd wallet-api
    ```

3.  **Execute a aplicação com o Maven:**
    ```bash
    mvn spring-boot:run
    ```

4.  A API estará disponível em `http://localhost:8080`.

## 🔌 Endpoints da API

A API oferece os seguintes endpoints para o gerenciamento de transações:

| Método | Endpoint                | Descrição                                | Exemplo de Body (Payload)                                        |
| :----- | :---------------------- | :--------------------------------------- | :--------------------------------------------------------------- |
| `GET`    | `/transacoes`           | Lista todas as transações.               | N/A                                                              |
| `GET`    | `/transacoes/{id}`      | Busca uma transação específica por ID.   | N/A                                                              |
| `POST`   | `/transacoes`           | Cria uma nova transação.                 | `{ "tipo": "DEPOSITO", "valor": 5.25, "moeda": "ETH" }`            |
| `PUT`    | `/transacoes/{id}`      | Atualiza uma transação existente por ID. | `{ "tipo": "SAQUE", "valor": 1.0, "moeda": "BTC" }`               |
| `DELETE` | `/transacoes/{id}`      | Deleta uma transação por ID.             | N/A                                                              |

## 🗃️ Acesso ao Banco de Dados H2

Durante a execução, é possível acessar o console do banco de dados em memória.

- **URL:** `http://localhost:8080/h2-console`
- **JDBC URL:** `jdbc:h2:mem:walletdb`
- **User Name:** `sa`
- **Password:** (deixe em branco)

---
