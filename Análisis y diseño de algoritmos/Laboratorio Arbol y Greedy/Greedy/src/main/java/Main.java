
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList contenedores = new ArrayList();
        
        System.out.println("Ingrese la capacidad de carga en toneladas del buque mercante: ");
        int capacidadb = sc.nextInt();
        Buque b1 = new Buque(capacidadb);
        System.out.println("Ingrese la cantidad de contenedores: ");
        int cantcont = sc.nextInt();
        while(cantcont > 0){
            System.out.println("Ingrese el peso del contenedor "+cantcont+" : ");
            Contenedor c = new Contenedor(sc.nextInt());
            contenedores.add(c.peso);
            cantcont --;
        }
        Collections.sort(contenedores);
        
        //MAXIMIZAR NÚMERO DE TONELADAS CARGADAS
        int cant = contenedores.size()-1;
        int cont = 0;
        while(cant >= 0 && b1.capacidad >= 0){
            b1.addContenedor((int) contenedores.get(cant));
            if(b1.capacidad >= 0){
                System.out.println("CONTENEDOR AGREGADO: "+contenedores.get(cant));
                cont ++;
            }else{
                b1.removeContenedor((int) contenedores.get(cant));
            }
            cant --;
        }
        System.out.println("CAPACIDAD RESTANTE: " + b1.capacidad);
        System.out.println("CANTIDAD DE CONTENEDORES: "+cont);
        
        //MAXIMIZAR NÚMERO DE CONTENEDORES
        Buque b2 = new Buque(capacidadb);
        
        cant = contenedores.size()-1;
        cont = 0;
        while(cont < cant && b2.capacidad >= 0){
            b2.addContenedor((int) contenedores.get(cont));
            if(b2.capacidad >= 0){
                System.out.println("CONTENEDOR AGREGADO: "+contenedores.get(cont));
                cont ++;
            }else{
                b2.removeContenedor((int) contenedores.get(cont));
            }
        }
        
        System.out.println("CAPACIDAD RESTANTE: " + b2.capacidad);
        System.out.println("CANTIDAD DE CONTENEDORES: "+cont);
    }
}
