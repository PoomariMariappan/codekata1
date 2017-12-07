import java.io.*;
import java.util.*;
  import java.text.SimpleDateFormat;
public class Diffmins
{
    public static void main(String args[])
    {
        String start,stop;
		String dateStart = "01/14/2012 09:29:58";
		String dateStop = "01/15/2012 10:31:48";
		Scanner s=new Scanner(System.in);
		start=s.nextLine();
		stop=s.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;
		try{
			d1 = format.parse(start);
			d2 = format.parse(stop);
			long diff = d2.getTime() - d1.getTime();
			long diffMinutes = diff / (60 * 1000) % 60;
			System.out.print(diffMinutes);

}
catch (Exception e) {
			e.printStackTrace();
		}

	}

}
   

