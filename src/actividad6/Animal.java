package actividad6;

public abstract class Animal {

    private int hambre;
    private boolean imagen;
    private String comida;
    private double tamaño;
    private String localizacion;
    private String tipo;


    public Animal(boolean imagen, String comida, double tamaño, String localizacion, String tipo) {
        this.hambre = 0;
        this.imagen = imagen;
        this.comida = comida;
        this.tamaño = tamaño;
        this.localizacion = localizacion;
        this.tipo = tipo;
    }

    public abstract void makeNoise();

    public void eat(){
        hambre = 0;
    }
}
