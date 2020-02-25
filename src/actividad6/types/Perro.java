package actividad6.types;

import actividad6.Animal;

public class Perro extends Animal {

    private boolean imagen;
    private String comida;
    private double tamaño;
    private String localizacion;
    private String tipo;

    public Perro(boolean imagen, String comida, double tamaño, String localizacion, String tipo) {
        super(imagen,comida,tamaño,localizacion,"Perro");
        this.imagen = imagen;
        this.comida = comida;
        this.tamaño = tamaño;
        this.localizacion = localizacion;
        this.tipo = tipo;
    }

    @Override
    public void makeNoise() {

        System.out.printf("WOFF WOFF!!!"+"\n");
    }

}
