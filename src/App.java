import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine();

        List<Empleado> empleados = new ArrayList<>();

        System.out.println("Ingrese los datos de los empleados:");

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Empleado #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            if (i == 0) {
                System.out.print("Horas trabajadas (Tiempo Completo): ");
                int horasTrabajadas = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Salario por hora (Tiempo Completo): ");
                double salarioPorHora = scanner.nextDouble();
                scanner.nextLine();

                empleados.add(new EmpleadoTiempoCompleto(nombre, edad, salario, horasTrabajadas, salarioPorHora));
            } else if (i == 1) {
                System.out.print("Horas trabajadas (Tiempo Parcial): ");
                int horasTrabajadas = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Salario por hora (Tiempo Parcial): ");
                double salarioPorHora = scanner.nextDouble();
                scanner.nextLine();

                empleados.add(new EmpleadoTiempoParcial(nombre, edad, salario, horasTrabajadas, salarioPorHora));
            } else {
                System.out.print("Horas trabajadas (Contratista): ");
                int horasTrabajadas = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Tarifa por hora (Contratista): ");
                double tarifaPorHora = scanner.nextDouble();
                scanner.nextLine();

                empleados.add(new Contratista(nombre, edad, salario, horasTrabajadas, tarifaPorHora));
            }

            System.out.println();
        }

        scanner.close();

        System.out.println("Detalles de los empleados:");

        for (Empleado empleado : empleados) {
            empleado.obtenerDetalles();
            double salario = empleado.calcularSalario();
            System.out.println("Salario calculado: " + salario);
            System.out.println("---------------------------");
        }
    }
}
