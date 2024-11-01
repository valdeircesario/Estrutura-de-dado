public class selectSort {
    public static void main(String[] args) {
        int[] vet = new int[20];

        System.out.println("\n\nvetor desordenado");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)(Math.random()* vet.length);
            System.out.print(vet[i]+", ");

        }

        int posicaoMenor ,aux;
        for (int i = 0; i < vet.length; i++) {
            posicaoMenor = i;
            for (int j = i +1; j < vet.length; j++) {
                if ( vet[j] < vet[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            aux = vet[posicaoMenor];
            vet[posicaoMenor] = vet[i];
            vet[i] = aux;


        }
        System.out.println("\n\nvetor ordenado");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+", ");

        }
    }


}
