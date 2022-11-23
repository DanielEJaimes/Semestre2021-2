import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de clientes que desea ingresar:");
        int size = sc.nextInt();
        String name;
        Persona[] clientes = new Persona[size];

        for(int i = 0 ; i  < size ; i++){
            System.out.println("Digite el nombre de la Persona " + (i+1));
            name = sc.next();
            Persona newcl = new Persona(name);
            clientes[i] = newcl;
        }

        System.out.println(printClientes(clientes));

        System.out.println("--------------------------------Array de Clientes ordenado--------------------------------\n");
        //MergeSort mgSort = new MergeSort();
        //HeapSort hpsort = new HeapSort();
        QuickSort qSort = new QuickSort();
        
        //mgSort.sort(clientes, 0, clientes.length-1);
        //hpsort.sort(clientes);
        qSort.QuickSort(clientes,0,clientes.length-1);
        System.out.println(printClientes(clientes));

        System.out.println("La persona con mayor edad es "+clientes[clientes.length-1].getNombre());
        System.out.println("La persona con menor edad es "+clientes[0].getNombre());
        
        int recaudo=0;
        
        for (Persona p:clientes) {
            recaudo += p.getPrecio();
        }
        
        System.out.println("Se recaudó "+recaudo+" pesos");
        
    }
    public static String printClientes(Persona[] arr){
        String output = "-------Lista de Clientes-------\n";
        for (Persona p:arr) {
            output += p.toString() + "\n";
        }
        return output;
    }
}
