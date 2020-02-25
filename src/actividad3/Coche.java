package actividad3;

public class Coche {
    private String matricula;
    private int velocidad;
    private int marcha;

    public Coche(String matricula){

        this.matricula = matricula;
        this.velocidad = 0;
        this.marcha = 0;
    }

    public boolean acelerar(int velocidad){
        if (velocidad < 0){
            return false;
        }else {
            this.velocidad = velocidad;
            return true;
        }
    }

    public boolean frenar(int velocidad){
        /*this.velocidad = (velocidad > 0) ? velocidad : 0;*/
        if (velocidad > 0){
            return true;
        }else {
            this.velocidad = velocidad;
            return false;
        }
    }

    protected boolean cambiarMarcha(int marcha){
        if (marcha< 0){
            return false;
        }else {
            this.marcha = marcha;
            return true;
        }
    }
    public void getVelocidad(){

    }


}
