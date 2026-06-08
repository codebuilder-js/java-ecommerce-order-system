# E-Commerce Order Management System

Sistema de gerenciamento de pedidos desenvolvido em Java utilizando Programação Orientada a Objetos (POO), interfaces, validações e regras de negócio.

O projeto simula o funcionamento básico de um sistema de e-commerce capaz de:

* cadastrar produtos;
* controlar estoque;
* criar pedidos;
* adicionar itens;
* processar pagamentos;
* calcular totais automaticamente.

A aplicação foi construída com foco em:

* boas práticas;
* organização de código;
* escalabilidade;
* arquitetura orientada a objetos.

---

# 📌 Funcionalidades

## 🛒 Gerenciamento de Produtos

* Cadastro de produtos;
* Controle de estoque;
* Validação de preço;
* Validação de quantidade disponível.

---

## 👤 Gerenciamento de Clientes

* Cadastro de clientes;
* Validação de nome;
* Validação básica de e-mail.

---

## 📦 Gerenciamento de Pedidos

* Adição de produtos ao pedido;
* Cálculo automático do total;
* Controle de itens do pedido;
* Finalização de pedido.

---

## 💳 Processamento de Pagamentos

O sistema suporta múltiplas formas de pagamento:

* PIX;
* Cartão;
* Boleto.

---

## 🔒 Validações de Segurança

O sistema impede:

* produtos inválidos;
* estoque insuficiente;
* pagamentos inválidos;
* pedidos vazios;
* clientes inválidos;
* valores negativos.

---

# 🛠 Tecnologias Utilizadas

| Tecnologia         | Finalidade                     |
| ------------------ | ------------------------------ |
| Java               | Linguagem principal            |
| ArrayList          | Estrutura dinâmica de listas   |
| Interfaces         | Abstração de pagamentos        |
| POO                | Organização do sistema         |
| Exception Handling | Validações e regras de negócio |
| CLI                | Interface de linha de comando  |

---

# 📂 Estrutura do Projeto

```bash id="n9xk9l"
EcommerceOrderSystem/
 └── src/
      ├── Produto.java
      ├── Cliente.java
      ├── Pagamento.java
      ├── Pix.java
      ├── Cartao.java
      ├── Boleto.java
      ├── ItemPedido.java
      ├── Pedido.java
      └── Main.java
```

---

# 🏗 Arquitetura do Sistema

O projeto segue uma arquitetura orientada a objetos baseada em separação de responsabilidades.

| Classe       | Responsabilidade           |
| ------------ | -------------------------- |
| `Produto`    | Representa produtos        |
| `Cliente`    | Representa clientes        |
| `Pedido`     | Gerencia pedidos           |
| `ItemPedido` | Representa itens do pedido |
| `Pagamento`  | Contrato de pagamento      |
| `Pix`        | Pagamento via PIX          |
| `Cartao`     | Pagamento via cartão       |
| `Boleto`     | Pagamento via boleto       |
| `Main`       | Inicialização do sistema   |

---

# 📦 Classe Produto

Representa os produtos disponíveis no sistema.

---

## Funcionalidades

* Controle de estoque;
* Validação de dados;
* Exibição formatada;
* Redução de estoque.

---

## Atributos

```java id="lmx7rf"
private String nome;
private double preco;
private int estoque;
```

---

## Validações Aplicadas

```java id="p2z4yq"
if (nome == null || nome.isBlank())
```

```java id="u9l07h"
if (preco <= 0)
```

```java id="6lw5jt"
if (estoque < 0)
```

---

# 👤 Classe Cliente

Responsável pelos dados do cliente.

---

## Funcionalidades

* Armazenamento de nome;
* Armazenamento de e-mail;
* Validação básica de dados.

---

## Exemplo de Validação

```java id="yxw4s4"
if (email == null || !email.contains("@"))
```

---

# 💳 Interface Pagamento

O sistema utiliza o conceito de interfaces para permitir múltiplas implementações de pagamento.

```java id="3tkrhh"
public interface Pagamento
```

---

## Implementações Disponíveis

| Classe   | Tipo   |
| -------- | ------ |
| `Pix`    | PIX    |
| `Cartao` | Cartão |
| `Boleto` | Boleto |

---

# 🛒 Classe Pedido

Responsável por:

