
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

## Árvores (Trees)

É uma estrutura de dados não linear, onde cada nó da árvore pode se ligar a vários nós, ao contrário de estruturas de 
dados como pilhas e filas. Existem algumas propriedades, dentre elas o nós raiz, que é o nó que não possui um nó pai. 
Um nó pai é aquele que possui descendentes, ou filhos.
Os nós que não possuem filhos são chamados de folhas.
Estruturas de Árvores podem ser utilizadas em indexação de banco de dados.

### Árvores Binárias
São árvores onde um nó possui no máximo dois filhos. Existem três classificações:
- Árvore Cheia: Uma árvore binária é cheia se todos os nós têm 0 ou 2 filhos. Nenhum nó tem exatamente um filho.
- Árvore Não Cheia: Uma árvore binária não cheia é aquela que não atende aos critérios de uma árvore binária cheia. 
Ou seja, alguns nós podem ter apenas um filho.
- Árvore Perfeita: Uma árvore binária é perfeita se todos os níveis, incluindo o último, estão completamente 
preenchidos.
- Árvore Completa: Uma árvore binária é completa se todos os níveis, exceto possivelmente o último, estão completamente 
preenchidos e todos os nós estão o mais à esquerda possível.

Podemos inferir que uma Árvore Perfeita possui, no máximo, $2^n$ no nível n. Portanto o número total de elementos é $2^{N+1} - 1$. A altura de uma árvore é $N+1$.

### Principais Operações
1. Inicialização
2. Inserção: ``insert``
3. Verificar se um nó é folha: ``isLeaf``
4. Travessia:
   1. pré ordem - RAIZ -> ESQUERDA -> DIREITA
   2. em ordem - ESQUERDA -> RAIZ -> DIREITA
   3. pós ordem - ESQUERDA -> DIREITA -> RAIZ
5. Busca:
   1. Busca em Largura (BFS)
   2. Busca em Profundidade (DFS)

### Exemplos sobre os tipos de travessia
#### Pré Ordem (R-E-D)
#### Em Ordem (E-R-D)
#### Pós Ordem (E-D-R)

### Conclusão
- Estrutura dinâmica;
- Não linear;
- Armazenamento de informação
- Múltiplos algoritmos de busca e travessia

### Árvore Binária de Busca
A árvore de Busca Binária é uma estrutura de dados de árvore binária, onde todos os nós da subárvore esquerda possuem 
um valor numérico inferior ou igual ao nó raiz e todos os nós da subárvore direita possuem um valor superior ao nó raiz.

### Qual a vantagem disso?
Todo o lado direito de um determinado nó são maiores que ele e todos do lado esquerdo são menores ou iguais.

#### Principais Operações
1. Inserção de um item ``insert``
2. Verificar se um item está presente naquela árvore ``contains``
3. Remoção de um item ``deleteNode``


###   Conclusão
1. Estrutura dinâmica;
2. Possuem regra de inserção;
3. Utilizado para armazenamento, busca, ordenação de elementos


## Resolvendo Problemas

Na última aula foram discutidos três problemas comumente encontrados em situações de validação técnica. Os códigos 
relacionados podem ser encontrandos no caminho
```
   src/main/java/problem
```

### Problema: Balanceamento de colchetes em uma expressão

**Enunciado:** Data uma string de expressão ``exp``, escreva um programa para examinar se os pares e as ordens de `"{"`, 
`"{"`, `"("`, `")"`, `"["`, `"]"` estão corretos na expressão dada.

1. `2*(3+4+5*[2+3)]`
2. `2*(3+4+5*[2+3])`
3. `[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]`

### Problema: Revertendo os primeiros `k` elementos de uma fila

**Enunciado:** Dado um inteiro ``k`` e uma fila de inteiros, a tarefa é inverter a ordem dos primeiros `k` elementos da 
fila, deixando os demais elementos na mesma ordem relativa.

```
[1, 2, 3, 4, 5] -> k=2 -> [2, 1, 3, 4, 5]
```

### Problema: Maior valor em cada nível da Árvore Binária

**Enunciado:** Dada uma árvore binária, encontre o maior valor em cada nível.

**Algoritmo:**
1. Utilize o algoritmo BFS para percorrer a árvore e uma lista auxiliar.
2. Para cada elemento e seu nível na árvore:
   - Se a lista possuir o índice = nível, substitua pelo maior valor
   - Senão adicione na lista