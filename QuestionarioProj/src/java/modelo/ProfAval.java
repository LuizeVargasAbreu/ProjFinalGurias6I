/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.lang.Integer;
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
@Table(name = "prof_aval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfAval.findAll", query = "SELECT p FROM ProfAval p"),
    @NamedQuery(name = "ProfAval.findByIdProfaval", query = "SELECT p FROM ProfAval p WHERE p.idProfaval = :idProfaval"),
    @NamedQuery(name = "ProfAval.findByPaPeriodo", query = "SELECT p FROM ProfAval p WHERE p.paPeriodo = :paPeriodo"),
    @NamedQuery(name = "ProfAval.findByPaResposta1", query = "SELECT p FROM ProfAval p WHERE p.paResposta1 = :paResposta1"),
    @NamedQuery(name = "ProfAval.findByPaResposta2", query = "SELECT p FROM ProfAval p WHERE p.paResposta2 = :paResposta2"),
    @NamedQuery(name = "ProfAval.findByPaResposta3", query = "SELECT p FROM ProfAval p WHERE p.paResposta3 = :paResposta3"),
    @NamedQuery(name = "ProfAval.findByPaResposta4", query = "SELECT p FROM ProfAval p WHERE p.paResposta4 = :paResposta4"),
    @NamedQuery(name = "ProfAval.findByPaResposta5", query = "SELECT p FROM ProfAval p WHERE p.paResposta5 = :paResposta5"),
    @NamedQuery(name = "ProfAval.findByPaResposta6", query = "SELECT p FROM ProfAval p WHERE p.paResposta6 = :paResposta6"),
    @NamedQuery(name = "ProfAval.findByPaResposta7", query = "SELECT p FROM ProfAval p WHERE p.paResposta7 = :paResposta7"),
    @NamedQuery(name = "ProfAval.findByPaResposta8", query = "SELECT p FROM ProfAval p WHERE p.paResposta8 = :paResposta8"),
    @NamedQuery(name = "ProfAval.findByPaResposta9", query = "SELECT p FROM ProfAval p WHERE p.paResposta9 = :paResposta9"),
    @NamedQuery(name = "ProfAval.findByPaResposta10", query = "SELECT p FROM ProfAval p WHERE p.paResposta10 = :paResposta10")})
public class ProfAval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_profaval")
    private Integer idProfaval;
    @Basic(optional = false)
    @Column(name = "pa_periodo")
    private String paPeriodo;
    @Basic(optional = false)
    @Column(name = "pa_resposta1")
    private Integer paResposta1;
    @Basic(optional = false)
    @Column(name = "pa_resposta2")
    private Integer paResposta2;
    @Basic(optional = false)
    @Column(name = "pa_resposta3")
    private Integer paResposta3;
    @Basic(optional = false)
    @Column(name = "pa_resposta4")
    private Integer paResposta4;
    @Basic(optional = false)
    @Column(name = "pa_resposta5")
    private Integer paResposta5;
    @Basic(optional = false)
    @Column(name = "pa_resposta6")
    private Integer paResposta6;
    @Basic(optional = false)
    @Column(name = "pa_resposta7")
    private Integer paResposta7;
    @Basic(optional = false)
    @Column(name = "pa_resposta8")
    private Integer paResposta8;
    @Basic(optional = false)
    @Column(name = "pa_resposta9")
    private Integer paResposta9;
    @Basic(optional = false)
    @Column(name = "pa_resposta10")
    private Integer paResposta10;
    @JoinColumn(name = "id_professor", referencedColumnName = "id_professor")
    @ManyToOne(optional = false)
    private Professor Professor;
    @JoinColumn(name = "id_questionario", referencedColumnName = "id_questionario")
    @ManyToOne(optional = false)
    private Questionario Questionario;

    public ProfAval() {
    }

    public ProfAval(Integer idProfaval) {
        this.idProfaval = idProfaval;
    }

    public ProfAval(Integer idProfaval, String paPeriodo, Integer paResposta1, Integer paResposta2, Integer paResposta3, Integer paResposta4, Integer paResposta5, Integer paResposta6, Integer paResposta7, Integer paResposta8, Integer paResposta9, Integer paResposta10) {
        this.idProfaval = idProfaval;
        this.paPeriodo = paPeriodo;
        this.paResposta1 = paResposta1;
        this.paResposta2 = paResposta2;
        this.paResposta3 = paResposta3;
        this.paResposta4 = paResposta4;
        this.paResposta5 = paResposta5;
        this.paResposta6 = paResposta6;
        this.paResposta7 = paResposta7;
        this.paResposta8 = paResposta8;
        this.paResposta9 = paResposta9;
        this.paResposta10 = paResposta10;
    }

    public Integer getIdProfaval() {
        return idProfaval;
    }

    public void setIdProfaval(Integer idProfaval) {
        this.idProfaval = idProfaval;
    }

    public String getPaPeriodo() {
        return paPeriodo;
    }

    public void setPaPeriodo(String paPeriodo) {
        this.paPeriodo = paPeriodo;
    }

    public Integer getPaResposta1() {
        return paResposta1;
    }

    public void setPaResposta1(Integer paResposta1) {
        this.paResposta1 = paResposta1;
    }

    public Integer getPaResposta2() {
        return paResposta2;
    }

    public void setPaResposta2(Integer paResposta2) {
        this.paResposta2 = paResposta2;
    }

    public Integer getPaResposta3() {
        return paResposta3;
    }

    public void setPaResposta3(Integer paResposta3) {
        this.paResposta3 = paResposta3;
    }

    public Integer getPaResposta4() {
        return paResposta4;
    }

    public void setPaResposta4(Integer paResposta4) {
        this.paResposta4 = paResposta4;
    }

    public Integer getPaResposta5() {
        return paResposta5;
    }

    public void setPaResposta5(Integer paResposta5) {
        this.paResposta5 = paResposta5;
    }

    public Integer getPaResposta6() {
        return paResposta6;
    }

    public void setPaResposta6(Integer paResposta6) {
        this.paResposta6 = paResposta6;
    }

    public Integer getPaResposta7() {
        return paResposta7;
    }

    public void setPaResposta7(Integer paResposta7) {
        this.paResposta7 = paResposta7;
    }

    public Integer getPaResposta8() {
        return paResposta8;
    }

    public void setPaResposta8(Integer paResposta8) {
        this.paResposta8 = paResposta8;
    }

    public Integer getPaResposta9() {
        return paResposta9;
    }

    public void setPaResposta9(Integer paResposta9) {
        this.paResposta9 = paResposta9;
    }

    public Integer getPaResposta10() {
        return paResposta10;
    }

    public void setPaResposta10(Integer paResposta10) {
        this.paResposta10 = paResposta10;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor idProfessor) {
        this.Professor = idProfessor;
    }

    public Questionario getQuestionario() {
        return Questionario;
    }

    public void setQuestionario(Questionario idQuestionario) {
        this.Questionario = idQuestionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfaval != null ? idProfaval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfAval)) {
            return false;
        }
        ProfAval other = (ProfAval) object;
        if ((this.idProfaval == null && other.idProfaval != null) || (this.idProfaval != null && !this.idProfaval.equals(other.idProfaval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ProfAval[ idProfaval=" + idProfaval + " ]";
    }
    
}
