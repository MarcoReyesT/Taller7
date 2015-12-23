/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import capaNegocio.Calculadora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eduardo
 */
@WebServlet(name = "ServletCalculadora", urlPatterns = {"/Calculadora"})
public class ServletCalculadora extends HttpServlet {

    

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
        String respuesta = "";
        String accion = request.getParameter("operacion");
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        
        int numero1 = Integer.parseInt(num1);
        
        int numero2 = Integer.parseInt(num2);
        
        Calculadora calculadoraNegocio = new Calculadora();
        calculadoraNegocio.setNumero1(numero1);
        calculadoraNegocio.setNumero2(numero2);
        
        if (accion.equals("sumar")) {
            respuesta = calculadoraNegocio.sumar(calculadoraNegocio);
        }
        else if (accion.equals("restar")) {
            respuesta = calculadoraNegocio.restar(calculadoraNegocio);
        }
        else if (accion.equals("multiplicar")) {
            respuesta = calculadoraNegocio.multiplicar(calculadoraNegocio);
        }
        else if (accion.equals("dividir")) {
            respuesta = calculadoraNegocio.dividir(calculadoraNegocio);
        }else{
            respuesta = "error al recibir los datos";
        }
        request.removeAttribute("respuesta");
        request.setAttribute("respuesta", respuesta);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
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
