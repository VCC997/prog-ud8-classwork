package actividad2;

public class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private long duracion;


    public Multimedia(String tittle, String author, Formato format, int duration){

        this.titulo=tittle;
        this.autor=author;
        this.formato=format;
        this.duracion=duration;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public long getDuracion() {
        return duracion;
    }

    @Override
    public String toString(){
        return "titulo"+titulo+"autor"+autor+"formato"+formato+"duracion"+duracion;
    }
}
