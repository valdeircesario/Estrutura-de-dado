public class mengerSort {

    //metodo imprimir vetor
    public static void imprimir(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    public static void merge_sort(int vet[], int inicio, int fim) {

        //metodo dividir o vetor
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            merge_sort(vet, inicio, meio);
            merge_sort(vet, meio + 1, fim);

            // Cria um vetor auxiliar
            int[] aux = new int[fim - inicio + 1];
            int i = inicio;
            int j = meio + 1;
            int k = 0;



            // Faz o merge juntar o vetor ordenado
            while (i <= meio && j <= fim) {
                if (vet[i] <= vet[j]) {
                    aux[k++] = vet[i++];
                } else {
                    aux[k++] = vet[j++];
                }
            }
            while (i <= meio) {
                aux[k++] = vet[i++];
            }
            while (j <= fim) {
                aux[k++] = vet[j++];
            }

            // Copia os elementos de volta para o vetor original
            for (i = inicio; i <= fim; i++) {
                vet[i] = aux[i - inicio];
            }
        }
    }

    public static void main(String[] args) {
        int[] vet = new int[20];

        // Preenchendo o vetor com números aleatórios
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 100); // números aleatórios entre 0 e 99
        }

        System.out.println("Vetor antes da ordenação:");
        imprimir(vet);

        merge_sort(vet, 0, vet.length - 1);

        System.out.println("Vetor após a ordenação:");
        imprimir(vet);
    }
}
