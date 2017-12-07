import java.io.*;
import java.util.*;
public class Fact
{
public static void main(String args[])
{
int i,k=1,n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
k=k*i;
}
System.out.println(k);
}
}
