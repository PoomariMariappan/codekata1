import java.io.*;
import java.util.*;
  import java.text.SimpleDateFormat;
public class Workingday
{

  
    public static void main (String[] args) 
    {
       String da;
       Scanner s=new Scanner(System.in);
       da=s.nextLine();
       if(da.equals("Sunday"))
       System.out.println("false");
       else if(da.equals("Monday")||da.equals("Tuesday")||da.equals("Wednesday")||da.equals("Thursday")||da.equals("Friday")||da.equals("Saturday"))
       System.out.println("true");
    }
}



	
   

