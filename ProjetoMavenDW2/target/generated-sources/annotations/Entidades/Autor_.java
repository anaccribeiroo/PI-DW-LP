package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-26T11:24:58")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile SingularAttribute<Autor, Date> dataNasc;
    public static volatile SingularAttribute<Autor, SimpleDateFormat> sdf;
    public static volatile SingularAttribute<Autor, Integer> idAutor;
    public static volatile SingularAttribute<Autor, String> nome;
    public static volatile SingularAttribute<Autor, String> paisOrigem;
    public static volatile SingularAttribute<Autor, String> descricao;

}