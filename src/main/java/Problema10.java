
/**Problema10
 *Leer 5 números e imprimir sólo los pares.
 * @author yisus
 */
import java.util.Scanner;
public class Problema10 {
public static void main(String args[])
 {
int a,b,c,d,e;
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
System.out.println(" los numero pares son: " ) ;
if(a%2==0){
System.out.println(a ) ;}
if(b%2==0){
System.out.println(a ) ;}
if(c%2==0){
System.out.println(a ) ;}
if(d%2==0){
System.out.println(a ) ;}
if(e%2==0){
System.out.println(a ) ;}
sc.close();
}
}