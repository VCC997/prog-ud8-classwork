package actividad11;

public class Television extends Electrodomestico {

    private double resolucion;
    private boolean sintonizador;

    public Television(double price, String marca, String modelo,
                      Color color, Consumo consumo) {
        super(price, marca, modelo, color, consumo);
        this.resolucion=20;
        this.sintonizador=false;
    }

    public Television(double price, String marca, String modelo,
                      Color color, Consumo consumo, int resolucion, boolean sintonizador) {
        super(price, marca, modelo, color, consumo);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }

    @Override
    public double precioVenta() {

        double precioVenta = super.precioVenta();

        if (sintonizador == true){
            precioVenta+=50;

        }else if (resolucion > 40){

        }else {
            precioVenta=precioVenta();
        }

        return precioVenta;
    }
}
