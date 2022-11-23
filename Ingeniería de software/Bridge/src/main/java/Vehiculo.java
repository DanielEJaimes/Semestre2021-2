
public abstract class Vehiculo {
    
    private IMotor motor;
    
    public void Acelerar(double a){
        System.out.println("Acelerando");
    }
    
    public void Frenar(){
        System.out.println("Frenando");
    }
    
    public abstract void MostrarCaracteristicas();
    
}
