package actividad11;

public abstract class Electrodomestico {

    private double precio;

    private String marca;

    private String modelo;

    private Color color;

    private Consumo consumo;

    enum Color {

        BLANCO, NEGRO, ROJO, AZUL, GRIS;
    }

    enum Consumo {

        A, B, C, D, E, F;
    }

    public Electrodomestico(double precio, String marca, String modelo, Color color, Consumo consumo) {

        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.consumo = consumo;
    }

    public double precioVenta() {

        double precioVenta = precio;

        switch (consumo) {
            case A:
                precioVenta += 100;
                break;
            case B:
                precioVenta +=80;
                break;
            case C:
                precioVenta +=60;
                break;
            case D:
                precioVenta +=50;
                break;
            case E:
                precioVenta +=30;
                break;
            case F:
                precioVenta +=10;
                break;
            default:
                precioVenta = precio;
                break;
        }
        return precioVenta;
    }
}
