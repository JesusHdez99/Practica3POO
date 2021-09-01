
/**Problema7:
 * Leer 5 números dados e imprimir la suma del primero y el quinto, 
 * la resta del segundo con el cuarto, la multiplicación de los cinco.
 * @author yisus
 */
import java.util.Scanner;
public class Problema7 {
     public static void main(String args[]){
int a,b,c,d,e,suma,resta,mult;
Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese un numero: ");
a = sc.nextInt();
System.out.println(" ingrese el segundo numero: ");
b = sc.nextInt();
System.out.println(" ingrese el tercer numero: ");
c = sc.nextInt();
System.out.println(" ingrese el cuarto numero: ");
d = sc.nextInt();
System.out.println(" ingrese un ultimo numero: ");
e = sc.nextInt();
suma=a+e;
resta=b-d;
mult=a*b*c*d*e;
System.out.println(" la suma de los numeros "+a+" y "+e+" son igual a : "+suma ) ;
System.out.println(" la resta de los numeros "+b+" y "+d+" son igual a : "+resta ) ;
System.out.println(" La multiplicacion de todos los numeros es igual a "+mult ) ;
sc.close();
}
}