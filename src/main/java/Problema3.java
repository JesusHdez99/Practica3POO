
/**Problema 3:
 *Calcular la suma de los dígitos de un número natural. Por ejemplo, 1234=10
 * @author yisus
 */
import java.util.Scanner;
public class Problema3 {
public static void main(String args[])
 {
int n,r = 0;
Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese el numero natural que quiere sumar: ");
n = sc.nextInt();
    for(int i =0 ; i <= n ; i++ ){
  r  = r+i;
}
System.out.println(" La suma de todos los numero naturales es igual a : "+ r ) ;
sc.close();
}
}
