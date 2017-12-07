import java.io.*;
import java.util.*;
public class Camel
{
    public static void main(String args[])
    {
      int i,n;
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        n=str.length();
       String res="";
       
       char a=str.charAt(0);
       res=res+Character.toUpperCase(a);
       for(i=1;i<n;i++)
       {
       char cur=str.charAt(i);
          char pre=str.charAt(i-1);
     
       if(pre==' ')
       res=res+Character.toUpperCase(cur);
        else
        res=res+cur;
    }
        System.out.println(res);
    }
}

