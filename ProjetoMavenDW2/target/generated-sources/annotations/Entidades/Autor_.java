package Entidades;

import Entidades.Artigo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-05T23:08:42")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile SingularAttribute<Autor, String> senha;
    public static volatile SingularAttribute<Autor, Date> dataNasc;
    public static volatile SingularAttribute<Autor, Integer> idAutor;
    public static volatile SingularAttribute<Autor, String> nome;
    public static volatile SingularAttribute<Autor, String> paisOrigem;
    public static volatile ListAttribute<Autor, Artigo> artigoList;
    public static volatile SingularAttribute<Autor, String> login;
    public static volatile SingularAttribute<Autor, String> permissao;
    public static volatile SingularAttribute<Autor, String> descricao;

}