/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.servlet;

import edu.csueb.cs3520.bean.MapBean;
import edu.csueb.cs3520.bean.User;
import edu.csueb.cs3520.util.DBUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Simi510
 */
public class AdminServlet extends HttpServlet {

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
        
        String url= "/admin.jsp";
        String type = request.getParameter("formType");
        if(null!= type && type.equals("edit")){
              
                User user = new User();
                user.setFirstname(request.getParameter("firstname"));
                user.setLastname(request.getParameter("lastname"));
                user.setUsername(request.getParameter("username"));
                user.setPassword(request.getParameter("password"));
                user.setEmail(request.getParameter("email"));
                
                DBUtils.updateUser(user);
            }
        if(null!= type && type.equals("delete")){
            User user = new User();
            user.setEmail(request.getParameter("email"));
            DBUtils.deleteUser(user);
        }
        
        
       List<User> userlist =  DBUtils.getUsers();
       request.setAttribute("userlist", userlist);
       
       /*
       if(null!= type && type.equals("quote")){
                  List<MapBean> maplist =  DBUtils.getQuote();
       request.setAttribute("maplist", maplist);
           url= "/adminQuote.jsp";
       } */
       
       
       
       this.getServletContext().getRequestDispatcher(url).forward(request,response);       
       
       
        /*
        List<User> userlist = new ArrayList<User>();
        userlist.add(new User("John", "SMith", "jsmith@gmail.com", "JSmith"));
        userlist.add(new User("Jane", "SMith", "jane.smith@gmail.com", "Jane.Smith"));
        userlist.add(new User("John", "Doe", "jdoe@gmail.com", "JDoe"));
        userlist.add(new User("Jane", "Doe", "jane.doe@gmail.com", "JaneDoe"));
        
        request.setAttribute("userlist", userlist);
        */
 
        
        
        
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
