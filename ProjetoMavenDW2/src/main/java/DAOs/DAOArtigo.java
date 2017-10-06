package DAOs;

import Entidades.Artigo;
import java.util.ArrayList;
import java.util.List;

public class DAOArtigo extends DAOGenerico<Artigo> {

    public DAOArtigo() {
        super(Artigo.class);
    }

    public int autoIdArtigo() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.id) FROM Artigo e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<Artigo> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Artigo e WHERE e.titulo LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<Artigo> listById(int id) {
        return em.createQuery("SELECT e FROM Artigo e WHERE e.id = :id").setParameter("id", id).getResultList();
    }

    public List<Artigo> listInOrderNome() {
        return em.createQuery("SELECT e FROM Artigo e ORDER BY e.titulo").getResultList();
    }

    public List<Artigo> listInOrderId() {
        return em.createQuery("SELECT e FROM Artigo e ORDER BY e.id").getResultList();
    }

    public List<String> listInOrderNomeStrings() {
        List<Artigo> lf = listInOrderNome();
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getId() + "-" + lf.get(i).getTitulo());
        }
        return ls;
    }

//    public String[] listInOrderNomeVetorStrings() {
//        List<Artigo> lf = listInOrderNome();
//        String[] vet = new String[lf.size()];
//        for (int i = 0; i < lf.size(); i++) {
//            vet[i] = lf.get(i).getId() + "-" + lf.get(i).getTitulo();
//        }
//        return vet;
//    }
}

