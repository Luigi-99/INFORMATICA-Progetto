/**
 * 
 */
package com.esame.demo.database;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

import com.esame.demo.model.Metadata;
import com.esame.demo.model.Record;
/**
 * @author Luigi_Arrizza
 *
 */
public class DatabaseClass {
	
	static Map<Integer, Record> Data= new HashMap<Integer, Record>();
	Map<Integer, Metadata> Metadatajson= new HashMap<Integer, Metadata>();
	
	
	 public Map<Integer, Record> getData() {
		return Data;
	}





	public static void getDataset(String url) {
		 try {
			URLConnection openconnection = new URL(url).openConnection();
			openconnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream In= openconnection.getInputStream();
			String data= "";
			String line="";
			
		    InputStreamReader Rin= new InputStreamReader(In);
		    BufferedReader buf= new BufferedReader(Rin);
		    while((line=buf.readLine())!= null) {
		    	data+=line;
		    }
		    In.close();
		    JSONObject o1= (JSONObject) JSONValue.parseWithException(data);
		    JSONArray o2= (JSONArray) (o1.get("data"));
		    for(int j=0;j<o2.size();j++) {
		    	JSONObject posIn= (JSONObject) o2.get(j);
		    	Data.put(j,new Record((String) posIn.get("media_type"),(String) posIn.get("caption"),(String)posIn.get("id")));
		    	
		    }
		   
		    
		    
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
		    e.printStackTrace();
		}
	 }
		
	
	
	 
	 
	 
	 
	 
	

}
