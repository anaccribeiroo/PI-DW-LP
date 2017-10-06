package DAOs;

import Entidades.Genero;
import java.util.ArrayList;
import java.util.List;

public class DAOGenero extends DAOGenerico<Genero> {

    public DAOGenero() {
        super(Genero.class);
    }

    public int autoIdGenero() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idGenero) FROM Genero e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<Genero> listById(int id) {
        return em.createQuery("SELECT e FROM Genero e WHERE e.idGenero = :id").setParameter("id", id).getResultList();
    }

    public Genero obter(String id) {
        try {
            Genero g = (Genero) em.createQuery("SELECT e FROM Genero e WHERE e.idGenero = :id").setParameter("id", id).getSingleResult();
            return g;
        } catch (Exception e) {
            return null;
        }

    }
    public List<Genero> listInOrderId() {
        return em.createQuery("SELECT e FROM Autor e ORDER BY e.idAutor").getResultList();
    }

    public List<String> listStrings() {
        List<Genero> lf = list();
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getIdGenero() + "-" + lf.get(i).getNomeGenero());
        }
        return ls;
    }
}
///////// ***LEMBRAR DE ALTERAR AQUI, SE PRECISAR*** /////////
