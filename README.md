# Curso de Java - Loops while e do-while

Este repositório contém exemplos práticos e exercícios sobre loops `while` e `do-while` em Java, desenvolvidos como parte de um curso de programação.

## 📚 Conteúdo

O projeto demonstra três implementações diferentes utilizando estruturas de repetição:

### 1. Calculadora de Média de Notas
Um programa que calcula a média aritmética de notas de alunos usando loop `while`.

**Funcionalidades:**
- Entrada contínua de notas
- Finalização com valor -1
- Cálculo automático da média
- Tratamento para caso sem notas inseridas

### 2. Exibição de Números Pares e Ímpares
Dois exemplos usando loop `do-while` para exibir:
- Números ímpares de 1 a 20
- Números pares de 1 a 20

### 3. Sistema de Controle de Estoque
Um sistema completo de gerenciamento de estoque com menu interativo usando `do-while`.

**Funcionalidades:**
- ✅ Adicionar novos produtos
- 📈 Registrar entrada no estoque
- 📉 Registrar saída do estoque
- 📋 Listar todos os produtos
- 🚪 Sair do sistema

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou terminal

### Executando o Projeto

1. Clone o repositório:
```bash
git clone <url-do-repositorio>
cd java-loops-course
```

2. Compile o arquivo:
```bash
javac Main.java
```

3. Execute o programa:
```bash
java Main
```

## 💡 Conceitos Abordados

### Loop While
```java
while (condição) {
    // código a ser executado
}
```
- Testa a condição **antes** de executar o bloco
- Pode não executar nenhuma vez se a condição for falsa inicialmente

### Loop Do-While
```java
do {
    // código a ser executado
} while (condição);
```
- Executa o bloco **pelo menos uma vez**
- Testa a condição **após** a execução do bloco

## 🔧 Estrutura do Código

O arquivo `Main.java` contém:

- **Seção comentada**: Exemplos da calculadora de média e exibição de números
- **Seção ativa**: Sistema de controle de estoque completo

Para testar os outros exemplos, descomente as seções correspondentes e comente o sistema de estoque.

## 📖 Exemplos de Uso

### Sistema de Controle de Estoque

```
==== Sistema de Controle de Estoque ====
1. Adicionar Produto
2. Registrar Entrada no Estoque
3. Registrar Saída do Estoque  
4. Listar Produtos
5. Sair
Escolha uma opção: 1

Digite o nome do produto: Notebook
Digite a quantidade inicial: 10
Produto adicionado com sucesso!
```

## 🎯 Objetivos de Aprendizagem

Ao estudar este código, você aprenderá:

- Diferenças entre `while` e `do-while`
- Quando usar cada tipo de loop
- Implementação de menus interativos
- Manipulação de listas (ArrayList)
- Validação de entrada do usuário
- Estruturas de controle (switch-case)

## 🤝 Contribuição

Este é um projeto educacional. Sugestões e melhorias são bem-vindas!

## 📝 Notas

- O código utiliza `Scanner` para entrada de dados
- `ArrayList` é usado para armazenamento dinâmico
- Implementa validação básica de entrada
- Exemplo prático de sistema CRUD simples

---

**Autor**: Vinícius Santos Briches  
**Curso**: Programação em Java - Estruturas de Repetição  
**Data**: 2025
