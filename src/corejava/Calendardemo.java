package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendardemo {

	public static void main(String[] args) {
		Date d = new Date();
		//specify different formats in which u want to see the date and time using the simpledate format class
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		//u can give lowercase hh:mm:ss also
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy HH:MM:SS");
		//check the syntax
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());

	}
}
