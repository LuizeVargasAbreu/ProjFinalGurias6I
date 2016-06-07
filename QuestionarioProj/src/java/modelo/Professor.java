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
@Table(name = "professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p")})
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_professor")
    private Long idProfessor;
    @Basic(optional = false)
    @Column(name = "prof_periodo")
    private String profPeriodo;
    @Basic(optional = false)
    @Column(name = "prof_nome")
    private String profNome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProfessor")
    private List<Disciplina> disciplinaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProfessor")
    private List<ProfAval> profAvalList;

    public Professor() {
    }

    public Professor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Professor(Long idProfessor, String profPeriodo, String profNome) {
        this.idProfessor = idProfessor;
        this.profPeriodo = profPeriodo;
        this.profNome = profNome;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getProfPeriodo() {
        return profPeriodo;
    }

    public void setProfPeriodo(String profPeriodo) {
        this.profPeriodo = profPeriodo;
    }

    public String getProfNome() {
        return profNome;
    }

    public void setProfNome(String profNome) {
        this.profNome = profNome;
    }

    @XmlTransient
    public List<Disciplina> getDisciplinaList() {
        return disciplinaList;
    }

    public void setDisciplinaList(List<Disciplina> disciplinaList) {
        this.disciplinaList = disciplinaList;
    }

    @XmlTransient
    public List<ProfAval> getProfAvalList() {
        return profAvalList;
    }

    public void setProfAvalList(List<ProfAval> profAvalList) {
        this.profAvalList = profAvalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfessor != null ? idProfessor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.idProfessor == null && other.idProfessor != null) || (this.idProfessor != null && !this.idProfessor.equals(other.idProfessor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Professor[ idProfessor=" + idProfessor + " ]";
    }
    
}
