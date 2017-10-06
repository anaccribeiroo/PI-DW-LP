package Servlets;

import DAOs.DAOArtigo;
import DAOs.DAOGenero;
import Entidades.Artigo;
import Entidades.Autor;
import Entidades.Genero;
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

@WebServlet(name = "ArtigoServlet", urlPatterns = {"/ArtigoServlet"})
public class ArtigoServlet extends HttpServlet {

    int NUMEROS = 0;
    int LETRAS = 1;
    int NUMEROS_LETRAS = 2;

    private boolean verificaCampos(String campo, String adicional, int opcao) {
        campo = campo.toLowerCase();

        String carValidos = "abcdefghijklmnopqrstuvwxyz";
        String numValidos = "1234567890";
        String validar = "";

        if (campo.isEmpty()) {
            return false;
        } else {

            switch (opcao) {
                case 0:
                    validar = numValidos + adicional;
                    break;
                case 1:
                    validar = carValidos + adicional;
                    break;
                case 2:
                    validar = numValidos + carValidos + adicional;
                    break;
                default:
                    validar = "";
            }

            for (char car : campo.toCharArray()) {
                if (validar.indexOf(car) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String titulo = request.getParameter("titulo");
        String anoPublic = request.getParameter("ano_public");
        String descricao = request.getParameter("descricao");

        if (verificaCampos(titulo, " -áéíóúãõçâôê'", LETRAS)
                && verificaCampos(anoPublic, "//", NUMEROS)
                && verificaCampos(descricao, " -áéíóúãõçâôê'", LETRAS)) {

            System.out.println("passou");

            DAOArtigo daoArtigo = new DAOArtigo();
            DAOGenero daoGenero = new DAOGenero();

            Artigo artigo = new Artigo();
            artigo.setId(daoArtigo.autoIdArtigo());
            artigo.setTitulo(titulo);
            artigo.setAnoPublic(Integer.valueOf(anoPublic));
            artigo.setDescricao(descricao);
            
            List<Genero> generos = new ArrayList<Genero>();
            generos = daoGenero.listInOrderId();
            request.setAttribute("listaGeneros", generos);
            
            daoArtigo.inserir(artigo);

            RequestDispatcher rd = request.getRequestDispatcher("JSPs/autorHasArtigo.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("JSPs/erros.jsp");
            rd.forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        DAOArtigo daoArtigo = new DAOArtigo();
        List<Artigo> list = daoArtigo.listInOrderNome();

        request.setAttribute("listaArtigos", list);
        RequestDispatcher rd = request.getRequestDispatcher("/JSPs/listaArtigo.jsp");
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
