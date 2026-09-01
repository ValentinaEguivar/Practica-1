import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        String estado;

        if (promedio >= 60) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }

        System.out.println("Nombre: " + nombre);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Estado: " + estado);

        scanner.close();
    }
}