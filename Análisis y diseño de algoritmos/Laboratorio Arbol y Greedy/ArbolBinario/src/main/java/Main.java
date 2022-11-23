
public class Main {
    
    public static void main(String[] args) {
        ArbolBinario bt = new ArbolBinario();
        bt.insert(198);
        bt.insert(177);
        bt.insert(204);
        bt.insert(143);
        bt.insert(205);
        bt.insert(30);
        bt.insert(237);
        
        System.out.println("Pre-order: ");
        System.out.println(bt.preOrder(bt.root));
        System.out.println("In-order: ");
        System.out.println(bt.inOrder(bt.root));
        System.out.println("Pos-order: ");
        System.out.println(bt.posOrder(bt.root));
    }
}
    
class ArbolBinario {
    public Nodo root;
    
    public ArbolBinario(){
        this.root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public String preOrder(Nodo root){
        String obj = "";
        if (root!=null){
            System.out.print(root.objeto+"-");
            preOrder(root.izquierda);
            preOrder(root.derecha);
        }
        return obj;
    }
    
    public String inOrder(Nodo root){
        String obj = "";
        if (root!=null){
            inOrder(root.izquierda);
            System.out.print(root.objeto+"-");
            inOrder(root.derecha);
        }
        return obj;
    }
    
    public String posOrder(Nodo root){
        String obj = "";
        if (root!=null){
            posOrder(root.izquierda);
            posOrder(root.derecha);
            System.out.print(root.objeto +"-");
        }
        return obj;
    }
    
    public void insert(int obj){
        Nodo nuevo= new Nodo(obj);
        if(root == null){
            root = nuevo;
        }else{
            Nodo aux = root;
            Nodo padre;
            while(true){
                padre = aux;
                if (obj < aux.objeto){
                    aux = aux.izquierda;
                    if (aux == null){
                        padre.izquierda=nuevo;
                        return;
                    }
                }else{
                    aux = aux.derecha;
                    if (aux == null){
                        padre.derecha=nuevo;
                        return;
                    }
                }
            }
        }
    }
}

class Nodo {
    public Nodo izquierda;
    public Nodo derecha;
    public int objeto;
    
    public Nodo(int object){
        this.izquierda = null;
        this.derecha = null;
        this.objeto = object;
    }
    
    public Nodo (Nodo left, int object, Nodo right){
        this.izquierda = left;
        this.derecha = right;
        this.objeto = object;
    }    
}