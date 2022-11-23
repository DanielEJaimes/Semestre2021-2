
public class Buque {
    int capacidad;
    
    Buque(int c){
        this.capacidad = c;
    }
    
    public void setCapacidad(int c){
        this.capacidad = c;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public void addContenedor(int p){
        this.capacidad = capacidad - p;
    }
    
    public void removeContenedor(int p){
        this.capacidad = capacidad + p;
    }
}
