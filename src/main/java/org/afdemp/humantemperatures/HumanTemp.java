/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.humantemperatures;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Human;
import models.HumanTemperature;
import models.Temperature;

/**
 *
 * @author mac
 */
public class HumanTemp extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HumanTemp</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HumanTemp at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        response.setContentType("text/html;charset=UTF-8");
        
        HumanTemperature ht = getHumanTemperature(request);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HumanTemp</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HumanTemp at " + request.getContextPath() + "</h1>");
            out.println("<p>Your First Name is: " + ht.getHuman().getName() + "</p>");
            out.println("<p>Your 1st temp is: " + ht.getTemperature().getTemps()[0] + "</p>");
            out.println("<p>Your 2nd temp is: " + ht.getTemperature().getTemps()[1] + "</p>");
            out.println("<p>Your 3rd temp is: " + ht.getTemperature().getTemps()[2] + "</p>");
            out.println("<p>Your average temp is: " + ht.getTemperature().getAverage() + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
        
        
    }
    
    public HumanTemperature getHumanTemperature(HttpServletRequest request) {
        Human h = new Human(request.getParameter("firstname"));
        float[] temps = new float[3];
        temps[0]=Float.parseFloat(request.getParameter("temp1"));
        temps[1]=Float.parseFloat(request.getParameter("temp2"));
        temps[2]=Float.parseFloat(request.getParameter("temp3"));
        Temperature t = new Temperature(temps); 
        HumanTemperature ht = new HumanTemperature(h, t);
        return(ht);
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
