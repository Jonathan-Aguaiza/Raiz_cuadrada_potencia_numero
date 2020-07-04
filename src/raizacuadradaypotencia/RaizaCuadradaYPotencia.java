/*
Implementar un algoritmo que me permita ingresar un numero por teclado,
realizar la raiz cuadrada y su potencia. 
 */
package raizacuadradaypotencia;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class RaizaCuadradaYPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar numero
        int numero,numeropot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        numero = sc.nextInt();
        System.out.println("Número ingresado: "+numero);
        System.out.println("Hallar la ráiz cuadrada del número ingresado ");
        if(numero>0){
            System.out.println("Raiz cuadrada del numero ingresado es: "
                    +Math.sqrt(numero));
        }
        else{
            System.out.println("Raiz cuadrada del numero ingresado es: imaginario ");
        }
        System.out.println("Hallar la potencia del número ingresado");
        System.out.println("Ingrese el valor de la potencia:");
        numeropot = sc.nextInt();
        System.out.println("El numero ingresado "+numero+" elevado a la potencia "
                +numeropot+ " es igual a: "+Math.pow(numero, numeropot));
        // TODO code application logic here
        // TODO code application logic here
    }
    
}
