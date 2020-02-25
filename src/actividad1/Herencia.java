package actividad1;

public class Herencia {

    public static void main (String [] args){

        Hijo h = new Hijo(1);
        Padre p = new Padre("padre");
        Abuelo a1 = new Abuelo("abuelo");

        System.out.println("h:" + h);
        System.out.println("p:" + p);
        System.out.println("a1:" + a1);
    }
}
