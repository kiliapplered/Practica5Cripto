/* 
 * @Autor Najera Noyola Karla Andrea
 * @Fecha 14 de noviembre de 2022
 * @Descripción Práctica que implementa el algoritmo Kid Krypto
*/

// Bibliotecas utilizadas.
import java.util.Scanner;

/*
 * Clase principal del programa a partir de la cual se implementa el algoritmo. 
 */
public class Main {
    public static void main(String[] args) {

        // Definición de variables a utilizar
        Scanner sc= new Scanner(System.in); // Leer entradas del teclado
        int M, e, d, n, x, y, a, b, A, B, aux1, aux2; // Valores de variables utilizadas en el algoritmo

        // Datos de bienvenida
        System.out.println(" ******      Kid Krypto Algorithm     ****** ");
        System.out.println(" *****    Created by: Karla Najera     ***** ");

        // Variable que almacena la opción del menú a mostrar. 
        int op=0;
        // Ciclo que permite la repetición del menú de opciones
        while(op!=4){
            System.out.println("\n Select an option: ");
            System.out.println("  1.-Public and Private Key ");
            System.out.println("  2.-Encrypt ");
            System.out.println("  3.-Decrypt ");
            System.out.println("  4.-Exit \n ");
            
            // Selección del usuario
            op=sc.nextInt();
            sc.nextLine();
            
            System.out.println("");
            // Menú del programa
            switch(op){ 
                case 1: // Obtención de las llaves pública y privada
                    System.out.print("a: ");
                    a=sc.nextInt();
                    System.out.print("b: ");
                    b=sc.nextInt();
                    System.out.print("A: ");
                    A=sc.nextInt();
                    System.out.print("B: ");
                    B=sc.nextInt();
                    // Inicio del algoritmo
                    M=a*b-1;
                    e=A*M+a;
                    d=B*M+b;
                    n=(e*d-1)/M;
                    // Fin del algoritmo. Se entregan resultados
                    System.out.println("\nPublic key: ("+n+", "+e+")");
                    System.out.println("Private key: "+d);
                    sc.nextLine();
                    break;
                case 2: // Encriptado del mensaje
                    System.out.print("x: ");
                    x=sc.nextInt();
                    System.out.print("e: ");
                    e=sc.nextInt();
                    System.out.print("n: ");
                    n=sc.nextInt();
                    // Inicio del cifrado
                    aux1=x*e;
                    aux2=aux1%n;
                    //Fin del cifrado
                    System.out.println("Cyphertext: "+aux2);
                    sc.nextLine();
                    break;
                case 3: // Desencriptado del mensaje
                    System.out.print("y: ");
                    y=sc.nextInt();
                    System.out.print("d: ");
                    d=sc.nextInt();
                    System.out.print("n: ");
                    n=sc.nextInt();
                    // Inicio del descifrado
                    aux1=y*d;
                    aux2=aux1%n;
                    //Fin del descifrado
                    System.out.println("Plaintext: "+aux2);
                    sc.nextLine();
                    break;
                case 4: // Salida del programa
                    System.out.println("Goodbye.");
                    break;
                default: // Mensaje en caso de opción incorrecta
                    System.out.println("Wrong option. Try again");
                    break;
            }
            System.out.println("\nPress Enter to continue...");
            sc.nextLine();
        }
        sc.close();
    }
}