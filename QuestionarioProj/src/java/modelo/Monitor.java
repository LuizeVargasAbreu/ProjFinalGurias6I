/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "monitor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Monitor.findAll", query = "SELECT m FROM Monitor m")})
public class Monitor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_monitor")
    private Long idMonitor;
    @Basic(optional = false)
    @Column(name = "mon_periodo")
    private String monPeriodo;
    @Basic(optional = false)
    @Column(name = "mon_nome")
    private String monNome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMonitor")
    private List<Disciplina> disciplinaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMonitor")
    private List<MoniAval> moniAvalList;

    public Monitor() {
    }

    public Monitor(Long idMonitor) {
        this.idMonitor = idMonitor;
    }

    public Monitor(Long idMonitor, String monPeriodo, String monNome) {
        this.idMonitor = idMonitor;
        this.monPeriodo = monPeriodo;
        this.monNome = monNome;
    }

    public Long getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(Long idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMonPeriodo() {
        return monPeriodo;
    }

    public void setMonPeriodo(String monPeriodo) {
        this.monPeriodo = monPeriodo;
    }

    public String getMonNome() {
        return monNome;
    }

    public void setMonNome(String monNome) {
        this.monNome = monNome;
    }

    @XmlTransient
    public List<Disciplina> getDisciplinaList() {
        return disciplinaList;
    }

    public void setDisciplinaList(List<Disciplina> disciplinaList) {
        this.disciplinaList = disciplinaList;
    }

    @XmlTransient
    public List<MoniAval> getMoniAvalList() {
        return moniAvalList;
    }

    public void setMoniAvalList(List<MoniAval> moniAvalList) {
        this.moniAvalList = moniAvalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMonitor != null ? idMonitor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monitor)) {
            return false;
        }
        Monitor other = (Monitor) object;
        if ((this.idMonitor == null && other.idMonitor != null) || (this.idMonitor != null && !this.idMonitor.equals(other.idMonitor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Monitor[ idMonitor=" + idMonitor + " ]";
    }
    
}
