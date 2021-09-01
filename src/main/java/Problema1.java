
/** Problema 1:
 * Calcular la n - ésima potencia de un número, utilizando la operación producto.
 * @author yisus
 */
import java.util.Scanner;
public class Problema1 {
public static void main(String args[])
 {
int n,t,r;
Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese un numero: ");
n = sc.nextInt();
System.out.println(" ingrese la potencia: ");
t = sc.nextInt();
r = (int)Math.pow(n,t);
System.out.println(" el numero " + n + " con la potencia "+t+ "es igual a : "+ r ) ;
sc.close();
}
}


