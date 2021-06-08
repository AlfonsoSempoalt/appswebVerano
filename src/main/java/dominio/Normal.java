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
@DiscriminatorValue(value="normal")
public class Normal extends Usuario implements Serializable {

    public Normal() {
    }

    public Normal(String nombreCompleto, String email, String contrasenia, String telefono, Byte[] avatar, Municipio ciudad, Date fechaNacimiento, Genero genero) {
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
        if (!(object instanceof Normal)) {
            return false;
        }
        Normal other = (Normal) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

   
}
