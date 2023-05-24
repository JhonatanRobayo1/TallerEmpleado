public class EmpleadoTiempoCompleto extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salario, int horasTrabajadas, double salarioPorHora) {
        super(nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * salarioPorHora;
    }
}
