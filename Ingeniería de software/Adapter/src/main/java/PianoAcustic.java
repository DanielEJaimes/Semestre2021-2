
public class PianoAcustic {
    
    String sonido;
    
    public PianoAcustic(){
        this.sonido = "detenido";
    }
    
    public void tocar(){
        this.sonido = "sonando";
    }
    
    public void parar(){
        this.sonido = "detenido";
    }

    @Override
    public String toString(){
        return "El piano acústico está "+sonido;
    }
    
}
