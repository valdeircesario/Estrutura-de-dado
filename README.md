# Estruturas de Dados - Algoritmos de Ordenação

Neste repositório, você encontrará uma coleção de algoritmos de ordenação de arrays, incluindo *Bubble Sort*, *Insertion Sort*, *Selection Sort*, *Merge Sort*, *Quick Sort* e outros. Todos os algoritmos foram implementados em Java, com código de fácil compreensão para facilitar o aprendizado e o entendimento da lógica por trás de cada método.

---

### Algoritmos de Ordenação

Abaixo, você encontrará uma breve explicação de cada algoritmo de ordenação implementado neste repositório:

# Bubble Sort

O Bubble Sort é um algoritmo de ordenação simples que organiza elementos em uma lista por comparação e troca. Abaixo, você encontrará uma descrição detalhada de como funciona, suas complexidades e suas vantagens e desvantagens.

## Como Funciona

1. **Comparação**: O algoritmo começa no início da lista e compara os primeiros dois elementos.
2. **Troca**: Se o primeiro elemento é maior que o segundo, eles são trocados.
3. **Iteração**: O algoritmo continua comparando e trocando elementos adjacentes até chegar ao final da lista.
4. **Repetição**: Após cada passagem pela lista, o maior elemento "borbulha" para o final. O processo é repetido para os elementos restantes (excluindo o último, que já está na posição correta) até que não haja mais trocas.

### Exemplo de Funcionamento

Considere a lista `[5, 3, 8, 4, 2]`:

- **Primeira Passagem**:
  - Comparar 5 e 3 → troca → `[3, 5, 8, 4, 2]`
  - Comparar 5 e 8 → não troca
  - Comparar 8 e 4 → troca → `[3, 5, 4, 8, 2]`
  - Comparar 8 e 2 → troca → `[3, 5, 4, 2, 8]`

- **Segunda Passagem**:
  - Comparar 3 e 5 → não troca
  - Comparar 5 e 4 → troca → `[3, 4, 5, 2, 8]`
  - Comparar 5 e 2 → troca → `[3, 4, 2, 5, 8]`

- **Terceira Passagem**:
  - Comparar 3 e 4 → não troca
  - Comparar 4 e 2 → troca → `[3, 2, 4, 5, 8]`

- **Quarta Passagem**:
  - Comparar 3 e 2 → troca → `[2, 3, 4, 5, 8]`

Após essa passagem, a lista está ordenada.

## Complexidade

- **Tempo**:
  - **Melhor Caso**: \(O(n)\) (lista já ordenada)
  - **Caso Médio e Pior**: \(O(n^2)\)

- **Espaço**: \(O(1)\) (in-place)

## Vantagens

- Simplicidade de implementação.
- Fácil de entender e ensinar.

## Desvantagens

- Ineficiente para listas grandes.
- Existem algoritmos mais eficientes, como Quick Sort e Merge Sort.

## Conclusão

O Bubble Sort é uma boa opção para listas pequenas ou para fins educacionais. Para aplicações práticas, geralmente é preferível usar algoritmos de ordenação mais eficientes.

# Insertion Sort

O Insertion Sort é um algoritmo de ordenação simples que constrói uma lista ordenada um elemento de cada vez, inserindo cada novo elemento na posição correta em uma lista já ordenada. Abaixo, você encontrará uma descrição detalhada de como funciona, suas complexidades e suas vantagens e desvantagens.

## Como Funciona

1. **Divisão**: A lista é dividida em duas partes: uma parte ordenada e uma parte não ordenada. Inicialmente, a parte ordenada contém apenas o primeiro elemento.
2. **Inserção**: O algoritmo pega o primeiro elemento da parte não ordenada e o insere na posição correta da parte ordenada. Isso é feito comparando o elemento a ser inserido com os elementos da parte ordenada, da direita para a esquerda.
3. **Repetição**: O processo se repete até que não haja mais elementos na parte não ordenada.

### Exemplo de Funcionamento

Considere a lista `[5, 3, 8, 4, 2]`:

- **Primeira Passagem**:
  - O elemento `3` é selecionado e comparado com `5`. Como `3` é menor, ele é inserido antes de `5`. A lista agora é `[3, 5, 8, 4, 2]`.

- **Segunda Passagem**:
  - O elemento `8` é selecionado. Como `8` é maior que `5`, não há troca. A lista continua `[3, 5, 8, 4, 2]`.

