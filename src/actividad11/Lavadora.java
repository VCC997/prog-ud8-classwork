package actividad11;

public class Lavadora extends Electrodomestico{

    private int cargaMax;

    public Lavadora(double price, String marca, String modelo,
                    Color color, Consumo consumo){
        super(price, marca, modelo, color, consumo);
        this.cargaMax=5;
    }

    public Lavadora(double price, String marca, String modelo,
                    Color color, Consumo consumo, int cargaMax) {
        super(price, marca, modelo, color, consumo);
        this.cargaMax=cargaMax;
    }

    @Override
    public double precioVenta() {
        double precioVenta = super.precioVenta();

        if (cargaMax > 30){
            precioVenta+=50;
        }
        return precioVenta;
    }
}
