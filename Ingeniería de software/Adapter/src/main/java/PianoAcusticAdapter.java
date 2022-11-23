
public class PianoAcusticAdapter extends Guitar {
    
    private PianoAcustic p;
    String encendido;
    
    public PianoAcusticAdapter(PianoAcustic p) {
        this.p = p;
        if ("sonando".equals(p.sonido)){
            this.encendido = "encendido";
        }else{
            this.encendido = "apagado";
        }
    }
    
    @Override
    public void encender(){
        this.encendido = "encendido";
        
    }
    
    @Override
    public void apagar(){
        this.encendido = "apagado";
    }
    
    @Override
    public String toString(){
        return "El piano acústico está "+encendido;
    }
    
}
