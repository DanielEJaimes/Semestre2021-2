
public class PianoElectric extends Guitar{
    
    String encendido;
    
    public PianoElectric(){
        this.encendido = "apagado";
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
        return "El piano eléctrico está "+encendido;
    }
    
}
