package dominio;

import dominio.Municipio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-10T13:00:46")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile ListAttribute<Estado, Municipio> municipios;
    public static volatile SingularAttribute<Estado, String> nombre;
    public static volatile SingularAttribute<Estado, Long> idestado;

}