
package s.conversion_hex_dec;

import java.util.Scanner;

public class Conversion {
    
        public void Hex_Dec(){     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número hexadecimal: ");
        String hexadecimal = scanner.nextLine();
        int decimal = hexadecimal_A_Decimal(hexadecimal);
        System.out.println("El número decimal es: " + decimal);
    }

    public static int hexadecimal_A_Decimal(String hexadecimal) {
        int decimal = 0;
        int length = hexadecimal.length();
        for (int i = 0; i < length; i++) {
            char Valor_i = hexadecimal.charAt(i);
            int Valor_f = 0;
            
            if (Valor_i >= '0' && Valor_i <= '9') {
                Valor_f = Valor_i - '0';
            } else if (Valor_i >= 'A' && Valor_i <= 'F') {
                Valor_f = Valor_i - 'A' + 10;
            } else if (Valor_i >= 'a' && Valor_i <= 'f') {
                Valor_f = Valor_i - 'a' + 10;
            } else {
                System.out.println("Numero no valido");
            }
            decimal = decimal * 16 + Valor_f;
        }

        return decimal;
    }
        
        public void Dex_Hex(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa un número decimal: ");
            int decimal = scanner.nextInt();
            String hexadecimal = decimal_A_Hexa(decimal);
            System.out.println("El número hexadecimal es: " + hexadecimal);
        }
        
        public static String decimal_A_Hexa(int decimal) {
            if (decimal == 0) {
                return "0";
            }
            StringBuilder sb = new StringBuilder();
                while (decimal > 0) {
                    int remainder = decimal % 16;
                    char hexDigit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
                    sb.insert(0, hexDigit);
                    decimal /= 16;
                }
            return sb.toString();
        }
 }
    

