public class heapSort {

    private static void aplicarheap(int[] vet,int n,int i){
        int raiz = i;
        int esquerda = 2*i + 1;
        int direita = 2*i + 2;


        if (esquerda < n && vet[esquerda] > vet[raiz]){
            raiz = esquerda;
        }

        if (direita < n && vet[direita] > vet[raiz]){
            raiz = direita;
        }

        if (raiz != i){
            int aux = vet[i];
            vet[i] = vet[raiz];
            vet[raiz] = aux;
            aplicarheap(vet, n, raiz);
        }
    }



    public static void main(String[] args) {
        int[] vet = new int[20];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)(Math.random()* vet.length);
        }

        System.out.println("\n\nvetor desordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+", ");

        }


        // chamar algoritimo heap sort
        int n = vet.length;
        for (int i = n / 2-1;i >= 0; i--){
            aplicarheap(vet,n,i);


        }
        System.out.println("\n\n vetor quase ordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+", ");

        }

        for (int j = n -1;j > 0 ; j--) {
            int aux = vet[0];
            vet[0] = vet[j];
            vet[j] = aux;
            aplicarheap(vet, j, 0);

        }
        System.out.println("\n\n vetor ordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+", ");

        }



    }
}

