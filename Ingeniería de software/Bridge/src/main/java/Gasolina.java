
public class Gasolina implements IMotor {

    @Override
    public void InyectarCombustible(double a) {
        System.out.println("Inyectando "+a+" de combustible");
    }

    @Override
    public void ConsumirCombustible() {
        System.out.println("Consumiendo combustible");
    }
    
    private void RealizarCombustion(){
        System.out.println("Realizando combustión");
    }
    
}
