
public interface Observable {
    
    public void adjuntar(Suscriptor o);
    public void desadjuntar(Suscriptor o);
    public void notificar();
    
}
