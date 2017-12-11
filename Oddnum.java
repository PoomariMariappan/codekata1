import java.io.*;
import java.util.*;
import java.lang.*;
public class Oddnum{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
int n=s.nextInt();
int d=s.nextInt();
int a,i;
for(i=n;i<d;i++)
{
  if((i%2)!=0)
System.out.println(i);
}
 }
}
