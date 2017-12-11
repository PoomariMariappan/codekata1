import java.io.*;
import java.util.*;
public class Vowelorcon{

     public static void main(String []args){
       Scanner s=new Scanner(System.in);
char n;
int i;
n=s.next().charAt(0);
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
System.out.println("Vowel");
else
System.out.println("Consonant");
 }
}
