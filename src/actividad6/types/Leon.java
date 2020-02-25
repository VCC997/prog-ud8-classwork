package actividad6.types;

import actividad6.Animal;

public class Leon extends Animal {

    public Leon(boolean imagen, String comida, double tamaño, String localizacion, String tipo) {
        super(imagen, comida, tamaño,  localizacion, "Leon");
    }

    @Override
    public void makeNoise() {
        System.out.printf("Roarr!!!"+"\n");
    }

}
