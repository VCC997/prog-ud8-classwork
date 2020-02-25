package actividad6.types;

import actividad6.Animal;

public class Hipopotamo extends Animal {

    public Hipopotamo(boolean imagen, String comida, double tamaño, String localizacion, String tipo) {
        super(imagen, comida, tamaño,  localizacion, "Hipopotamo");

    }
    @Override
    public void makeNoise() {
        System.out.printf("BLUP!!!"+ "\n");
    }

}
