import java.io.*;
import java.util.*;
import java.lang.*;
public class Primerange{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
int n=s.nextInt();
int d=s.nextInt();
int a=0,i,j;
for(i=n;i<d;i++)
{
 for(j=2;j<=i;j++)
 {
     if(i==j)
       System.out.println(i);
     else if(i%j==0)
     break;

}
}
}
}
