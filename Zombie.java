public class Zombie{ //Tenias razon en hacer esta parte publica, por que las instrucciones dicen que no se puede imprimir nada en esta función.
    public String nombre;
    public int salud;
    public short fechaNacimiento;
    public String tipoSangre;
    
    public Zombie(String n, int s, short f, String t){
        this.nombre = n;
        this.salud = s;
        this.fechaNacimiento = f;
        this.tipoSangre = t;
    }
    
        public Zombie(Zombie Z){
        this.nombre = Z.nombre;
        this.salud = Z.salud;
        this.fechaNacimiento = Z.fechaNacimiento;
        this.tipoSangre = Z.tipoSangre;
    }
    
    
}
