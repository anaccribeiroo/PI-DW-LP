
package Servlets;

import DAOs.DAOAutor;
import Entidades.Autor;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AutorServlet", urlPatterns = {"/AutorServlet"})
public class AutorServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        

        String nomeAutor = request.getParameter("nome_autor");
        String dataNasc = request.getParameter("data_nasc");
        String paisOrigem = request.getParameter("pais_origem");
        String inf = request.getParameter("descricao");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        DAOAutor daoAutor = new DAOAutor();
        Autor autor = new Autor();
        autor.setIdAutor(daoAutor.autoIdAutor());
        autor.setLogin(login);
        autor.setSenha(senha);
        autor.setPermissao("user");

        autor.setNome(nomeAutor);
        try {
            autor.setDataNasc(sdf.parse(dataNasc));
        } catch (Exception e) {
            System.out.println("Erro na data");
        }
        autor.setPaisOrigem(paisOrigem);
        autor.setDescricao(inf);

        daoAutor.inserir(autor);
        
        RequestDispatcher rd = request.getRequestDispatcher("JSPs/bemvindo.jsp");
        rd.forward(request, response);

//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            List<Autor> lista = new ArrayList<>();daoAutor.list();
//
//        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        DAOAutor daoAutor = new DAOAutor();
        List<Autor> list = daoAutor.listInOrderId();
        
        request.setAttribute("listaAutores", list);
        RequestDispatcher rd = request.getRequestDispatcher("/JSPs/listaAutor.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        processRequest(request, response);
            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
