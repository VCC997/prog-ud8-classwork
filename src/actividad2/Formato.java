package actividad2;

public class Formato {

    public enum Format{WAV,MIDI,AVI,MP3,MPG,MOV,cdAudio,DVD};
    private Format formato;

    public void chooseFormat(Format formato, int formatos){

        switch(formatos){
            case 1: this.formato = Format.WAV;
                break;
            case 2: this.formato = Format.MIDI;
                break;
            case 3: this.formato = Format.AVI;
                break;
            case 4: this.formato = Format.MP3;
                break;
            case 5: this.formato = Format.MPG;
                break;
            case 6: this.formato = Format.MOV;
                break;
            case 7: this.formato = Format.cdAudio;
                break;
            default: this.formato = Format.DVD;
                break;
        }
    }




}
