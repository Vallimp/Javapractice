package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

public static void main(String[] args) {
// TODO Auto-generated method stub
//current date..current time./
	
//import date class from util class
Date d= new Date();

//M gives the month and date is printed in the requested format
//https://tutorialspoint.com/java/java_date_time.htm
SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
//gives time also in the format specified
SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss"); 
//date is an argument for simple date format
System.out.println(sdf.format(d));
System.out.println(sd.format(d));
//with toString funtion we can print date in string format
System.out.println(d.toString());

	}
}
