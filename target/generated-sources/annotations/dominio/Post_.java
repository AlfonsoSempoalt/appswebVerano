package dominio;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-08T16:25:24")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, Date> fechaHoraEdicion;
    public static volatile SingularAttribute<Post, String> contenido;
    public static volatile SingularAttribute<Post, Date> fechaHoraCreacion;
    public static volatile SingularAttribute<Post, String> titulo;
    public static volatile SingularAttribute<Post, Long> id;

}