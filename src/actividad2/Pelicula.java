package actividad2;

public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;


    public Pelicula(String actorPrincipal, String actrizPrincipal,String tittle, String author, Formato format, int duration){
        super(tittle, author, format,duration);
        this.actorPrincipal=actorPrincipal;
        this.actrizPrincipal=actrizPrincipal;
    }

    public Pelicula(String tittle, String author, Formato format, int duration,String actrizPrincipal){
        super(tittle, author, format,duration);
        this.actrizPrincipal=actrizPrincipal;
    }

    public Pelicula(String actorPrincipal, String tittle, String author, Formato format, int duration){
        super(tittle, author, format,duration);
        this.actorPrincipal=actorPrincipal;
    }

    public String getActorPrincipal(){
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString()+"actriz"+actrizPrincipal+"actor"+actorPrincipal;
    }
}
