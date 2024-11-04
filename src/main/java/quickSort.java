public class quickSort {
    public static void main(String[] args) {
        int [] vet = new int[20];
        System.out.println("\n\nvetor desordenado");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)(Math.random()* vet.length);
            System.out.print(vet[i]+" ,");
        }
        //chamar o metodo quicksort
        quicksort(vet,0, vet.length-1);


        System.out.println("\n\n vetor ordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+", ");

        }

    }

    //metodo que divide o vetor recursivamente
    public static void quicksort(int[] vet,int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vet,esquerda,direita);
            quicksort(vet,esquerda,p);
            quicksort(vet,p +1,direita);
        }
    }

    //metodo que pega o pivor e ordena sua posição, deixando em ordem crecente
    // com a direita e esquerda e efetua a troca
    public static int particao(int[] vet,int esqueda,int direita){
        int meio = (int)(esqueda + direita)/2;
        int pivot = vet[meio];
        int i = esqueda -1;
        int j = direita + 1;
        while (true){
            do{
                i++;
            }while (vet[i] < pivot);
            do {
                j--;
            }while (vet[j] > pivot);
            if( i>=j){
                return j;
            }
            int aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;

        }

    }

}
