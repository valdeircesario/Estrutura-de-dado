public class bubleSort {
    public static void main(String[] args) {

        System.out.println("Vetor desordenado");
        // Declara e inicializa um vetor de inteiros com 20 posições
        int[] vet = new int[20];

        // Esse laço preenche o vetor com números aleatórios
        for (int i = 0; i < vet.length; i++) {
            // Gera um número aleatório entre 0 e o tamanho do vetor, e o atribui à posição i
            vet[i] = (int) (Math.random() * vet.length);

            System.out.print(vet[i] + ", ");// Imprime o vetor desordenado
        }


        int aux; // Declara uma variável auxiliar para ajudar na troca dos elementos durante a ordenação

        // Esse laço externo percorre cada elemento do vetor
        for (int i = 0; i < vet.length; i++) {

            // Esse laço interno percorre os elementos após o índice i para comparar e ordenar
            for (int j = i + 1; j < vet.length; j++) {

                // Compara se o elemento atual (vet[i]) é maior que o próximo elemento (vet[j])
                if (vet[i] > vet[j]) {
                    // Se for maior, realiza a troca usando a variável auxiliar
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }

        System.out.println("\nVetor ordenado");


        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");// Imprime o vetor já ordenado
        }
    }
}
