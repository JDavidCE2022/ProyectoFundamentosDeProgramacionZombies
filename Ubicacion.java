public class Ubicacion{ //Tenias razon en hacer esta parte publica, por que las instrucciones dicen que no se puede imprimir nada en esta función.
    public String nombre;
    public int distancia;
    public short cantidad;
    
    public Ubicacion(String n, int d, short c){
        this.nombre = n;
        this.distancia = d;
        this.cantidad = c;
    }
}