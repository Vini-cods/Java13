import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, grade;

        System.out.println("Digite as notas dos alunos (-1 para encerrar): ");
        while (true) {
            grade = scanner.nextInt();
            if (grade == -1) break;

            sum += grade;
            count++;
        }

        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("Média das notas: " + average);

    }
}