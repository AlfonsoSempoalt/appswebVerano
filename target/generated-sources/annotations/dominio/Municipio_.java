package dominio;

import dominio.Estado;
import dominio.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-10T13:00:46")
@StaticMetamodel(Municipio.class)
public class Municipio_ { 

    public static volatile SingularAttribute<Municipio, Estado> estado;
    public static volatile SingularAttribute<Municipio, Long> idmunicipio;
    public static volatile ListAttribute<Municipio, Usuario> usuarios;
    public static volatile SingularAttribute<Municipio, String> nombre;

}