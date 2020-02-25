package actividad10;

    public class Videojuego implements Comparable{

        private double precio;
        private String titulo;
        private String genero;

        public Videojuego(String titulo, String genero, double precio) {
            this.precio=precio;
            this.titulo=titulo;
            this.genero=genero;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        @Override
        public String toString(){
            return "titulo:"+" "+ titulo +" "+"genero:" +" "+ genero +" "+ "precio"+" "+ precio;
        }

        @Override
        public int compareTo(Object other) {

            Videojuego otherVideojuego = (Videojuego) other;

            return this.titulo.compareTo(otherVideojuego.getTitulo());
        }
    }