- **Terceira Passagem**:
  - O elemento `4` é selecionado e comparado com `8`. Como `4` é menor, `8` é movido para a direita. A lista temporariamente se torna `[3, 5, 8, 8, 2]`. Em seguida, `4` é comparado com `5` e movido novamente. A lista agora é `[3, 4, 5, 8, 2]`.

- **Quarta Passagem**:
  - O elemento `2` é selecionado e comparado com `8`, `5`, `4` e `3`. Como `2` é menor que todos esses elementos, ele é inserido na primeira posição. A lista final é `[2, 3, 4, 5, 8]`.

## Complexidade

- **Tempo**:
  - **Melhor Caso**: \(O(n)\) (lista já ordenada)
  - **Caso Médio e Pior**: \(O(n^2)\)

- **Espaço**: \(O(1)\) (in-place)

## Vantagens

- Simplicidade de implementação.
- Funciona bem em listas pequenas ou em listas que já estão parcialmente ordenadas.

## Desvantagens

- Ineficiente para listas grandes.
- A complexidade do tempo no pior caso é alta em comparação com algoritmos mais eficientes.

## Conclusão

O Insertion Sort é uma boa opção para listas pequenas ou para situações em que a lista já está quase ordenada. Para aplicações práticas com listas maiores, geralmente é preferível usar algoritmos de ordenação mais eficientes.

# Selection Sort

O Selection Sort é um algoritmo de ordenação simples que divide a lista em duas partes: uma parte ordenada e uma parte não ordenada. O algoritmo repetidamente seleciona o menor (ou maior, dependendo da ordem desejada) elemento da parte não ordenada e o coloca no final da parte ordenada. Abaixo, você encontrará uma descrição detalhada de como funciona, suas complexidades e suas vantagens e desvantagens.

## Como Funciona

1. **Divisão**: A lista é dividida em duas partes: uma parte ordenada, que inicialmente está vazia, e uma parte não ordenada, que contém todos os elementos.
2. **Seleção**: O algoritmo percorre a parte não ordenada para encontrar o menor elemento.
3. **Troca**: O menor elemento encontrado é trocado com o primeiro elemento da parte não ordenada, adicionando-o assim à parte ordenada.
4. **Repetição**: O processo é repetido para os elementos restantes até que toda a lista esteja ordenada.

### Exemplo de Funcionamento

Considere a lista `[5, 3, 8, 4, 2]`:

- **Primeira Passagem**:
  - O menor elemento é `2`. Ele é trocado com `5`. A lista agora é `[2, 3, 8, 4, 5]`.

- **Segunda Passagem**:
  - O menor elemento na sublista `[3, 8, 4, 5]` é `3`. Não há troca necessária. A lista continua `[2, 3, 8, 4, 5]`.

- **Terceira Passagem**:
  - O menor elemento na sublista `[8, 4, 5]` é `4`. Ele é trocado com `8`. A lista agora é `[2, 3, 4, 8, 5]`.

- **Quarta Passagem**:
  - O menor elemento na sublista `[8, 5]` é `5`. Ele é trocado com `8`. A lista final é `[2, 3, 4, 5, 8]`.

## Complexidade

- **Tempo**:
  - **Melhor Caso, Caso Médio e Pior Caso**: \(O(n^2)\)

- **Espaço**: \(O(1)\) (in-place)

## Vantagens

- Simplicidade de implementação.
- Não requer espaço adicional significativo.

## Desvantagens

- Ineficiente para listas grandes devido à complexidade quadrática.
- Não é adaptativo, ou seja, não melhora seu desempenho em listas parcialmente ordenadas.

## Conclusão

O Selection Sort é uma boa opção para listas pequenas ou para fins educacionais. Para aplicações práticas, especialmente com listas grandes, é preferível usar algoritmos de ordenação mais eficientes.
# Merge Sort

O Merge Sort é um algoritmo de ordenação eficiente que utiliza o conceito de divisão e conquista. Ele divide a lista em sublistas menores, ordena essas sublistas e, em seguida, as combina para formar uma lista ordenada. Abaixo, você encontrará uma descrição detalhada de como funciona, suas complexidades e suas vantagens e desvantagens.

## Como Funciona

1. **Divisão**: A lista é dividida em duas metades até que cada sublista contenha um único elemento (uma lista com um único elemento é considerada ordenada).
2. **Conquista**: As sublistas são combinadas de forma ordenada. Duas sublistas são comparadas e os elementos são mesclados em uma nova lista, ordenando-os durante o processo.
3. **Repetição**: O processo de divisão e combinação continua até que toda a lista esteja ordenada.

