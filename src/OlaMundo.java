import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args){
        System.out.println("Olá Mundo");

        Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.println("Digite um numero: ");
        x = sc.nextInt();

        System.out.println("Digite outro numero: ");
        y = sc.nextInt();

        int result = x + y;

        System.out.printf("Resultado: %d", result);

        sc.close();
    }
}
