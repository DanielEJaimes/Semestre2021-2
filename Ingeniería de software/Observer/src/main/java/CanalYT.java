
import java.util.ArrayList;


public class CanalYT implements Observable{

    private ArrayList<Suscriptor> subs;
    private String LastVideo;

    public CanalYT(){
        this.subs = new ArrayList<>();
    }
    
    public String getLastVideo() {
        return LastVideo;
    }
    
    @Override
    public void adjuntar(Suscriptor sub) {
        this.subs.add(sub);
    }

    @Override
    public void desadjuntar(Suscriptor sub) {
        this.subs.remove(sub);
    }

    @Override
    public void notificar() {
        for(int i = 0; i < this.subs.size(); i++){
            this.subs.get(i).actualizar();
        }
    }
    
    public void NuevoVideo(String titulo){
        this.LastVideo = titulo;
        notificar();
        System.out.println("Nuevo video!!!");
    }
    
}
