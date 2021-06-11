package dominio;

import dominio.Comun;
import dominio.Municipio;
import dominio.enums.Genero;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-11T15:27:42")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ { 

    public static volatile ListAttribute<Usuario, Comun> comunes;
    public static volatile SingularAttribute<Usuario, Date> fechaNacimiento;
    public static volatile SingularAttribute<Usuario, Municipio> ciudad;
    public static volatile SingularAttribute<Usuario, Genero> genero;
    public static volatile SingularAttribute<Usuario, String> contrasenia;
    public static volatile SingularAttribute<Usuario, byte[]> avatar;
    public static volatile SingularAttribute<Usuario, String> nombreCompleto;
    public static volatile SingularAttribute<Usuario, String> telefono;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, Long> idusuario;

}