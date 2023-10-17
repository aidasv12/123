
package tamrin1;
import java.util.Scanner;

public class darajeh2 {
Scanner input=new Scanner(System.in);
public darajeh2(){}
public void moadelehdarajeh2(){
System.out.println("please enter num");
int a=input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
double delta=b*b-4*a*c;
if(delta>0){
System.out.println("moadeleh 2 rishe darad");
double x1=(-b+Math.sqrt(delta))/(2*a);
double x2=(-b-Math.sqrt(delta))/(2*a);
System.out.println("x1="+x1);
System.out.println("x2="+x2);
}
if(delta==0){
System.out.println("moadeleh 1 rishe darad");
int x1=-b/(2*a);
System.out.println("x1="+x1);}
if(delta<0){
System.out.println("moadeleh rishe nadarad");}
}    
    
}
