# ContaBanco 🏦

Projeto desenvolvido durante a trilha **Java Básico** da [DIO], em forma de desafio, com o objetivo de praticar a sintaxe java, estrutura de programas em Java, declaração de variáveis, entrada de dados via terminal, manipulação e concatenação de strings em Java.

---

## 📋 Sobre o projeto

O desefio consiste em solicitar ao usuário que insira os dados de uma conta bancária pelo terminal e, ao final, exibe uma mensagem de confirmação com todas as informações fornecidas.

---

## 🖥️ Exemplo de execução

```
=== Bem-vindo ao Banco Digital ===

Por favor, digite o número da Conta: 1021
Por favor, digite o número da Agência: 067-8
Por favor, digite o nome do Cliente: MARIO ANDRADE
Por favor, digite o saldo da Conta: 237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco!
Agência: 067-8
Conta: 1021
Saldo: 237.48 já está disponível para saque
```

---

## 🧱 Estrutura do projeto

```
conta-banco/
└── src/
    └── ContaTerminal.java
```

---

## 📌 Atributos da conta

| Atributo      | Tipo    | Exemplo       |
|---------------|---------|---------------|
| Numero        | int     | 1021          |
| Agencia       | String  | 067-8         |
| Nome Cliente  | String  | MARIO ANDRADE |
| Saldo         | double  | 237.48        |

---

## 🧪 Conceitos praticados

- Declaração de variáveis com tipos primitivos e `String`
- Leitura de dados via terminal com a classe `Scanner`
- Uso de `sc.useLocale(Locale.US)` para aceitar decimais com ponto (`.`)
- Concatenação de strings com o operador `+` e o método `.concat()`
- Saída de dados com `System.out.println()`

---

## ▶️ Como executar

**Pré-requisito:** JDK instalado (versão 8 ou superior)

```bash
# Compilar
javac src/ContaTerminal.java

# Executar
java -cp src ContaTerminal
```

---

## 👨‍💻 Autor

Ely Junior e @Copilot

