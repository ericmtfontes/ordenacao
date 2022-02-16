package ordenacao;
import java.util.Scanner;

public class Ordenacao {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
       int vet[] = new int[5];
       int aux;
       for(int i = 0; i < 5;i++){
           System.out.println("Entre com o " + (i+1) + " valor");
           vet[i] = scan.nextInt();
       }
       
       System.out.println();
       System.out.println("Antes da ordenação:");
       for(int i = 0; i < 5;i++){
           System.out.print(vet[i] + " ");
       }
       System.out.println();
       /*for(int i = 0; i < 5; i++){
           if(vet[i+1] < vet[i]){
              aux = vet[i+1];
              vet[i+1] = vet[i];
              vet[i] = aux;
               
           }
       }*/
    
       for(int i = 0; i<5;i++){
           for(int j = i+1; j<5;j++){
               if(vet[j] < vet[i]){
                   aux = vet[j];
                   vet[j] = vet[i];
                   vet[i] = aux;
               }
           }
       }
       System.out.println();
       System.out.println("Depois da ordenação:");
       for(int i = 0; i < 5;i++){
           System.out.print(vet[i] + " ");
       }
       
       System.out.println();
    }
    
}
