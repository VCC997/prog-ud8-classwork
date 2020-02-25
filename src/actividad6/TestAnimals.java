package actividad6;

import actividad6.types.*;

public class TestAnimals {

    public static void main(String[] args) {

        Animal[] listaAnimales = new Animal[10];

        Gato gato1 = new Gato(true, "pienso y carne", 0.40, "Calle", "Felino");
        Perro perro1 = new Perro(true,"pienso y carne",1.20,"Calle", "Canido");
        Hipopotamo hipo1 = new Hipopotamo(true, "pasto",
                                          2.0, "Africa", "Hippopotamus amphibius");
        Lobo lobo1 = new Lobo(true, "carne", 1.30, "bosque", "Canido");
        Leon leon1 = new Leon(true, "carne", 1.23, "Africa","Felino");
        Tigre tigre1 = new Tigre(true, "carne", 1.15, "Africa", "Felino");
        Gato gato2 = new Gato(false, "pienso", 1.0, "Casa", "Felino");
        Perro perro2 = new Perro(false, "pienso", 1.10, "Casa", "Canido");
        Hipopotamo hipo2 = new Hipopotamo(false, "sandias",
                                          1.80, "Selva", "Hippopotamus amphibius");
        Leon leon2 = new Leon(false, "carne", 1.70, "Sabana", "Felino");

        listaAnimales[0] = gato1;
        listaAnimales[1] = perro1;
        listaAnimales[2] = hipo1;
        listaAnimales[3] = lobo1;
        listaAnimales[4] = leon1;
        listaAnimales[5] = tigre1;
        listaAnimales[6] = gato2;
        listaAnimales[7] = perro2;
        listaAnimales[8] = hipo2;
        listaAnimales[9] = leon2;

        for (int i = 0; i < listaAnimales.length ; i++) {
            listaAnimales[i].makeNoise();
        }
    }
}
