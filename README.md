# Estruturas de Dados - Algoritmos de Ordenação

Neste repositório, você encontrará uma coleção de algoritmos de ordenação de arrays, incluindo *Bubble Sort*, *Insertion Sort*, *Selection Sort*, *Merge Sort*, *Quick Sort* e outros. Todos os algoritmos foram implementados em Java, com código de fácil compreensão para facilitar o aprendizado e o entendimento da lógica por trás de cada método.

---

### Algoritmos de Ordenação

Abaixo, você encontrará uma breve explicação de cada algoritmo de ordenação implementado neste repositório:

- **Bubble Sort**  
  Um algoritmo de ordenação simples que percorre repetidamente a lista, comparando elementos adjacentes e trocando-os se estiverem na ordem errada. Esse processo se repete até que a lista esteja ordenada. É eficiente para listas pequenas, mas possui um desempenho mais baixo em listas maiores.

- **Insertion Sort**  
  Ordena a lista gradualmente, construindo uma sublista ordenada à medida que percorre a lista original. A cada passo, um elemento é removido da lista de entrada e inserido na posição correta dentro da sublista ordenada. É eficiente para listas pequenas e parcialmente ordenadas.

- **Selection Sort**  
  Divide o array em uma sublista ordenada e uma não ordenada. A cada iteração, encontra o menor (ou maior) elemento na sublista não ordenada e o move para a posição correta na sublista ordenada. Embora tenha complexidade de tempo relativamente alta, é fácil de implementar.

- **Merge Sort**  
  Um algoritmo de ordenação recursivo que divide o array em subarrays menores, ordena cada subarray e os combina novamente em uma lista ordenada. Utiliza o conceito de divisão e conquista, sendo eficiente para listas maiores, com complexidade de tempo O(n log n).

- **Quick Sort**  
  Outro algoritmo de divisão e conquista, que seleciona um "pivô" e particiona a lista em sublistas menores, com elementos menores e maiores que o pivô. As sublistas são ordenadas recursivamente. O Quick Sort é rápido em média, mas pode ser menos eficiente em alguns casos.

- **Heap Sort**  
  Constrói uma estrutura de heap a partir da lista, garantindo que o maior (ou menor) elemento seja colocado na posição correta a cada iteração. O Heap Sort é eficiente e tem uma complexidade de tempo O(n log n), embora seja mais complexo de implementar.

- **Radix Sort**  
  Um algoritmo de ordenação não-comparativo que organiza números dígito a dígito, de menor para maior ordem, sendo especialmente útil para listas de inteiros. O Radix Sort tem um desempenho eficiente para listas grandes com valores numéricos.

- **Shell Sort**  
  Uma variação do Insertion Sort, que permite a movimentação de elementos de forma mais rápida ao inicializar grandes gaps entre os elementos comparados, e então diminui esses gaps gradualmente até que a lista esteja ordenada.

Cada algoritmo é acompanhado de uma explicação detalhada e um exemplo de código em Java para facilitar a prática e o estudo.
