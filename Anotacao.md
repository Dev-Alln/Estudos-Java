# Um Pouco Sobre Java

## Variáveis

### Tipos de Variáveis

- String: Texto ("Olá").
- int: Números inteiros (123).
- float: Números com decimais (19,99).
- char: Único caractere ('a').
- boolean: Verdadeiro ou falso.

Variáveis Finais: Use a palavra-chave `final` para tornar uma variável constante e imutável.

### Nomeação de Variáveis

- Devem começar com uma letra (ou $, _).
- Podem conter letras, dígitos, sublinhados e cifrões.
- Não podem ter espaços e devem diferenciar maiúsculas de minúsculas.
- Não podem usar palavras reservadas.

### Tipos de Dados Não Primitivos

- Tipos de Referência: Referem-se a objetos.
- Diferenças:
  - Primitivos são predefinidos em Java; não primitivos são criados pelo programador.
  - Não primitivos podem chamar métodos; primitivos não.
  - Primitivos sempre têm valor; não primitivos podem ser `null`.
  - Primitivos começam com letra minúscula; não primitivos com letra maiúscula.
- Exemplos: Strings, Arrays, Classes, Interfaces.

## Operadores

Os operadores em Java são usados para realizar operações em variáveis e valores. Eles são divididos nos seguintes grupos:

1. Operadores Aritméticos: Realizam operações matemáticas básicas.
2. Operadores de Atribuição: Atribuem valores a variáveis.
3. Operadores de Comparação: Comparam dois valores ou variáveis.
4. Operadores Lógicos: Determinam a lógica entre variáveis ou valores.

### Operadores Aritméticos

| Operador | Nome         | Descrição                            | Exemplo  |
| -------- | ------------ | ------------------------------------ | -------- |
| +        | Adição       | Soma dois valores                    | `x + y`  |
| -        | Subtração    | Subtrai um valor de outro            | `x - y`  |
| *        | Multiplicação| Multiplica dois valores              | `x * y`  |
| /        | Divisão      | Divide um valor por outro            | `x / y`  |
| %        | Módulo       | Retorna o resto da divisão           | `x % y`  |
| ++       | Incremento   | Aumenta o valor de uma variável em 1 | `++x`    |
| --       | Decremento   | Diminui o valor de uma variável em 1 | `--x`    |

### Operadores de Atribuição

| Operador | Nome                        | Descrição                                          | Exemplo   |
| -------- | --------------------------- | -------------------------------------------------- | --------- |
| =        | Atribuição                  | Atribui um valor a uma variável                    | `x = 5`   |
| +=       | Atribuição de Adição        | Adiciona e atribui um valor a uma variável         | `x += 3`  |
| -=       | Atribuição de Subtração     | Subtrai e atribui um valor a uma variável          | `x -= 3`  |
| *=       | Atribuição de Multiplicação | Multiplica e atribui um valor a uma variável       | `x *= 3`  |
| /=       | Atribuição de Divisão       | Divide e atribui um valor a uma variável           | `x /= 3`  |
| %=       | Atribuição de Módulo        | Calcula o módulo e atribui um valor a uma variável | `x %= 3`  |
| &=       | Atribuição AND              | Realiza operação bit a bit AND e atribui           | `x &= 3`  |
| |=       | Atribuição OR               | Realiza operação bit a bit OR e atribui            | `x |= 3`  |
| ^=       | Atribuição XOR              | Realiza operação bit a bit XOR e atribui           | `x ^= 3`  |
| >>=      | Deslocamento à Direita      | Desloca bits à direita e atribui                   | `x >>= 3` |
| <<=      | Deslocamento à Esquerda     | Desloca bits à esquerda e atribui                  | `x <<= 3` |

### Operadores de Comparação

| Operador | Nome                    | Descrição                                     | Exemplo  |
| -------- | ----------------------- | --------------------------------------------- | -------- |
| ==       | Igual a                 | Compara se dois valores são iguais            | `x == y` |
| !=       | Diferente de            | Compara se dois valores são diferentes        | `x != y` |
| >        | Maior que               | Verifica se um valor é maior que outro        | `x > y`  |
| <        | Menor que               | Verifica se um valor é menor que outro        | `x < y`  |
| >=       | Maior ou igual a        | Verifica se um valor é maior ou igual a outro | `x >= y` |
| <=       | Menor ou igual a        | Verifica se um valor é menor ou igual a outro | `x <= y` |

### Operadores Lógicos

