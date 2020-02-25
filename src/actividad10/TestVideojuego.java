package actividad10;

import java.util.Arrays;

public class TestVideojuego {

    public static void main(String[] args) {

        Videojuego[] listaJuegos = new Videojuego[5];

        Videojuego v1 = new Videojuego("Tekken", "Lucha", 25 );
        Videojuego v2 = new Videojuego("Crash", "Aventura", 20);
        Videojuego v3 = new Videojuego("Crash", "Aventura", 20);
        Videojuego v4 = new Videojuego("Doom", "Shooter", 30);
        Videojuego v5 = new Videojuego("Zelda", "Aventura", 40);

        listaJuegos[0] = v1;
        listaJuegos[1] = v2;
        listaJuegos[2] = v3;
        listaJuegos[3] = v4;
        listaJuegos[4] = v5;

        for (int i = 0; i < listaJuegos.length ; i++) {
            Arrays.sort(listaJuegos);
            System.out.println(listaJuegos[i].toString());
        }
        v1.compareTo(v2);
        v2.compareTo(v2);
        v3.compareTo(v3);
        v4.compareTo(v5);
    }
}

