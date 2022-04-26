import java.util.*;
public class Principal{
    public static void main  (String[]args){        
        System.out.println("<<<Menu Informcaión zombies, Alexandria>>>\n-Ingrese un numero para:\n-0 Salir\n-1 Ingresar un nuevo zombie\n-2 Información zombies\n-3 Cantidad de zombies\n-4 Zombies por Sangre\n-5 Zombies por fecha\n-6 Disminuir salud zombies a la mitad\n-7 Añadir ubicación\n-8 Información ubicaciones\n-9 Ubicación más segura\n-10 Ubicaciones ordenadas por distancia\n-11 Frases zombies\n-12 Para copiar un zombie");
        mostrarMenu();
    }
    public static int mostrarMenu () { //terminados: 0, 1, 2, 3, 4, 5, 6
        Scanner input = new Scanner(System.in);
        //byte num; en vez de hacer variables para ingresar cada escaneo, podemos hacer el escaneo hay mismo lo necesitemos
        //int numo;
        //String nom;
        ArrayList<Zombie> arg = new ArrayList<Zombie>();
        ArrayList<Ubicacion> arg2 = new ArrayList<Ubicacion>();
        Random rand = new Random(); //Sabes sí hay una función statica para pseudo azar? 
        String phrases[] = {"Zombies are dangerous","Zombies are contagious","Zombies are hard to kill","Zombies are Unpredictable","Zombies are Ugly"};
        while (true) {
            
            switch (input.nextByte()) {
                case 0:
                    return 0;
                case 1:
                    System.out.println("Ingrese el nombre, luego la salud, luego la fecha de nacimiento y finalmente el tipo de sangre del zombie (Usa mayusculas para el typo de Sangre): ");
                    arg.add(new Zombie (input.next(),input.nextInt(),input.nextShort(),input.next()));
                    break;
                case 2:
                    arg.forEach((n)->components(n)); //for each es un metodo del array list que hace un for loop para cada elemento del arreglo y ejecuta la acción despues del ->, la n es el elemento del arraylist (en este caso un objeto de la clase zombie).
                    break;
                case 3:
                    System.out.println("La cantidad de zombies es " + arg.size());
                    break;
                case 4:
                    arg.forEach((n)->checkBlood(n));
                    break;
                case 5:
                    arg.forEach((n)->checkDate(n));
                    break;
                case 6:
                    arg.forEach((n)->n.salud=n.salud/2);
                    break;
                case 7:
                    System.out.println("Ingrese el nombre, luego la distancia a Alexandria y finalmente la cantidad de Zombies de esta ubicacion ");
                    arg2.add(new Ubicacion (input.next(),input.nextInt(),input.nextShort()));
                    break;
                case 8:
                    arg2.forEach((n)->components2(n));
                    break;
                case 9:
                    components2(arg2.get(saferLocation(arg2)));
                    break;
                case 10:
                    bubbleSort(arg2);
                    arg2.forEach((n)->components2(n));
                    break;
                case 11:
                    
                        System.out.println(phrases[rand.nextInt(5)]);

                    break;
                case 12:
                    System.out.println("Copia el numero de la posición del zombie que quieres copiar (empezando en 0)");
                    arg.forEach((n)->components(n));
                    arg.add(new Zombie (arg.get(input.nextInt())));
                    break;
            }
        }
    }
    static void components(Zombie n){
        System.out.println("\nNombre " + n.nombre + "\nSalud "+ n.salud +"\nFecha de nacimiento " + n.fechaNacimiento + "\nTypo de Sangre " + n.tipoSangre + "\n \n");
    }
    static void checkBlood(Zombie n){
        if (n.tipoSangre.equals("O+") || n.tipoSangre.equals("AB+")) {
            components(n);
        }
    }
       static void checkDate(Zombie n){
        if (n.fechaNacimiento > 2000) {
            components(n);
        }
    }
    
    static void components2(Ubicacion n){
        System.out.println("\nNombre " + n.nombre + "\nDistancia "+ n.distancia +"\nCantidad " + n.cantidad + "\n \n");
    }
    
    static int saferLocation(ArrayList<Ubicacion> n){
        int minIndex = 0;
        short min = n.get(0).cantidad;
        for(int i=0; i<n.size(); i++){
            if(n.get(i).cantidad<min){
                min = n.get(i).cantidad;
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    static void bubbleSort(ArrayList<Ubicacion> n) {
    boolean sorted = false;
    Ubicacion temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < n.size() - 1; i++) {
            if (n.get(i).distancia > n.get(i+1).distancia) {
                temp = n.get(i);
                n.set(i,n.get(i+1));
                n.set(i+1,temp);
                sorted = false;
            }
        }
    }
}	

}
