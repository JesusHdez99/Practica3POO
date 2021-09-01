
/**Problema6
 *Imprimir el primer dígito de un número: p.e. 645, imprime 6.
 * @author yisus
 */
import java.util.Scanner;
public class Problema6 {
public static void main(String args[])
 {
int n,r;
Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese un numero: ");
n = sc.nextInt();
if(n>10 && n<100){
 r=n/10;
System.out.println(" el primer digito del numero ingresado es:  " +  r) ;
sc.close();}
else if(n>100 && n<1000){
 r=n/100;
System.out.println(" el primer digito del numero ingresado es:  " +  r) ;
sc.close();}
else if(n>1000 && n<10000){
 r=n/1000;
System.out.println(" el primer digito del numero ingresado es:  " +  r) ;
sc.close();}
else if(n>10000 && n<100000){
 r=n/10000;
System.out.println(" el primer digito del numero ingresado es:  " +  r) ;
sc.close();}
}
}