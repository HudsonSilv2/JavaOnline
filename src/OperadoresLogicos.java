public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 11;
        float salario = 50000f;

        if(idade >= 18 || salario >= 1000) {
            System.out.println("██ condições verdadeiras ██");
            System.out.println("Idade maior ou igual a 18? " + (idade >= 18));
            System.out.println("Salario maior ou igual a 1000? " + (salario >= 1000));
        } else {
            System.out.println("Alguma é falsa"); ;
        }
    }
}
