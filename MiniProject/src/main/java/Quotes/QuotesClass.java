package Quotes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class QuotesClass {
	
	public String getQuotes(String category)
	{
		StringBuffer sb= new StringBuffer();
	URL url;
	try {
		url = new URL("https://api.api-ninjas.com/v1/quotes?category="+category);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("accept", "application/json");
		connection.setRequestProperty("X-Api-Key","PD+skgTWPoXzVHRG9G1Lsg==uZRYUZPKqpLC3Opd");
		BufferedReader  reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line;
		while((line=reader.readLine())!=null)
		{
			sb.append(line);
			sb.append("\n");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	    System.out.println(sb);
	    return sb.toString();
	  
	}
}
