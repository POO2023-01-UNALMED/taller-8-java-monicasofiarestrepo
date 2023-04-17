package futbol;


public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    private final String posicion;
    
    //constructor
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    //constructor del diego vuela alto 
    public Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
    
    //metodo pa imprimir: toString
    public String toString(){
        return "El futbolista "+ this.nombre+" tiene "+ this.edad+", y juega de "+ this.posicion;
    }

    //metodo equals viene del comparable 
    public boolean equals(Futbolista f){
        return this==f;
    }

    public abstract int compareTo(Object o);

    //Metodo abstract para que hereden 
    public abstract boolean jugarConLasManos();

}
