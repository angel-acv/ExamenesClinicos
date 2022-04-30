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
@Table(name = "admin", catalog = "examenes_clinicos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByIdAdmin", query = "SELECT a FROM Admin a WHERE a.idAdmin = :idAdmin"),
    @NamedQuery(name = "Admin.findByNombre", query = "SELECT a FROM Admin a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Admin.findByFechaCertificado", query = "SELECT a FROM Admin a WHERE a.fechaCertificado = :fechaCertificado"),
    @NamedQuery(name = "Admin.findByContenido", query = "SELECT a FROM Admin a WHERE a.contenido = :contenido")})
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_admin", nullable = false)
    private Integer idAdmin;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 80)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "fecha_certificado", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCertificado;
    @Basic(optional = false)
    @Column(name = "Contenido", nullable = false, length = 100)
    private String contenido;

    public Admin() {
    }

    public Admin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Admin(Integer idAdmin, String nombre, Date fechaCertificado, String contenido) {
        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.fechaCertificado = fechaCertificado;
        this.contenido = contenido;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCertificado() {
        return fechaCertificado;
    }

    public void setFechaCertificado(Date fechaCertificado) {
        this.fechaCertificado = fechaCertificado;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdmin != null ? idAdmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.idAdmin == null && other.idAdmin != null) || (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AngelCoavas.Examenes.version.models.Admin[ idAdmin=" + idAdmin + " ]";
    }
    
}