* gerenciar itens;
* calcular totais;
* finalizar pedidos;
* processar pagamentos.

---

## Funcionalidades

| Método               | Função                      |
| -------------------- | --------------------------- |
| `adicionarProduto()` | Adiciona produtos ao pedido |
| `getTotal()`         | Calcula total               |
| `fecharPedido()`     | Finaliza pedido             |

---

## Fluxo do Pedido

```text id="mzvl8x"
Cliente → Pedido → ItemPedido → Pagamento
```

---

# 🚀 Como Executar o Projeto

## Pré-requisitos

* Java JDK 17+;
* IDE Java ou terminal configurado.

Sugestões:

* Eclipse;
* IntelliJ IDEA;
* VS Code.

---

## Compilar o Projeto

```bash id="ybrx9f"
javac Main.java
```

---

## Executar o Projeto

```bash id="8mjlwm"
java Main
```

---

# 💻 Exemplo de Uso

## Criação dos Produtos

```java id="0b3jvh"
Produto p1 = new Produto("Notebook", 3500, 10);
Produto p2 = new Produto("Mouse", 50, 100);
```

---

## Definição do Pagamento

```java id="lp6uhg"
Pagamento pagamento = new Pix();
```

Pode ser alterado para:

```java id="2q7l8q"
new Cartao()
new Boleto()
```

---

## Saída Esperada

```text id="1fyj4u"
Pagamento via PIX: R$ 3600.0
Pedido finalizado para: João
Total do pedido: R$ 3600.0
```

---

# 🧠 Decisões Técnicas

---

## ✔ Uso de Interface

A interface:

```java id="jl1ayq"
Pagamento
```

permite:

* desacoplamento;
* extensibilidade;
* polimorfismo.

Novas formas de pagamento podem ser adicionadas facilmente.

---

## ✔ Encapsulamento

Todos os atributos são privados:

```java id="4j0bsm"
private String nome;
private double preco;
```

---

## ✔ Responsabilidade Única

Cada classe possui uma responsabilidade específica.

---

## ✔ Programação Defensiva

Uso de:

```java id="0b7mry"
IllegalArgumentException
IllegalStateException
```

para evitar inconsistências.

---

## ✔ Modularização

O sistema está preparado para futura separação em camadas:

* service;
* repository;
* dto;
* controller.

---

# ✅ Boas Práticas Aplicadas

## ✔ POO

* encapsulamento;
* abstração;
* polimorfismo;
* responsabilidade única.

---

## ✔ Código Escalável

Arquitetura preparada para crescimento.

---

## ✔ Legibilidade

* nomes claros;
* métodos objetivos;
* organização consistente.

---

## ✔ Regras de Negócio Centralizadas

Validações dentro das próprias entidades.

---

## ✔ Reutilização

As classes podem ser reaproveitadas em:

* APIs REST;
* sistemas web;
* aplicações desktop.

---

# 📚 Conceitos Aprendidos

Este projeto ajuda a praticar:

* Programação Orientada a Objetos;
* interfaces;
* polimorfismo;
* encapsulamento;
* collections (`List`);
* validações;
* exceptions;
* modelagem de sistemas;
* regras de negócio;
* arquitetura Java.

---

# 🔮 Melhorias Futuras

Possíveis evoluções do sistema:

* Persistência com banco de dados;
* Spring Boot;
* API REST;
* autenticação de usuários;
* integração com gateway de pagamento;
* geração de nota fiscal;
* relatórios financeiros;
* testes unitários com JUnit;
* Dockerização;
* microsserviços;
* interface gráfica com JavaFX;
* painel administrativo;
* histórico de pedidos;
* carrinho de compras;
* descontos e cupons.

---

# 🏗 Possível Evolução Arquitetural

Estrutura recomendada para evolução do sistema:

```bash id="v1jjv3"
src/
 ├── model/
 │    ├── Produto.java
 │    ├── Cliente.java
 │    ├── Pedido.java
 │    └── ItemPedido.java
 │
 ├── payment/
 │    ├── Pagamento.java
 │    ├── Pix.java
 │    ├── Cartao.java
 │    └── Boleto.java
 │
 ├── service/
 │
 ├── repository/
 │
 ├── dto/
 │
 ├── exception/
 │
 └── Main.java
```

---

# 👨‍💻 Autor

Rafael Correa de Lima 

@correa.pwb

---