### Exemplo de Funcionamento

Considere a lista `[38, 27, 43, 3, 9, 82, 10]`:

- **Divisão**:
  - Dividir a lista em duas partes: `[38, 27, 43]` e `[3, 9, 82, 10]`.
  - Continue dividindo até obter sublistas únicas:
    - `[38]`, `[27]`, `[43]`, `[3]`, `[9]`, `[82]`, `[10]`.

- **Conquista**:
  - Começar a mesclar:
    - Mesclar `[38]` e `[27]` → `[27, 38]`
    - Mesclar `[27, 38]` e `[43]` → `[27, 38, 43]`
    - Mesclar `[3]` e `[9]` → `[3, 9]`
    - Mesclar `[3, 9]` e `[82]` → `[3, 9, 82]`
    - Mesclar `[3, 9, 82]` e `[10]` → `[3, 9, 10, 82]`
  - Finalmente, mesclar `[27, 38, 43]` e `[3, 9, 10, 82]` para obter a lista ordenada `[3, 9, 10, 27, 38, 43, 82]`.

## Complexidade

- **Tempo**:
  - **Melhor Caso, Caso Médio e Pior Caso**: \(O(n \log n)\)

- **Espaço**: \(O(n)\) (não é in-place, pois utiliza espaço adicional para as sublistas)

## Vantagens

- Eficiente para listas grandes.
- Estável, mantém a ordem relativa dos elementos iguais.

## Desvantagens

- Requer espaço adicional para as sublistas, o que pode ser um problema em ambientes com memória restrita.
- A implementação é mais complexa em comparação com algoritmos simples como Bubble Sort e Selection Sort.

## Conclusão

O Merge Sort é uma excelente escolha para ordenar listas grandes e é amplamente utilizado em algoritmos de ordenação devido à sua eficiência. Para listas menores, algoritmos mais simples podem ser preferidos, mas o Merge Sort é uma escolha sólida para aplicações que exigem desempenho consistente.

# Quick Sort

O Quick Sort é um algoritmo de ordenação eficiente que utiliza o conceito de divisão e conquista. Ele seleciona um elemento chamado "pivô" e particiona a lista em sublistas de elementos menores e maiores do que o pivô. Em seguida, aplica recursivamente o mesmo processo às sublistas. Abaixo, você encontrará uma descrição detalhada de como funciona, suas complexidades e suas vantagens e desvantagens.

## Como Funciona

1. **Escolha do Pivô**: Selecione um elemento da lista como pivô (pode ser o primeiro, o último, o médio ou um elemento aleatório).
2. **Particionamento**: Reorganize a lista de modo que todos os elementos menores que o pivô fiquem à esquerda e todos os elementos maiores fiquem à direita.
3. **Recursão**: Aplique o Quick Sort recursivamente às duas sublistas (esquerda e direita) até que a lista esteja ordenada.

### Exemplo de Funcionamento

Considere a lista `[10, 80, 30, 90, 40, 50, 70]`:

- **Escolha do Pivô**: Vamos escolher `70` como pivô.
- **Particionamento**:
  - Após reorganizar, a lista pode se tornar `[10, 30, 40, 50, 70, 90, 80]`.
  - Aqui, `70` está na posição correta, com todos os elementos menores à esquerda e maiores à direita.

- **Recursão**:
  - Aplicar Quick Sort à sublista esquerda `[10, 30, 40, 50]` e à sublista direita `[90, 80]`.
  - Para a sublista esquerda, escolher `50` como pivô, e assim por diante, até que todas as sublistas estejam ordenadas.

- **Resultado Final**: A lista ordenada será `[10, 30, 40, 50, 70, 80, 90]`.

## Complexidade

- **Tempo**:
  - **Melhor Caso**: \(O(n \log n)\) (quando o pivô divide a lista uniformemente)
  - **Caso Médio**: \(O(n \log n)\)
  - **Pior Caso**: \(O(n^2)\) (quando a lista já está ordenada ou quase ordenada)

- **Espaço**: \(O(\log n)\) (para a pilha de chamadas recursivas)

## Vantagens

- Geralmente mais rápido que outros algoritmos de ordenação, como Bubble Sort e Insertion Sort, para listas grandes.
- Operação in-place, requer menos espaço adicional.

