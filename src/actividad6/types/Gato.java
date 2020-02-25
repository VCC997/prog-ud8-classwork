package actividad6.types;

import actividad6.Animal;

public class Gato extends Animal {

    public Gato(boolean imagen, String comida, double tamaño, String localizacion, String tipo) {
        super(imagen, comida, tamaño,  localizacion, "Gato");
    }

    @Override
    public void makeNoise() {
        System.out.printf("Miau!!!"+"\n");
    }

}
