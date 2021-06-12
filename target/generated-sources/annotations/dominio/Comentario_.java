package dominio;

import dominio.Comun;
import dominio.Normal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-11T20:38:28")
@StaticMetamodel(Comentario.class)
public class Comentario_ { 

    public static volatile SingularAttribute<Comentario, Normal> normal;
    public static volatile SingularAttribute<Comentario, String> contenido;
    public static volatile SingularAttribute<Comentario, Date> fechaHora;
    public static volatile SingularAttribute<Comentario, Long> id;
    public static volatile SingularAttribute<Comentario, Comun> comun;

}