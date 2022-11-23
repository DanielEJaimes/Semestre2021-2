
public class Berlina extends Vehiculo{
    
    private int CapacidadMaletero;

    public Berlina(IMotor motor, int a){
        this.CapacidadMaletero = a;
    }
    
    @Override
    public void MostrarCaracteristicas() {
        System.out.println("Capacidad en el maletero de "+CapacidadMaletero);
    }
}
