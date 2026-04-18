/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea3_grupo2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class mainTarea3_Grupo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int menu = 0;
        Conversor conversor_opcion = new Conversor();
        
        while(menu != 4)
        {
            try
            {
                System.out.println("______MENU______");
                System.out.println("Introduzca la opcion a realizar");
                System.out.println("1. Convertir grados Celsius a Fahrenheit");
                System.out.println("2. Convertir kilometros a millas");
                System.out.println("3. Convertir segundos a minutos y segundos");
                System.out.println("4. SALIR");
                System.out.print("Opcion: ");
                menu = entrada.nextInt();
                entrada.nextLine();

                switch (menu)
                {
                    case 1:
                        System.out.print("Introduzca los grados Celsius a convertir: ");
                        double grados = entrada.nextDouble();
                        entrada.nextLine();

                        System.out.println("Celsius: " + grados);
                        System.out.println("Fahrenheit: " + conversor_opcion.convertir(grados));
                        break;
                    case 2:
                        System.out.print("Introduzca los kilometros a convertir: ");
                        float km = entrada.nextFloat();
                        entrada.nextLine();

                        System.out.println("Kilometros: " + km);
                        System.out.println("Millas: " + conversor_opcion.convertir(km));   
                        break;
                    case 3:
                        System.out.print("Introduzca la cantidad de segundos a convertir: ");
                        int sg = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println(conversor_opcion.convertir(sg));
                        break;
                    case 4:
                        System.out.println("Saliendo del Menu....");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                if (menu != 4) {
                    System.out.println("Presione Enter para continuar al Menu...");
                    entrada.nextLine();
                }
            } 
            catch (InputMismatchException e)
            {
                System.out.println("ERROR: Debe ingresar un valor numérico válido.");
                entrada.nextLine(); 
            }
        }
    }
    
}
