
/**Problema5:
 *Determinar si un número natural es capicúa 
 * (se lee igual de derecha a izquierda que de izquierda a derecha).
 * @author yisus
 */
import java.util.Scanner;
public class Problema5 {
    public static void main(String[] args) {
    int a,aux,inv = 0, c;
    Scanner sc = new Scanner(System.in);
     do {
      System.out.print("Introduce un número >= 10: ");                                                 
       a = sc.nextInt();
        } while (a < 10);
        aux = a;
        while (aux!=0){
            c = aux % 10;
            inv = inv * 10 + c;
            aux = aux / 10;
        }
    
        if(a == inv){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}

