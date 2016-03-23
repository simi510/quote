/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.servlet;

import edu.csueb.cs3520.bean.MapBean;
import edu.csueb.cs3520.util.DBUtils;
import static edu.csueb.cs3520.util.GetDrivingDistanceInMiles.getDistance;
import edu.csueb.cs3520.util.GetGasPrice;
import static edu.csueb.cs3520.util.GetGasPrice.getGas;
import edu.csueb.cs3520.util.MapCalc;
//import static edu.csueb.cs3520.util.GetGasPrice.getGas;
import edu.csueb.cs3520.util.UrlSigner;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.net.*;
import org.xml.sax.InputSource;
import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.nio.*;

import java.io.IOException;
import static java.lang.System.out;
import java.net.URISyntaxException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/**
 *
 * @author Simi510
 */
public class mapCreate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*
        List<User> userlist = new ArrayList<User>();
        userlist.add(new User("John", "SMith", "jsmith@gmail.com", "JSmith"));
        userlist.add(new User("Jane", "SMith", "jane.smith@gmail.com", "Jane.Smith"));
        userlist.add(new User("John", "Doe", "jdoe@gmail.com", "JDoe"));
        userlist.add(new User("Jane", "Doe", "jane.doe@gmail.com", "JaneDoe"));
        
        request.setAttribute("userlist", userlist);
        */
           String url= "/map.jsp";
                   String type = request.getParameter("formType");
        if(null!= type){ // && type.equals("create")
            
       
                    MapBean map = new MapBean();
                    
            String formType = request.getParameter("formType");
            
            String origin = request.getParameter("origin");
            String destination = request.getParameter("destination");
            String price = request.getParameter("price");
            String mpg = request.getParameter("mpg");
            String ppm = request.getParameter("ppm");
            String ppmCost =  request.getParameter("ppmCost");
            String gasList =  request.getParameter("gasList");

            
            String gas = request.getParameter("gas");
            String dist = request.getParameter("dist");
            String gallons = request.getParameter("gallons");
            String gasCost = request.getParameter("gasCost");
            String totalCost = request.getParameter("totalCost");
            
               
            
            request.setAttribute("origin",origin );
            request.setAttribute("destination",destination );
            request.setAttribute("price",price );
            request.setAttribute("mpg",mpg );
            request.setAttribute("ppm",ppm );
            request.setAttribute("ppmCost",ppmCost );
            request.setAttribute("gasList",gasList );
            
            request.setAttribute("gas",gas );
            request.setAttribute("dist",dist );
            request.setAttribute("gallons",gallons );
            request.setAttribute("totalCost",totalCost);
            request.setAttribute("gasCost",gasCost);

            
            
            String urlOrigin = URLEncoder.encode(origin, "UTF-8");
            String urlDestination = URLEncoder.encode(destination, "UTF-8");
            request.setAttribute("urlOrigin",urlOrigin);
            request.setAttribute("urlDestination",urlDestination);
            
            //double distance = getDistance(origin,destination);
            
            //double gasType = GetGasPrice.getGas("e85");

            String test = Double.toString(GetGasPrice.gitGas("e85"));
            request.getSession().setAttribute("test",test);
            
         // System.out.println("cost of e85: " + getGas("e85") );
            
            map.setGasType(gas);
            map.setOrigin(origin);
            map.setDestination(destination);
            map.setDistance(dist);
            map.setPrice(price);
            map.setMpg(mpg);
            map.setPpm(ppm);
            map.setGallons(gallons);
            map.setGasCost(gasCost);
            map.setTotalCost(totalCost);
            map.setPpmCost(ppmCost);
            
       
      
       
        
    
     
      
            
            request.getSession().setAttribute("map",map);
            
           
             request.getSession().setAttribute("distance",dist);
             
             
            // request.getSession().setAttribute("gasType",GetGasPrice.getGas("e85"));
             
            //MapCalc.calculate(map);
            // double gasCost = 
            //// double totalCost = 
            
            String action = request.getParameter("action");
             request.getSession().setAttribute("quoteId",null);
             //request.getSession().setAttribute("errMsg",null);
               // request.getSession().setAttribute("msg",null);


             if ("saveQuote".equals(action)) {
             if( origin!= null &&  destination!=null &&  price!=null &&  mpg!=null &&
                dist!=null &&  gas!=null &&  ppm!=null &&  gallons!=null && 
                gasCost!=null &&  totalCost!=null){
                   //MapBean map = new MapBean( origin,  destination,  price,  mpg,
                    //distance,  gasType,  ppm,  gallons,  gasCost,  totalCost);
               // boolean success = true;
                        int id = DBUtils.createQuote(map);
                   
                   if(id > 0){
                       request.getSession().setAttribute("msg","Quote was added to database as: " + id);
                       url= "/quote.jsp";
                       //request.getSession().setAttribute("errMsg",id);
                       request.getSession().setAttribute("quoteId",id);
                     } 
                   else {
                       request.getSession().setAttribute("errMsg","Error failed to add to database");
                       url= "/map.jsp";
                     }
                   
            
                  }
               }
             else {
                       //request.getSession().setAttribute("errMsg","Error not enough values entered");
                       url= "/map.jsp";
                  }
             
            if ("makeQuote".equals(action)) {
               // request.getSession().setAttribute("errMsg",null);
              //  request.getSession().setAttribute("msg",null);
                url= "/quote.jsp";
            }
            
              if ("print".equals(action)) {
               // request.getSession().setAttribute("errMsg",null);
              //  request.getSession().setAttribute("msg",null);
                url= "/printQuote.jsp";
            }


             //finally{this.getServletContext().getRequestDispatcher(url).forward(request,response);}

             
         }
        

           
           
        this.getServletContext().getRequestDispatcher(url).forward(request,response);
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}