| Operador | Nome        | Descrição                                                      | Exemplo              |
| -------- | ----------- | -------------------------------------------------------------- | -------------------- |
| &&       | AND Lógico  | Retorna `true` se ambas as expressões forem verdadeiras        | `x < 5 && x < 10`    |
| \|\|     | OR Lógico   | Retorna `true` se uma das expressões for verdadeira            | `x < 5 \|\| x < 10`  |
| !        | NOT Lógico  | Inverte o resultado; retorna `false` se o resultado for `true` | `!(x < 5 && x < 10)` |

## Sobre String

Strings em Java são usadas para armazenar texto e são, na verdade, objetos que contêm métodos para realizar operações sobre elas. Alguns dos métodos principais incluem:

- `length()`: Retorna o comprimento da string.
- `toUpperCase()` e `toLowerCase()`: Convertem todos os caracteres de uma string para maiúsculas ou minúsculas.
- `indexOf()`: Retorna a posição da primeira ocorrência de um texto específico dentro da string.

## Matemática em Java

A classe Java Math oferece vários métodos para realizar operações matemáticas:

| Método               | Nome                     | Descrição                                                      | Exemplo                                      |
| -------------------- | ------------------------ | -------------------------------------------------------------- | -------------------------------------------- |
| `Math.max(x, y)`     | Máximo                   | Retorna o maior valor entre `x` e `y`.                         | `Math.max(5, 10)`                            |
| `Math.min(x, y)`     | Mínimo                   | Retorna o menor valor entre `x` e `y`.                         | `Math.min(5, 10)`                            |
| `Math.sqrt(x)`       | Raiz Quadrada            | Retorna a raiz quadrada de `x`.                                | `Math.sqrt(64)`                              |
| `Math.abs(x)`        | Valor Absoluto           | Retorna o valor absoluto (positivo) de `x`.                    | `Math.abs(-4.7)`                             |
| `Math.random()`      | Número Aleatório         | Retorna um número aleatório entre 0,0 e 1,0 (exclusivo).       | `Math.random()`                              |
| `Math.random() * 101`| Número Aleatório (0-100) | Gera um número aleatório entre 0 e 100.                        | `int randomNum = (int)(Math.random() * 101)` |





## Resumo sobre Booleanos em Java

Em Java, o tipo de dado booleano é usado para armazenar valores que só podem ser `true` (verdadeiro) ou `false` (falso). Esses valores são úteis em situações onde precisamos de respostas binárias, como em testes condicionais. Expressões booleanas retornam um valor booleano, que pode ser usado para criar lógica em programas. Operadores de comparação, como `>` (maior que) ou `==` (igual a), são frequentemente usados para avaliar expressões booleanas.


| Conceito                  | Descrição                                                                                   | Exemplo                                                       |
| ------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------- |
| `boolean`                 | Tipo de dado que armazena os valores `true` ou `false`.                                     | `boolean isJavaFun = true;`                                   |
| Expressão Booleana        | Retorna `true` ou `false` com base em uma comparação ou lógica.                             | `System.out.println(10 > 9); // returns true`                 |
| Operador `>`              | Compara se o valor à esquerda é maior que o valor à direita.                                | `System.out.println(x > y); // returns true`                  |
| Operador `==`             | Compara se dois valores são iguais.                                                         | `System.out.println(x == 10); // returns true`                |
| Operador `>=`             | Compara se o valor à esquerda é maior ou igual ao valor à direita.                          | `System.out.println(myAge >= votingAge); // true`             |
| Condicional `if...else`   | Executa um bloco de código se a condição for `true`, senão executa outro bloco.             | `if (myAge >= votingAge) { /* true */ } else { /* false */ }` |


## Condições e Instruções Condicionais em Java
Java suporta as seguintes condições lógicas e operadores:

Conceito                   | Descrição                                                                                       | Exemplo
-------------------------- | ----------------------------------------------------------------------------------------------- | --------------------------------------------------------------
if                         | Executa um bloco de código se a condição for `true`.                                            | if (x > y) { System.out.println("x é maior que y"); }
else                       | Executa um bloco de código se a condição do `if` for `false`.                                   | if (x > y) { /* código */ } else { System.out.println("x não é maior que y"); }
else if                    | Testa uma nova condição se a condição anterior for `false`.                                     | if (x > y) { /* código */ } else if (x == y) { System.out.println("x é igual a y"); }
switch                     | Permite especificar múltiplos blocos alternativos de código baseados no valor de uma expressão. | switch (day) { case 1: System.out.println("Segunda"); break; case 2: System.out.println("Terça"); break; default: System.out.println("Outro dia"); }
Operador Ternário          | Substitui uma instrução `if...else` simples por uma linha de código.                            | String result = (time < 18) ? "Good day." : "Good evening.";
