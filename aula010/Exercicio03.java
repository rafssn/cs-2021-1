package aula009;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o saldo:");
        float valor = scanner.nextFloat();
        System.out.println((valor*1.15));
    }
}
