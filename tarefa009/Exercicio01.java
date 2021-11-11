package aula009;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int anos, meses, dias, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira quantidade de anos");
        anos = scanner.nextInt();
        System.out.println("Insira quantidade de meses");
        meses = scanner.nextInt();
        System.out.println("Insira quantidade de dias");
        dias = scanner.nextInt();
        resultado = (anos * 365) + (meses * 30) + dias;
        System.out.println(resultado + " dias");
    }
}