import java.util.*;
public class Principal{
    public static void main  (String[]args){        
        System.out.println("<<<Menu Informcaión zombies, Alexandria>>>\n-Ingrese un numero para:\n-0 Salir\n-1 Ingresar un nuevo zombia\n-2 Información zombies\n-3 Cantidad de zombies\n-4 Zombies por Sangre\n-5 Zombies por fecha\n-6 Disminuir salud zombies a la mitad\n-7 Añadir ubicación\n-8 Información ubicaciones\n-9 Ubicación más segura\n-10 Ubicaciones ordenadas por distancia\n-11 Frases zombies\n-12 WIP");
        mostrarMenu();
    }
    public static int mostrarMenu () {
        Scanner input = new Scanner(System.in);
        byte num;
        while (true) {
            num = input.nextByte();
            switch (num) {
                case 0:
                    return 0;
                case 1:
                    
                    break;
            }
        }
    }
}
