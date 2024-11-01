public class boobleSort {

    public static void main(String[] args) {

        System.out.println("vetor desordenado");
        int [] vet= new int[20];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int)(Math.random()* vet.length);
            System.out.print(vet[i]+ ", ");

        }
        System.out.println("\n\n ");
        int aux;
        for (int i = 0; i < vet.length; i++) {
            for (int j = i+1; j < vet.length  ; j++) {
                if(vet[i] > vet[j]){
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;

                }



            }




        }
        System.out.println("vetor ordenado");
        for (int i = 0; i < vet.length ; i++) {
            System.out.print(vet[i]+", ");

        }
    }

}




