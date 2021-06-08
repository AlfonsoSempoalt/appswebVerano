/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Alfon
 */
@Entity
@DiscriminatorValue(value="admin")
public class Admor extends Usuario implements Serializable {

    public Admor() {
    }

    public Admor(String nombreCompleto, String email, String contrasenia, String telefono, Byte[] avatar, Municipio ciudad, Date fechaNacimiento, Genero genero) {
        super(nombreCompleto, email, contrasenia, telefono, avatar, ciudad, fechaNacimiento, genero);
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admor)) {
            return false;
        }
        Admor other = (Admor) object;
        if ((this.idusuario == null && idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

   
    
}
