
#  Introdução à Estrutura de Dados | Santander Coders 2024 | Back-End

Este repositório tem a finalidade de registrar minhas anotações de conceitos, fundamentos e exemplos desenvolvidos e
implementados ao longo do curso de Introdução à Estrutura de Dados.
O curso foi ministrado pelo instrutor João Carlos Sousa Vale e desenvolvido em Java com linguagem de programação.


## Problema: Lista de Supermercado

Precisamos construir uma aplicação para registrarmos itens em falta e precisam ser comprados quando irmos ao 
supermercado. Principais operações:

1. Adicionar item
2. Listar itens presentes na lista
3. Remover item da lista

 
## Listas Ligadas (Linked Lists)

É um estrutura de dados dinâmica, linear e formada por nós. Cada nó pode guardar uma informação e também a
referência de outro nó. Por exemplo, se eu quero armazenar o valor 1 em uma lista encadeada que armazena números, então
eu tenho que criar um nó que irá armazenar o valor 1 e a referência pro próximo nó. Como temos apenas um valor, esse nó
deve apontar para o valor NULL. Se eu quero adicionar outro valor nessa lista, como o valor 2, eu tenho que criar um novo
nó, adicionar o valor 2 e apontá-lo também para NULL. E agora eu junto o primeiro elemento (1) ao segundo elemento (2),
de modo que (1) aponta para (2) e (2) aponta para NULL. Ou seja
```
(1) -> (2) -> NULL
```

### Principais Operações
1. Adição de itens:
   1. No início: `prepend`
   2. No final: `append`
   3. Em uma determinada posição: `insert`
2. Leitura de itens:
    1. No início: `getHead`
    2. No final: `getTail`
    3. Em uma determinada posição: `get`
3. Remoção de itens:
    1. No início: `removeFirst`
    2. No final: `removeLast`
    3. Em uma determinada posição: `delete`
4. Imprimir: `print`

### Operações Opcionais

1. Tamanho Atual: `getLength`
2. Está vazia?: `isEmpty`
3. Esvaziar lista: `makeEmpty`

### Principais Vantagens

1. Estrutura dinâmica
2. Utilização de memória
3. Utilização na construção de outras estruturas

## Pilhas (Stacks)

## Filas (Queues)