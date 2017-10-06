package DAOs;

import static DAOs.DAOGenerico.em;
import Entidades.Artigo;
import Entidades.Autor;
import java.util.ArrayList;
import java.util.List;

public class DAOAutor extends DAOGenerico<Autor> {

    public DAOAutor() {
        super(Autor.class);
    }

    public int autoIdAutor() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idAutor) FROM Autor e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }
    public List<Autor> listByLogin(String login){
        return em.createQuery("SELECT e FROM Autor e WHERE e.login LIKE :login").setParameter("login", login).getResultList();
        
    }
    public List<Autor> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Autor e WHERE e.nome LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<Autor> listById(int id) {
        return em.createQuery("SELECT e FROM Autor e WHERE e.idAutor = :id").setParameter("id", id).getResultList();
    }

    public List<Autor> listInOrderNome() {
        return em.createQuery("SELECT e FROM Autor e ORDER BY e.nome").getResultList();
    }

    public List<Autor> listInOrderId() {
        return em.createQuery("SELECT e FROM Autor e ORDER BY e.idAutor").getResultList();
    }

    public List<String> listInOrderNomeStrings(String qualOrdem) {
        List<Autor> lf;
        if (qualOrdem.equals("id")) {
            lf = listInOrderId();
        } else {
            lf = listInOrderNome();
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getIdAutor()+ "-" + lf.get(i).getNome());
        }
        return ls;
    }
    public List<Artigo> autorHasArtigo(int id) {
        return em.createQuery("SELECT cl FROM Autor p INNER JOIN p.artigoList cl WHERE p.idAutor = :id").
                setParameter("id", id).getResultList();
    }

    public List<String> listStrings() {
        List<Autor> lf = list();
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getIdAutor()+ "-" + lf.get(i).getNome());
        }
        return ls;
    }
}
///////// ***LEMBRAR DE ALTERAR AQUI, SE PRECISAR*** /////////
