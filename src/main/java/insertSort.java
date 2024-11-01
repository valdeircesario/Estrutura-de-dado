public class insertSort {
    public static void main(String[] args) {
        int [] vet = new int[30];

        System.out.println("\n\nvetor desordenado");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)(Math.random()* vet.length);
            System.out.print(vet[i]+", ");

        }

        int aux,j;
        for (int i = 1; i < vet.length; i++) {
            aux = vet[i];
            j = i - 1;
            while (j >=0 && vet[j] > aux){
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = aux;

        }
        System.out.println("\n\nvetor ordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+", ");

        }
    }

}
