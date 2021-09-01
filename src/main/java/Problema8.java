
/** Problema8:
 * Leer un número y determinar si éste es múltiplo de 3.
 * @author yisus
 */
import java.util.Scanner;
public class Problema8 {
    public static void main(String args[])
 {
int n;
Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese un numero: ");
n = sc.nextInt();
if(n%3==0){
System.out.println(" el numero " + n + " es multipo de 3" ) ;
}
else{
System.out.println(" el numero " + n + " No es multipo de 3" ) ;
} 
sc.close();
}
}

