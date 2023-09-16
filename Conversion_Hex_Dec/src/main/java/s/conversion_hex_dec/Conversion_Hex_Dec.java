
package s.conversion_hex_dec;

import java.util.Scanner;

public class Conversion_Hex_Dec {
        
    
    public static void main(String[] args) {
        Conversion conv = new Conversion ();
        int opc= 0;
        Scanner txt = new Scanner (System.in);
        System.out.println("Bienvenido, seleccione una opcion de conversion: ");
        System.out.println(" (1) Hexadecimal a Decimal \n (2) Decimal a Hexadecimal \n (3) Salir");
        opc = txt.nextInt();
        
                switch (opc){
                    case 1:
                        conv.Hex_Dec(); // Funcion de conversion
                        txt.nextLine(); 
                        break;
                    case 2:
                        conv.Dex_Hex();  
                        txt.nextLine();                       
                        break;
                    case 3:
                        System.out.println("Muchas gracias! \nVuelva pronto!");
                        System.exit(0);
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
    }
}
