import java.io.*;
import java.util.*;
public class Leapyear{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
int i,n;
n=s.nextInt();
if(n%4==0)
System.out.println("leap year");
else
System.out.println("not a leap year");
 }
}
