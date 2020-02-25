package actividad9;

public abstract class Figura implements Drawable {

    protected String name;

    public Figura(String nombre) {
        this.name=nombre;

    }

    public abstract void getArea();

    public abstract void getPerimetro();

    public abstract void getName();

}
