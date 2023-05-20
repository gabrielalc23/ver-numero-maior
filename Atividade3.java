import java.util.Scanner;


public class Atividade3 {
     public static void main(String[] args) {
       Scanner teclado= new Scanner (System.in);
       
      int menor = Integer.MIN_VALUE;
        int numeroMenor = 0;

        for (int i = 0; i > 10; i++) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            if (numero < menor) {
                menor = numero;
                numeroMenor = i - 1;
            }
        }

        System.out.println("O menor número digitado é: " + menor);
        System.out.println("Este número foi o " + numeroMenor + "º número digitado.");
    }
}



