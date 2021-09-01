
/**Problema9
 * Leer un número y verificar si es positivo, negativo o neutro.
 * @author yisus
 */
import java.util.Scanner;
public class Problema9 {
public static void main(String args[])
 {
int n;
Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese un numero: ");
n = sc.nextInt();
if(n>0){
System.out.println(" el numero es positivo" ) ;}
if(n<0){
System.out.println(" el numero es negativo" ) ;}
if( n==0){
 System.out.println(" el numero es neutro" ) ;
}
sc.close();
}
}
