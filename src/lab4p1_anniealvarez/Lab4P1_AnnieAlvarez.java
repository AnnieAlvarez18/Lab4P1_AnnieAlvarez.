/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_anniealvarez;
import java.util.Scanner;
/**
 *
 * @author anniealvarez
 */
public class Lab4P1_AnnieAlvarez {
static Scanner lectura = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean menu = true;
        
        while(menu == true){
            System.out.println("--MENU--");
            System.out.println("1. Sumador Binario");
            System.out.println("2. Contains");
            System.out.println("3. Alpha");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opcion que desee");
            int opcion = lectura.nextInt();
            
            switch(opcion){
                case 1: {
                    System.out.println("1. Sumador Binario");
                    System.out.println("Ingrese el primer numero: ");
                    String cadena1 = lectura.nextLine();
                    lectura.nextLine();
                    System.out.println("Ingrese el segundo numero: ");
                    String cadena2 = lectura.nextLine();
                    for(int i = 0; i < cadena1.length(); i++){
                        for(int j = 0; j<cadena2.length(); j++){
                            if(cadena1 == cadena2){
                                //llamado del metodo
                                Binario(cadena1, cadena2);
                    }else{
                       System.out.println("Los numeros deben de tener el mismo numero de bits");
                    }
                    }
                    }//fin else
                       
                    
                }//fin case 1
                break;
                
                case 2: {
                    System.out.println("2. Contains");
                    System.out.println("Ingrese la primera cadena: ");
                    String cadena = lectura.nextLine().toLowerCase();
                    lectura.nextLine();
                    System.out.println("Ingrese la segundsa cadena: ");
                    String cadenacon = lectura.nextLine().toLowerCase();
                    
                    if(cadena.length() > cadenacon.length()){
                        //llamado del metodo
                        Contains(cadena, cadenacon);
                    }else{
                        System.out.println("El tamaño de la segunda cadena no puede ser mayor que el de la primera");
                    }
                    
                }//fin case 2
                break;
                
                case 3: {
                    System.out.println("3. Alpha");
                    System.out.println("Ingrese la cadena que desea evaluar");
                    lectura.nextLine();
                    String caracteres = lectura.nextLine().toLowerCase();
                    
                    
                    //llamado del metodo
                    is_alpha(caracteres);
                    
                }//fin case 3
                break;
                
                case 4: {
                    menu = false;
                }//fin case 4
                break;
                default:
                    System.out.println("Esa opcion no funciona");
            }//fin switch
        }//fin while
    }//fin metodo main
    
    public static void Binario(String cadena1, String cadena2){
        for(int i = 0; i < cadena1.charAt(i); i++){
            if(cadena1.charAt(i) == 48 && cadena1.charAt(i) == 49){
               int suma;
               if(cadena1.charAt(i) == 0 && cadena2.charAt(i) == 0){
                   suma = 0;
               }
               if((cadena1.charAt(i) == 0 && cadena2.charAt(i) == 1) ||(cadena1.charAt(i) == 1 && cadena2.charAt(i) == 0)){
                  suma = 1;
               }
               if(cadena1.charAt(i) == 1 && cadena2.charAt(i) == 1){
                   suma = 0;
               }
               if(cadena1.charAt(i)+1 == 1 && cadena2.charAt(i)+1 == 1){
                   suma = 1;
                   
                   System.out.print("La suma es: ");
                           System.out.print(suma);
               }
               
            }else{
                System.out.println("El primer número contiene caracteres distintos de '0' y '1'");
            }
            
            
        }
        
        
    }//fin metodo binario
    
    
    public static void Contains(String cadena, String cadenacon){
        
        for(int i = 0; i < cadena.length(); i++){
            if((cadena.charAt(i) == cadenacon.charAt(i)) || cadenacon.equals(cadena) ){
                
                System.out.println("La cadena "+ cadena+ " contiene a la cadena "+ cadenacon);
            }else{
               System.out.println("La cadena "+ cadena+ " no contiene a la cadena "+ cadenacon);
            }
        }
        
    }//fin metodo contains 
    
    
    
    public static void is_alpha(String caracteres){
        boolean flag =false;
        for(int i = 0; i < caracteres.length(); i++){
            
            if(caracteres.charAt(i)>=97 && caracteres.charAt(i)<=122){
                flag=false;
                
            }else{
               
                flag=true;
            }
            
        }//fin for
        if(flag){
            System.out.println("La cadena contiene caracteres que no son letras");
        }else{
            System.out.println("La cadena sólo contiene letras");
        }
    }//fin metodo Alpha
    
    
}//FIN 