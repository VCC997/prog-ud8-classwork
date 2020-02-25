package actividad4;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int añosAntiguedad;
    private String telefono;
    private double salario;

    public Empleado(String name, String surname, String dni, String direction, String tlf, double salary ){
        this.nombre=name;
        this.apellidos=surname;
        this.DNI=dni;
        this.telefono=tlf;
        this.salario=salary;
        this.añosAntiguedad=0;
    }

    public void salaryIncrement(double salary){

        salary = salary + (salary * 0.2);
    }

    @Override
    public String toString(){
        return "DNI: " + DNI + "Nombre:" + nombre + "Apellido:" + apellidos + "Teléfono:" + telefono+ "Salario:" + salario;
    }
}