## Desvantagens

- O desempenho pode ser afetado pelo pior caso, especialmente se o pivô não for escolhido de forma eficiente.
- Não é um algoritmo estável, ou seja, pode mudar a ordem relativa de elementos iguais.

## Conclusão

O Quick Sort é um dos algoritmos de ordenação mais populares devido à sua eficiência e desempenho em listas grandes. É amplamente utilizado em diversas bibliotecas e aplicações. Para listas pequenas, métodos mais simples podem ser mais adequados, mas o Quick Sort é uma escolha robusta para a maioria das situações.
# Heap Sort

O Heap Sort é um algoritmo de ordenação baseado na estrutura de dados chamada heap (ou montanha). Ele transforma a lista a ser ordenada em uma heap, que é uma árvore binária completa onde cada nó é maior (ou menor, dependendo da ordem) que seus filhos. Abaixo, você encontrará uma descrição detalhada de como funciona, suas complexidades e suas vantagens e desvantagens.

## Como Funciona

1. **Construção da Heap**: Construa uma heap a partir da lista não ordenada. Para isso, organize a lista para que ela satisfaça a propriedade da heap.
2. **Extração do Máximo**: O maior elemento (para max-heap) é a raiz da heap. Troque-o com o último elemento da lista e remova a raiz da heap.
3. **Reajustar a Heap**: Após a remoção do elemento, reajuste a heap para manter a propriedade da heap.
4. **Repetição**: Repita o processo até que todos os elementos tenham sido extraídos e a lista esteja ordenada.

### Exemplo de Funcionamento

Considere a lista `[4, 10, 3, 5, 1]`:

- **Construção da Heap**:
  - A lista é reorganizada em uma max-heap: `[10, 5, 3, 4, 1]`.

- **Extração do Máximo**:
  - O máximo `10` é trocado com `1` (último elemento): `[1, 5, 3, 4, 10]`.
  - Remove `10` e reajusta a heap: `[5, 4, 3, 1]`.

- **Repetição**:
  - O máximo `5` é trocado com `1`: `[1, 4, 3, 5]`.
  - Remove `5` e reajusta: `[4, 1, 3]`.
  - Continue o processo até que a lista esteja ordenada: `[1, 3, 4, 5, 10]`.

## Complexidade

- **Tempo**:
  - **Melhor Caso, Caso Médio e Pior Caso**: \(O(n \log n)\)

- **Espaço**: \(O(1)\) (in-place)

## Vantagens

- Eficiente para listas grandes.
- Opera in-place, requer pouco espaço adicional.

## Desvantagens

- O desempenho pode ser inferior ao Quick Sort em algumas situações devido à sua constante de tempo.
- Não é um algoritmo estável, ou seja, pode mudar a ordem relativa de elementos iguais.

## Conclusão

O Heap Sort é um algoritmo de ordenação eficiente e é especialmente útil quando o espaço adicional é uma preocupação. É uma escolha sólida para aplicações que exigem desempenho consistente em listas grandes, embora outros algoritmos como Quick Sort possam ser mais rápidos em muitos casos práticos.

# Bogo Sort

O Bogo Sort, também conhecido como "stupid sort" ou "random sort", é um algoritmo de ordenação altamente ineficiente que utiliza uma abordagem baseada em tentativas aleatórias. O algoritmo continua embaralhando a lista até que ela esteja ordenada. Devido à sua natureza aleatória e ineficiência, o Bogo Sort é mais uma curiosidade acadêmica do que uma solução prática para problemas de ordenação. Abaixo, você encontrará uma descrição detalhada de como funciona, suas complexidades e suas vantagens e desvantagens.

## Como Funciona

1. **Verificação**: Verifique se a lista está ordenada. Se estiver, o algoritmo termina.
2. **Embaralhamento**: Se a lista não estiver ordenada, embaralhe (randomize) os elementos da lista.
3. **Repetição**: Repita os passos 1 e 2 até que a lista esteja ordenada.

### Exemplo de Funcionamento

Considere a lista `[3, 2, 1]`:

1. **Verificação**: A lista não está ordenada.
2. **Embaralhamento**: A lista pode se tornar `[1, 3, 2]`.
3. **Verificação**: A lista ainda não está ordenada.
4. **Embaralhamento**: A lista pode se tornar `[2, 1, 3]`.
5. **Verificação**: A lista ainda não está ordenada.
6. **Embaralhamento**: A lista pode finalmente se tornar `[1, 2, 3]`.
7. **Verificação**: Esta vez, a lista está ordenada, e o algoritmo termina.

