import java.io.*;
import java.util.*;
import java.lang.*;
public class Prime{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a,rev=0,i;
for(i=2;i<n;i++)
{
    if(n%i==0)
 {
    rev=1;
    break;
}
    else
    rev=0;
}
if(rev==0)
System.out.println("Prime number");
else
System.out.println("not a prime number");
 }
}
