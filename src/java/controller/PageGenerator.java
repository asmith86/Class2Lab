/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexsmith
 */
@WebServlet(name = "PageGenerator", urlPatterns = {"/pager"})
public class PageGenerator extends HttpServlet {

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
            out.println("<title>Servlet PageGenerator</title>"); 
            out.println("</head>");
            out.println("<body>");
             out.println("<style>"
                    + "table, th, tr, td {"
                    + "border:1px solid black;"
                    + "}"
                    + "</style>");
            //out.println("<h1>Servlet PageGenerator at " + request.getContextPath() + "</h1>");
            out.println("<h2>Welcome to this table!!</h2>");
            out.println("<table>"
                    + "<tr>"
                    + "<th>Col Heading 1</th>"
                    + "<th>Col Heading 2</th>"
                    + "<th>Col Heading 3</th>"
                    + "</tr>"
                    + "<tr>"
                    + "<td>data1:1</td>"
                    + "<td>data1:2</td>"
                    + "<td>data1:3</td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td>data2:1</td>"
                    + "<td>data2:2</td>"
                    + "<td>data2:3</td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td>data3:1</td>"
                    + "<td>data3:2</td>"
                    + "<td>data3:3</td>"
                    + "</tr>"
                    + "</table><br/>");
            out.println("Click <a href=https://www.google.com>Here</a> to go to Google.");
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
