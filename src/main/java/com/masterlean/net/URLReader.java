package com.masterlean.net;

 
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.*;

import org.json.*;

// add comment line in order to test git flow - test1 20/12 befroe finish release 
public class URLReader {
	
    public static String read(String addr)  {
    try {
   	  URL url;
	  url = new URL(addr);
	  BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

	  String inputLine;
	  String res = "";
	  
	  while ((inputLine = in.readLine()) != null)
	      res += inputLine + "\n";
	  in.close();
	  
	  return res;
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return "";  
    }
    
	public static void main(String argv[]) throws Exception {
		//URLReader urlReader = new URLReader();
		//urlReader.run();
	}
 
	public static String getDataDir() {
		return "c:/temp";
	}
    
    
		

	
	static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public String getDateTime() {		 
		   //get current date time with Date()
		   Date date = new Date();
		   return dateFormat.format(date) ;
	 }

	public static String getTemperature() {

			try {
				String url="http://api.openweathermap.org/data/2.5/weather?q=Paris&units=metric";
				
				url = "http://api.openweathermap.org/data/2.5/weather?q=Paris,fr&units=metric&appid=8439246a8d6d0272097f43c7b30c5bfc";
				
				String res = URLReader.read(url);
				
				System.out.println("result = " + res);
				
				JSONObject obj = new JSONObject(res);
				double temperature = obj.getJSONObject("main").getDouble("temp");
				return "'" + String.valueOf(temperature) + "'";				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return "n/a";

	}	
	
	
	
	
}
