/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AngelCoavas.Examenes.version.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HP5
 */
@Entity
@Table(name = "laboratiorio", catalog = "examenes_clinicos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Laboratiorio.findAll", query = "SELECT l FROM Laboratiorio l"),
    @NamedQuery(name = "Laboratiorio.findById", query = "SELECT l FROM Laboratiorio l WHERE l.id = :id"),
    @NamedQuery(name = "Laboratiorio.findByNombre", query = "SELECT l FROM Laboratiorio l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Laboratiorio.findByNombreDeEnsayo", query = "SELECT l FROM Laboratiorio l WHERE l.nombreDeEnsayo = :nombreDeEnsayo"),
    @NamedQuery(name = "Laboratiorio.findByTipoDeContenido", query = "SELECT l FROM Laboratiorio l WHERE l.tipoDeContenido = :tipoDeContenido"),
    @NamedQuery(name = "Laboratiorio.findByFechadeensayo", query = "SELECT l FROM Laboratiorio l WHERE l.fechadeensayo = :fechadeensayo")})
public class Laboratiorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "nombre_de_ensayo", nullable = false, length = 100)
    private String nombreDeEnsayo;
    @Basic(optional = false)
    @Column(name = "tipo_de_contenido", nullable = false, length = 40)
    private String tipoDeContenido;
    @Basic(optional = false)
    @Column(name = "Fecha_de_ensayo", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechadeensayo;

    public Laboratiorio() {
    }

    public Laboratiorio(Integer id) {
        this.id = id;
    }

    public Laboratiorio(Integer id, String nombre, String nombreDeEnsayo, String tipoDeContenido, Date fechadeensayo) {
        this.id = id;
        this.nombre = nombre;
        this.nombreDeEnsayo = nombreDeEnsayo;
        this.tipoDeContenido = tipoDeContenido;
        this.fechadeensayo = fechadeensayo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDeEnsayo() {
        return nombreDeEnsayo;
    }

    public void setNombreDeEnsayo(String nombreDeEnsayo) {
        this.nombreDeEnsayo = nombreDeEnsayo;
    }

    public String getTipoDeContenido() {
        return tipoDeContenido;
    }

    public void setTipoDeContenido(String tipoDeContenido) {
        this.tipoDeContenido = tipoDeContenido;
    }

    public Date getFechadeensayo() {
        return fechadeensayo;
    }

    public void setFechadeensayo(Date fechadeensayo) {
        this.fechadeensayo = fechadeensayo;
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
        if (!(object instanceof Laboratiorio)) {
            return false;
        }
        Laboratiorio other = (Laboratiorio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AngelCoavas.Examenes.version.models.Laboratiorio[ id=" + id + " ]";
    }

    
}
