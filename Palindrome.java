import java.io.*;
import java.util.*;
import java.lang.*;
public class Palindrome{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a,rev=0,r;
a=n;
while(n!=0)
{
    r=n%10;
    rev=rev*10+r;
n=n/10;
    
}
if(a==rev)
System.out.println("Palindrome");
else
System.out.println("not a Palindrome");
 }
}
