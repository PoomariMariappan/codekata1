import java.io.*;
import java.util.*;
public class Digit{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
while(n!=0)
{
    n=n/10;
    c++;
}
System.out.println(c);
 }
}
