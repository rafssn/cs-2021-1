package aula009;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String []args){
        float salario, salarioMin;
        int quantidade;
        
        
        Scanner in = new Scanner( System.in );
        salarioMin = in.nextFloat();

        salario = in.nextFloat();
        
        quantidade = (int)(salario/salarioMin);
        System.out.println("Quantidade de " + quantidade + " salarios mínimos");
    }
}
