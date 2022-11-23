
public class Guitar {
    
    String encendido;
    
    public Guitar(){
        this.encendido = "apagada";
    }
    
    public void encender(){
        this.encendido = "encendida";
    }
    
    public void apagar(){
        this.encendido = "apagada";
    }
    
    @Override
    public String toString(){
        return "La guitarra está "+encendido;
    }
    
    
}
