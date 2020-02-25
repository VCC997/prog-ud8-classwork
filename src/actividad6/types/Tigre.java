package actividad6.types;

import actividad6.Animal;
import javafx.css.CssParser;

public class Tigre extends Animal {


    public Tigre(boolean imagen, String comida, double tamaño, String localizacion, String tipo) {
        super(imagen, comida, tamaño,  localizacion, "Tigre");
    }

    @Override
    public void makeNoise() {
        System.out.printf("MEOW!!!"+"\n");
    }
}
