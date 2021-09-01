
/**Problema 2:
 *Calcular el n - ésimo número de Fibonacci
 * @author yisus
 */
import java.util.Scanner;
public class Problema2 {
public static void main(String args[]){
int n,a=0,b=1,tmp;
Scanner sc = new Scanner(System.in); 
System.out.println("Introduce el numero de elementos de la serie fibonacci: ");
n = sc.nextInt();
    for(int i =1 ; i <= n ; i++ ){
           System.out.println(a+", ");
          tmp=a+b;
          a=b;
b=tmp;
}
    sc.close();
}
 
}
