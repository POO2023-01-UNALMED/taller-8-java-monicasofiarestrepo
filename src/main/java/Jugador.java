package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal; 

    //constructor de siempre 
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    
   //constructor especifico al ejercicio 
    public Jugador(){
        super();
        this.golesMarcados = 289;
        this.dorsal = 7; 
    }

    //getters y setters 
    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    //METODOS 

    @Override
    public int compareTo(Object f){
        int Unterschied = (super.getEdad()) - (((Futbolista)f).getEdad());
        Math.abs(Unterschied);
        return Unterschied;
    }

    @Override
    public String toString(){
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Ha marcado "+this.golesMarcados;
    }

    @Override
    public  boolean jugarConLasManos(){
        return false;
    }
    

    
}
