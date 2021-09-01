
/**Problema3
 *Calcular la suma de los dígitos de un número natural. Por ejemplo, 1234=10
 * @author yisus
 */
import java.util.Scanner;
public class Problema3 {
public static void main(String args[])
 {
int t = 0,n,r = 0;
Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese un numero natural: ");
n = sc.nextInt();
for(int i=0;i<n ;i++){
r = i+1;
t=r+t;
}
System.out.println(" la suma de los numeros naturales es:"+ t ) ;
sc.close();
}
}