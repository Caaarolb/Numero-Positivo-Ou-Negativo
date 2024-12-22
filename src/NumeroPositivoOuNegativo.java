import java.util.Scanner;  // A gente precisa importar o Scanner para ler a entrada do usuário

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        // Aqui estamos criando o Scanner para conseguir pegar o número digitado pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo para o usuário digitar um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();  // Pegando o número que o usuário digitou

        // Se o número for maior que 0, significa que ele é positivo
        if (numero > 0) {
            System.out.println("Número positivo");
        }
        // Se o número for menor que 0, significa que ele é negativo
        else if (numero < 0) {
            System.out.println("Número negativo");
        }
        // Se não for maior nem menor que 0, então é o número 0
        else {
            System.out.println("O número é zero");
        }

        // Fechando o Scanner depois que acabamos de usá-lo
        scanner.close();
    }
}

