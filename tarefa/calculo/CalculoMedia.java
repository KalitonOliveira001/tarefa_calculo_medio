package tarefa.calculo;



import java.util.Scanner;

/**
 * Classe para calcular a média de 4 notas informadas pelo usuário.
 */
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / 4;
        System.out.println("A média das notas é: " + media);
    }
}
