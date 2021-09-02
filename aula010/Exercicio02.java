package aula009;
import static java.lang.System.*;

public class Exercicio02 {

    public static void main(String []args){
        float media1, media2, soma, media3;

        media1 = (8 + 9 + 7)/3;
        media2 = (4 + 5 + 6)/3;
        soma = media1 + media2;
        media3 = (media1 + media2)/2;
        System.out.println("A média aritmética dos números 8, 9 e 7 é: "+media1);
        System.out.println("A média dos números 4,5 e 6 é: "+media2);
        System.out.println("A soma das duas médias é de: "+soma);
        System.out.println("A média das médias é de: "+media3);
    }
}