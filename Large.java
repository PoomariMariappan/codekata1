import java.io.*;
import java.util.*;
public class Large{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
int i;
int[] n=new int[3];
for(i=0;i<3;i++)
n[i]=s.nextInt();
if(n[0]>n[1]&&n[0]>n[2])
System.out.println(n[0]);

else if(n[1]>n[0]&&n[1]>n[2])
System.out.println(n[1]);

else
System.out.println(n[2]);
 }
}
