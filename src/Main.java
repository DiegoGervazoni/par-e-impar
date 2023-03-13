import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int somaPar = 0;
        int somaImpar = 0;
        int count = 0;
        int somaDosValores = 0;

        do {
            System.out.println("Digite um valor: ");
            numero = sc.nextInt();

            if((numero % 2) == 0){
                somaPar += 1;
            }else{
                somaImpar += 1;
            }

            somaDosValores += numero;
            count += 1;

        }while(count <= 5);

        System.out.println("Numeros pares: " + somaPar);
        System.out.println("Numeros impares: " + somaImpar);
        System.out.println("Valor total dos numeros: " + somaDosValores);
        System.out.println("Encerrando...");
    }
}
