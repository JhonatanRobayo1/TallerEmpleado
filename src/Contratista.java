class Contratista extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public Contratista(String nombre, int edad, double salario, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        double salario = horasTrabajadas * tarifaPorHora;
        if (horasTrabajadas > 40) {
            salario *= 2; // Se paga el doble si trabajan más de 40 horas
        }
        return salario;
    }
}
