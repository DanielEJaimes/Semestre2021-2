
public class Monovolumen extends Vehiculo{
    
    private boolean PuertaCorrediza;
    
    public Monovolumen(IMotor motor, boolean a){
        this.PuertaCorrediza = a;
    }

    @Override
    public void MostrarCaracteristicas() {
        if (PuertaCorrediza == true){
            System.out.println("Este vehiculo cuenta con puertas corredizas");
        }else{
            System.out.println("Este vehiculo cuenta no con puertas corredizas");
        }
        
    }
    
}
