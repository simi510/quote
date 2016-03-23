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
public class GetDrivingDistanceInMiles {



     public static double getDistance(String origin, String destination){ //String origin, String destination
	String distOrigin= origin;
	String distDestination = destination;
	double meters = 0;
      try{

	 URL myUrl = new URL("http://maps.googleapis.com/maps/api/distancematrix/xml?origins=" +
	         distOrigin + "&destinations=" +
	         distDestination +
	         "&units=metric&mode=driving&language=en&sensor=false");

	 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	 DocumentBuilder builder = factory.newDocumentBuilder();
	 Document doc = builder.parse(myUrl.openStream());
	 XPathFactory xPathfactory = XPathFactory.newInstance();
	 XPath xpath = xPathfactory.newXPath();
	 XPathExpression expr = xpath.compile("/DistanceMatrixResponse/row/element/distance/value");
	 String dist = expr.evaluate(doc, XPathConstants.STRING).toString();


		  meters = (Double.parseDouble(dist) / 1609.344);


		} catch(Exception ex){

	}
	return meters;



    }


    public static void main(String[] args) throws Exception {
              String o = "Salinas,Ca";
             String d = "Allentown,PA";
    double m = getDistance(o, d);


    System.out.println("Distance is miles: " + getDistance(o, d) );

    }
}




