/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAOs.DAOAutor;
import Entidades.Autor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ana Ribeiro
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        DAOAutor daoAutor = new DAOAutor();
        Autor autor = new Autor();
        
        List<Autor> listaLogin = daoAutor.listByLogin(login);
        
        RequestDispatcher rd;

        System.out.println(senha);
        if (listaLogin.isEmpty()){
            rd = request.getRequestDispatcher("index.jsp");
            
        }else{
            autor = listaLogin.get(0);
            if (autor.getSenha().equals(senha)){
                if (autor.getPermissao().equals("user")){
                    rd = request.getRequestDispatcher("JSPs/bemvindo.jsp");
                    
                }else if (autor.getPermissao().equals("admin")){
                    rd = request.getRequestDispatcher("JSPs/autorAdmin.jsp");
                }else{
                    rd = request.getRequestDispatcher("JSPs/erros.jsp");
                }
            } else{
                rd = request.getRequestDispatcher("index.jsp");
            }
        }
        
        
        
        rd.forward(request, response);
        
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
