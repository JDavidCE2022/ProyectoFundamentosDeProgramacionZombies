import java.util.*;
public class Principal{
    public static void main  (String[]args){        
        System.out.println("<<<Menu Informcaión zombies, Alexandria>>>\n-Ingrese un numero para:\n-0 Salir\n-1 Ingresar un nuevo zombie\n-2 Información zombies\n-3 Cantidad de zombies\n-4 Zombies por Sangre\n-5 Zombies por fecha\n-6 Disminuir salud zombies a la mitad\n-7 Añadir ubicación\n-8 Información ubicaciones\n-9 Ubicación más segura\n-10 Ubicaciones ordenadas por distancia\n-11 Frases zombies\n-12 WIP");
        mostrarMenu();
    }
    public static int mostrarMenu () { //terminados: 0, 1, 2, 3, 4, 5, 6
        Scanner input = new Scanner(System.in);
        //byte num; en vez de hacer variables para ingresar cada escaneo, podemos hacer el escaneo hay mismo lo necesitemos
        //int numo;
        //String nom;
        ArrayList<Zombie> arg = new ArrayList<Zombie>();
        while (true) {
            
            switch (input.nextByte()) {
                case 0:
                    return 0;
                case 1:
                    System.out.println("Ingrese el nombre, luego la salud, luego la fecha de nacimiento y finalmente el tipo de sangre del zombie (Usa mayusculas para el typo de Sangre)");
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
}
