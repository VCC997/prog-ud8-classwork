package actividad7;

import actividad4.Administrativo;
import actividad4.Empleado;

public class Empresa {

    Empleado[] empleados = new Empleado[20];



    public void salaryIncrement(double salary){

        salary = salary + (salary * 0.5);
    }

}
