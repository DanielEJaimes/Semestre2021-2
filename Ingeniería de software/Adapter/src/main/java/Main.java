
public class Main {
    
    public static void main(String[] args) {
        
        PianoAcustic piano = new PianoAcustic();
        
        PianoElectric pianoE = new PianoElectric();
        
        Guitar guitar = new Guitar();
        
        pianoE.encender();
        
        PianoAcusticAdapter pianoA = new PianoAcusticAdapter(piano);
        
        System.out.println(guitar);
        System.out.println(pianoE);
        System.out.println(piano);
        System.out.println(pianoA);
        
    }
}
