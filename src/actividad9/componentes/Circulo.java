package actividad9.componentes;

import actividad9.Color;
import actividad9.Drawable;
import actividad9.Figura;

public class Circulo extends Figura implements Drawable {

    private int radio;
    private int PI;

    public Circulo(String nombre, int radio, int PI) {
        super(nombre);

        this.radio=radio;
        this.PI=PI;
    }


    @Override
    public void getArea() {
        int area = PI*(radio*radio);
    }

    @Override
    public void getPerimetro() {
        int perimetro = 2*PI*radio;
    }

    @Override
    public void getName() {
        System.out.printf("Círculo");
    }

    @Override
    public String getDrawing() {
        return "()";
    }

    @Override
    public String getDrawing(Color color) {
        return String.valueOf(Color.YELLOW);
    }

    @Override
    public void setColor(Color color) {
        this.setColor(Color.BLACK);
    }
}
