package actividad4;

public class Administrativo extends Empleado {

    private boolean despacho;
    private int numeroFax;

    public Administrativo(String name, String surname, String dni, String direction,
                          String tlf, double salary,boolean despacho, int numeroFax) {

        super(name, surname, dni, direction, tlf, salary);
        this.despacho=despacho;
        this.numeroFax=numeroFax;
    }

    @Override
    public void salaryIncrement(double salary){

        salary = salary + (salary * 0.5);
    }

    @Override
    public String toString(){

        return "Despacho:"+despacho+"Numero de FAX:"+numeroFax+super.toString();
    }

}
