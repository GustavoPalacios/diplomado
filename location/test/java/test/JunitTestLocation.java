package test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

public class JunitTestLocation {

	@Test
	public void test() throws MalformedURLException,
	 IOException {
		 //Code to make a webservice HTTP request
		 String responseString = "";
		 String outputString = "";
		 String wsURL = "http://localhost:8080/location/services/DelegadoLocation?wsdl";
		 URL url = new URL(wsURL);
		 URLConnection connection = url.openConnection();
		 HttpURLConnection httpConn = (HttpURLConnection)connection;
		 ByteArrayOutputStream bout = new ByteArrayOutputStream();
		 String xmlInput =     "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:del=\"http://delegado.location\">" +
				   "<soapenv:Header/> <soapenv:Body> <del:geolocalizacion> "+
					"<del:direcciones>Colombia,Valle%20del%20Cauca,Cali,Belalcazar,Cra17,21,16-Colombia,Valle%20del%20Cauca,Cali,Belalcazar,Cra17,21,16</del:direcciones>"+
				     "</del:geolocalizacion>   </soapenv:Body></soapenv:Envelope>";
		 byte[] buffer = new byte[xmlInput.length()];
		 buffer = xmlInput.getBytes();
		 bout.write(buffer);
		 byte[] b = bout.toByteArray();
		 String SOAPAction =
		 "http://localhost:8080/location/services/DelegadoLocation";
		 // Set the appropriate HTTP parameters.
		 httpConn.setRequestProperty("Content-Length",
		 String.valueOf(b.length));
		 httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
		 httpConn.setRequestProperty("SOAPAction", SOAPAction);
		 httpConn.setRequestMethod("POST");
		 httpConn.setDoOutput(true);
		 httpConn.setDoInput(true);
		 OutputStream out = httpConn.getOutputStream();
		 //Write the content of the request to the outputstream of the HTTP Connection.
		 out.write(b);
		 out.close();
		 
		 //Ready with sending the request.
		  
		 //Read the response.
		 InputStreamReader isr =
		 new InputStreamReader(httpConn.getInputStream());
		 BufferedReader in = new BufferedReader(isr);
		  
		 //Write the SOAP message response to a String.
		 while ((responseString = in.readLine()) != null) {
		 outputString = outputString + responseString;
		 }
		 
		 String resultadoOk = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><soapenv:Body><geolocalizacionResponse xmlns=\"http://delegado.location\"><geolocalizacionReturn>{&quot;Descripci&#xF3;n&quot;:&quot;Exito&quot;,&quot;Response&quot;:&quot;{\\&quot;1\\&quot;:\\&quot;15 mins-903\\&quot;,\\&quot;0\\&quot;:\\&quot;15 mins-903\\&quot;}&quot;,&quot;ResultCode&quot;:&quot;000&quot;}</geolocalizacionReturn></geolocalizacionResponse></soapenv:Body></soapenv:Envelope>";
		 assertEquals(outputString, resultadoOk);

		 }

}
