package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "comun")
@Table(name = "comunes")
public class Comun extends Post implements Serializable {

    @OneToMany(mappedBy = "comun", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    public Comun() {
    }

    public Comun(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    public Comun(Long id, List<Comentario> comentarios) {
        this.id = id;
        this.comentarios = comentarios;
    }
        
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comun)) {
            return false;
        }
        Comun other = (Comun) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Comun{" + "id=" + id + ", comentarios=" + comentarios + '}';
    }
    
}
