
import java.util.ArrayList;
import java.util.Random;

public class Persona {

    private int precio;
    private int edad;
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
        Random rand =  new Random();
        this.edad = (rand.nextInt(56))+5;
        this.setPrice();

    }

    //Get
    public int getPrecio() { return precio; }

    public int getEdad() { return edad; }
    
    public String getNombre() { return nombre; }

    //Asignar precio, a una Persona nueva
    public void setPrice(){
        if(this.edad >= 5 && this.edad <=15){
            this.precio = 5000;
        }else if(this.edad >=16 && this.edad <= 35){
            this.precio = 8000;
        }else if(this.edad >= 36 && this.edad <= 60){
            this.precio = 13000;
        }
    }

    @Override
    public String toString() {
        return "Precio: " + precio + "|| Edad: " + edad + "|| Nombre: " + nombre+"\n";
    }

}
