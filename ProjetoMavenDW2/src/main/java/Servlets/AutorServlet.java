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

        String nomeAutor = request.getParameter("nome_autor");
        String dataNasc = request.getParameter("data_nasc");
        String paisOrigem = request.getParameter("pais_origem");
        String inf = request.getParameter("descricao");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
//        sdf.setLenient(true);

        if (verificaCampos(nomeAutor, " -áéíóúãõçâôê'", LETRAS)
                && verificaCampos(dataNasc, "//", NUMEROS)
                && verificaCampos(paisOrigem, " -áéíóúãõçâôê'", LETRAS)
                && verificaCampos(inf, " -áéíóúãõçâôê',.!?", LETRAS)
                && verificaCampos(login, "", NUMEROS_LETRAS)
                && verificaCampos(senha, "", NUMEROS_LETRAS)) {
            
            System.out.println("passou");
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

            RequestDispatcher rd = request.getRequestDispatcher("JSPs/artigo.jsp");
            rd.forward(request, response);
        }
        else{
            RequestDispatcher rd = request.getRequestDispatcher("JSPs/erros.jsp");
            rd.forward(request, response);
        }

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
