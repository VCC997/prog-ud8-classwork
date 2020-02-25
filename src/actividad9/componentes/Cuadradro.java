package actividad9.componentes;

import actividad9.Color;
import actividad9.Drawable;
import actividad9.Figura;

public class Cuadradro extends Figura implements Drawable {

    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    private int lado3;
    private int lado4;

    public Cuadradro(String nombre, int base, int altura, int lado1, int lado2, int lado3, int lado4){
        super(nombre);

        this.base=base;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.lado4=lado4;
    }

    @Override
    public void getArea() {
        int area = lado1 * lado2;
    }

    @Override
    public void getPerimetro() {
        int perimetro = lado1+lado2+lado3+lado4;
    }

    @Override
    public void getName() {
        System.out.printf("Cuadrado");
    }

    @Override
    public String getDrawing() {
        return "▓▓";
    }

    @Override
    public String getDrawing(Color color) {
        return String.valueOf(Color.RED);
    }

    @Override
    public void setColor(Color color) {
        this.setColor(Color.BLACK);
    }
}
