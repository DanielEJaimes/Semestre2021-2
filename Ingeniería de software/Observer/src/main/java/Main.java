
public class Main {
    
    public static void main(String[] args) {
        
        CanalYT canal = new CanalYT();
        Suscriptor s1 = new Suscriptor(canal);
        Suscriptor s2 = new Suscriptor(canal);
        Suscriptor s3 = new Suscriptor(canal);
        
        canal.adjuntar(s1);
        canal.adjuntar(s2);
        canal.adjuntar(s3);
        
        canal.NuevoVideo("Video1");
        
    }
    
}
