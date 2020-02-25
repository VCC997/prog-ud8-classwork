package actividad4;

public class Vendedor extends Empleado {

    private Coche coche;
    private String telefono;
    private String areaVenta;
    private Cliente[] clientes;
    private float comision;


    public Vendedor(String name, String surname, String dni, String direction,
                    String tlf, double salary, String telefono, String areaVenta, Cliente[] clientes, Coche coche) {

        super(name, surname, dni, direction, tlf, salary);
        this.telefono=telefono;
        this.areaVenta=areaVenta;
        this.clientes=new Cliente[10];
        this.coche=coche;
        this.comision=0.01f;
    }

    @Override
    public void salaryIncrement(double salary){

        salary = salary + (salary * 0.10);
    }

    private Cliente[] darAltaCLiente(Cliente[] clientes){

        for (int i = 0; i <  clientes.length; i++) {

            if (clientes == null){
                clientes[i] = null;
                i++;
            }
        }
        return clientes;
    }


    public Cliente[] darBajaCliente(Cliente[] clientes){

        for (int i=0; i < clientes.length;i++){
            if (!(clientes == null)){
                clientes[i] = null;
                i--;
            }
        }
       return clientes;
    }


    public void cambiarCoche(Coche coche){


    }
}
