/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;

import java.net.*;
import org.xml.sax.InputSource;
import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.nio.*;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;
import edu.csueb.cs3520.bean.MapBean;

 
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


/**
 *
 * @author Simi510
 */
public class GetGasPrice {


/*
examples of gas type
<cng>2.09</cng>
<diesel>1.98</diesel>
<e85>2.18</e85>
<electric>0.13</electric>
<lpg>2.9</lpg>
<midgrade>1.98</midgrade>
<premium>2.21</premium>
<regular>1.72</regular>
*/


	     public  static double getGas(String gasType){ //String origin, String destination
		String gas = gasType;
		double price = 0;
		String xmlDir = "/fuelPrices/" + gas;
	      try{

		 URL myUrl = new URL("http://www.fueleconomy.gov/ws/rest/fuelprices");

		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = factory.newDocumentBuilder();
		 Document doc = builder.parse(myUrl.openStream());
		 XPathFactory xPathfactory = XPathFactory.newInstance();
		 XPath xpath = xPathfactory.newXPath();
         XPathExpression expr = null;

		 if("cng".equals(gas))                expr = xpath.compile("/fuelPrices/cng");
		 else if("diesel".equals(gas))        expr = xpath.compile("/fuelPrices/diesel");
		  else if("e85".equals(gas))          expr = xpath.compile("/fuelPrices/e85");
		   else if("electric".equals(gas))    expr = xpath.compile("/fuelPrices/electric");
		    else if("lpg".equals(gas))        expr = xpath.compile("/fuelPrices/lpg");
		     else if("midgrade".equals(gas))  expr = xpath.compile("/fuelPrices/midgrade");
		      else if("regular".equals(gas))  expr = xpath.compile("/fuelPrices/regular");
		       else if("premium".equals(gas)) expr = xpath.compile("/fuelPrices/premium");
		        else                     expr = xpath.compile("/fuelPrices/premium");



		 String dist = expr.evaluate(doc, XPathConstants.STRING).toString();
                 price = Double.parseDouble(dist);


			} catch(Exception ex){

		}
		return price;



	}
        
             public static double gitGas(String gasType){
                // double temp = getGas(gasType);
                // String pri = Double.toString(temp);
                 return getGas(gasType);
             }
         
	public static void main(String[] args) throws Exception {
		  String o = "Salinas,Ca";
		 String d = "Allentown,PA";
		 String xmlDir = "/fuelPrices/" + "e85";
	double m = getGas("e85");


	System.out.println("Price is: " + m );
		System.out.println("cost of e85: " + getGas("e85") );
		System.out.println("cost of lpg: " + getGas("lpg") );
		System.out.println("Distance is regular: " + getGas("regular") );
                System.out.println("Distance is regular: " + gitGas("regular") );
	   
	}

  
}




