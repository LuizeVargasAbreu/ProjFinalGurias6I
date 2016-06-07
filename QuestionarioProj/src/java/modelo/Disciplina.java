/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "disciplina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d")})
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_disciplina")
    private Long idDisciplina;
    @Basic(optional = false)
    @Column(name = "disc_nome")
    private String discNome;
    @Basic(optional = false)
    @Column(name = "area")
    private String area;
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    @ManyToOne(optional = false)
    private Curso idCurso;
    @JoinColumn(name = "id_monitor", referencedColumnName = "id_monitor")
    @ManyToOne(optional = false)
    private Monitor idMonitor;
    @JoinColumn(name = "id_professor", referencedColumnName = "id_professor")
    @ManyToOne(optional = false)
    private Professor idProfessor;

    public Disciplina() {
    }

    public Disciplina(Long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public Disciplina(Long idDisciplina, String discNome, String area) {
        this.idDisciplina = idDisciplina;
        this.discNome = discNome;
        this.area = area;
    }

    public Long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getDiscNome() {
        return discNome;
    }

    public void setDiscNome(String discNome) {
        this.discNome = discNome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public Monitor getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(Monitor idMonitor) {
        this.idMonitor = idMonitor;
    }

    public Professor getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Professor idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDisciplina != null ? idDisciplina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.idDisciplina == null && other.idDisciplina != null) || (this.idDisciplina != null && !this.idDisciplina.equals(other.idDisciplina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Disciplina[ idDisciplina=" + idDisciplina + " ]";
    }
    
}