## Complexidade

- **Tempo**:
  - **Melhor Caso**: \(O(n)\) (caso a lista já esteja ordenada desde o início)
  - **Caso Médio e Pior Caso**: \(O((n+1)!)\), que é extremamente ineficiente para listas maiores.

- **Espaço**: \(O(1)\) (in-place, mas não é prático devido à natureza aleatória)

## Vantagens

- Extremamente simples de implementar.
- Serve como uma curiosidade sobre algoritmos de ordenação.

## Desvantagens

- Inviável para listas de tamanho considerável devido à sua ineficiência.
- Não é um algoritmo prático para ordenação em aplicações do mundo real.

## Conclusão

O Bogo Sort é uma abordagem divertida e interessante, mas devido à sua ineficiência, não é utilizado em aplicações práticas. É frequentemente mencionado em discussões sobre algoritmos e complexidade computacional como um exemplo de como não ordenar uma lista.

# Comb Sort

O Comb Sort é um algoritmo de ordenação que melhora o desempenho do Bubble Sort, eliminando a "tensão" que ocorre em listas quase ordenadas. O algoritmo utiliza um fator de redução para comparar elementos distantes na lista, permitindo que os elementos se movam mais rapidamente para suas posições corretas. Abaixo, você encontrará uma descrição detalhada de como funciona, suas complexidades e suas vantagens e desvantagens.

## Como Funciona

1. **Cálculo do Gap**: O algoritmo começa calculando o intervalo (gap), que é a distância entre os elementos a serem comparados. O gap inicial é geralmente definido como o comprimento da lista dividido por um fator de redução (normalmente 1.3).
2. **Comparação e Troca**: Compare os elementos que estão a uma distância igual ao gap. Se o elemento da esquerda é maior que o da direita, troque-os.
3. **Redução do Gap**: Após uma passagem pela lista, o gap é reduzido. O processo continua até que o gap seja reduzido a 1.
4. **Passagem Final**: Quando o gap é 1, o algoritmo se comporta como um Bubble Sort simples, garantindo que a lista esteja completamente ordenada.

### Exemplo de Funcionamento

Considere a lista `[5, 1, 4, 2, 8]`:

1. **Cálculo do Gap**: Para uma lista de 5 elementos, o gap inicial é `5 / 1.3 ≈ 3.85` (arredondado para 3).
2. **Comparação e Troca**:
  - Compare `5` (índice 0) e `2` (índice 3): Troque → `[2, 1, 4, 5, 8]`.
  - Compare `1` (índice 1) e `4` (índice 4): Não troca.
3. **Redução do Gap**: O novo gap é calculado como `3 / 1.3 ≈ 2.31` (arredondado para 2).
4. **Repetição**: Continue comparando e trocando até que o gap seja 1.
5. **Passagem Final**: Com gap 1, o algoritmo realiza uma última passagem para garantir que todos os elementos estejam em ordem.

## Complexidade

- **Tempo**:
  - **Melhor Caso**: \(O(n \log n)\)
  - **Caso Médio**: \(O(n \log n)\)
  - **Pior Caso**: \(O(n^2)\)

- **Espaço**: \(O(1)\) (in-place)

## Vantagens

- Melhora o desempenho em listas quase ordenadas em comparação com o Bubble Sort.
- Simples de implementar e entender.

## Desvantagens

- Embora melhor que o Bubble Sort, ainda não é o algoritmo mais eficiente para listas grandes.
- A escolha do fator de redução pode afetar o desempenho.

## Conclusão

O Comb Sort é uma melhoria prática sobre o Bubble Sort, oferecendo um desempenho melhor em listas desordenadas e quase ordenadas. É uma opção útil em situações onde a simplicidade e a facilidade de implementação são importantes, embora não seja tão eficiente quanto algoritmos mais avançados, como Quick Sort ou Merge Sort.



[//]: # (- **Shell Sort**  )

[//]: # (  Uma variação do Insertion Sort, que permite a movimentação de elementos de forma mais rápida ao inicializar grandes gaps entre os elementos comparados, e então diminui esses gaps gradualmente até que a lista esteja ordenada.)

Cada algoritmo é acompanhado de uma explicação detalhada e um exemplo de código em Java para facilitar a prática e o estudo.
