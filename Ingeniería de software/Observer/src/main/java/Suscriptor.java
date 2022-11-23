
public class Suscriptor implements Observer{

    private CanalYT canal = null;
    
    public Suscriptor(CanalYT o){
        this.canal = o;
    }
    
    @Override
    public void actualizar() {
        System.out.println("Nuevo video de "+canal.toString()+" -> " + canal.getLastVideo());
    }
    
}
