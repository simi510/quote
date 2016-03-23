/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


servlets should not have html
no java code in jsps
 */
package edu.csueb.cs3520.servlet;

import edu.csueb.cs3520.bean.User;
import edu.csueb.cs3520.util.AuthUtils;
import edu.csueb.cs3520.util.DBUtils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Simi510
 */
public class LoginCreate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url= "/index.jsp";
        try{
            
           String formType = request.getParameter("formType");
           if(formType!=null && formType.equals("login")){
               //handle login
               String username = request.getParameter("username");
               String password = request.getParameter("password");
               
               // do some logic to validate credentials
               
               //send to appropate page
               if(username!=null && password!=null && AuthUtils.authenticate(username,password)){
                   request.setAttribute("username",username );
                   User user = new User();
                   user.setUsername(username);
                   request.getSession().setAttribute("User",user);
                   url="/map.jsp";
                   if(AuthUtils.isAdmin(username,password)){
                       request.getSession().setAttribute("isAdmin", true);
                       url="/home.jsp";
                   }
                   
                   /*
                   int[][] numbers;
                   numbers = new int[4][4];
                   for(int i = 0; i < 4; i++) {
                       for(int j = 0; j < 4; j++) {
                       numbers[i][j] = i+j;
                       }
                   }
                   */
                   
               }
               else{
                   request.setAttribute("errorMsg", "please login with correct username/password");
                   url="/index.jsp";
               }
           }
           else if(formType!=null && formType.equals("create")){
               //handle accoutn creation
               String firstname = request.getParameter("firstname");
               String lastname = request.getParameter("lastname");
               String email = request.getParameter("email");
               String username = request.getParameter("username");
               String password = request.getParameter("password");
               
               if(firstname!=null && lastname!=null && email!=null && password!=null && username!=null){
                   User user = new User(firstname,lastname,email,username,password);
                   boolean success = DBUtils.createUser(user);
                   url="/login.jsp";
               }
               
           }
          // this.getServletContext().getRequestDispatcher(url).forward(request,response);
        }catch(Exception e) {
            System.err.println("error occord in " + this.getClass());
            e.printStackTrace();
        }finally{
            this.getServletContext().getRequestDispatcher(url).forward(request,response);
        }
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
