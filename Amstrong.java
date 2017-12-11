import java.io.*;
import java.util.*;
import java.lang.*;
public class Amstrong{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r,j,i=0;
j=n;
while(n!=0)
{
    r=n%10;
    i=i+r*r*r;
    n=n/10;
}
if(i==j)
       System.out.println("amstrong number");
     else 
  System.out.println("not a amstrong number");     


}
}
