package aula009;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String []args){
        int numero = 0;
        System.out.println("Digite um número: ");
        Scanner in = new Scanner( System.in );
        numero = in.nextInt();
        System.out.println("número antecessor: " + (numero-1));
        System.out.println("número sucessor: " + (numero+1));
    }
}
