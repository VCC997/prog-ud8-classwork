package actividad4;

public class Cliente {

    private String nombre;
    private String apellido;
    private String DNI;
    private String telefono;
    private String direccion;
    private String empresa;

    public Cliente(String nombre, String apellido, String dni, String tlf,  String direccion, String empresa){

        this.nombre=nombre;
        this.apellido=apellido;
        this.DNI=dni;
        this.telefono=tlf;
        this.direccion=direccion;
        this.empresa=empresa;
    }

    @Override
    public String toString(){

        return "Nombre:"+nombre+"Apellido:"+apellido+"DNI:"+DNI+"Telefono:"+telefono+"Direccion:"+direccion+"Empresa:"+empresa;
    }
}
