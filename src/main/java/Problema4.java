
/**Problema 4;
 *Cálculo de los salarios mensuales de los empleados de una empresa, 
 * sabiendo que éstos se calculan con base en las horas 
 * semanales trabajadas y de acuerdo a un precio especificado por horas 
 * Si se pasan de cuarenta horas semanales, las horas extraordinarias
 * se pagarán a razón de 1.5 veces la hora ordinaria

 * @author yisus
 */
import java.util.Scanner;
public class Problema4 {
public static void main(String args[])
 {
int h,hext,p;
Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese las horas de jornada por dia: ");
h = sc.nextInt();
System.out.println(" ingrese las horas extra trabajadas ");
hext = sc.nextInt();
System.out.println(" ingrese el precio especifico por hora ");
p = sc.nextInt();
System.out.println(" el salario por mes es igual a:"+ ((27*h*p)+(hext*1.5*p)) ) ;
sc.close();
}
}

