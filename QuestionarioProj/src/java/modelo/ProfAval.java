/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
    @NamedQuery(name = "ProfAval.findAll", query = "SELECT p FROM ProfAval p")})
public class ProfAval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_profaval")
    private Long idProfaval;
    @Basic(optional = false)
    @Column(name = "pa_periodo")
    private String paPeriodo;
    @Basic(optional = false)
    @Column(name = "pa_resposta1")
    private BigInteger paResposta1;
    @Basic(optional = false)
    @Column(name = "pa_resposta2")
    private BigInteger paResposta2;
    @Basic(optional = false)
    @Column(name = "pa_resposta3")
    private BigInteger paResposta3;
    @Basic(optional = false)
    @Column(name = "pa_resposta4")
    private BigInteger paResposta4;
    @Basic(optional = false)
    @Column(name = "pa_resposta5")
    private BigInteger paResposta5;
    @Basic(optional = false)
    @Column(name = "pa_resposta6")
    private BigInteger paResposta6;
    @Basic(optional = false)
    @Column(name = "pa_resposta7")
    private BigInteger paResposta7;
    @Basic(optional = false)
    @Column(name = "pa_resposta8")
    private BigInteger paResposta8;
    @Basic(optional = false)
    @Column(name = "pa_resposta9")
    private BigInteger paResposta9;
    @Basic(optional = false)
    @Column(name = "pa_resposta10")
    private BigInteger paResposta10;
    @JoinColumn(name = "id_professor", referencedColumnName = "id_professor")
    @ManyToOne(optional = false)
    private Professor idProfessor;
    @JoinColumn(name = "id_questionario", referencedColumnName = "id_questionario")
    @ManyToOne(optional = false)
    private Questionario idQuestionario;

    public ProfAval() {
    }

    public ProfAval(Long idProfaval) {
        this.idProfaval = idProfaval;
    }

    public ProfAval(Long idProfaval, String paPeriodo, BigInteger paResposta1, BigInteger paResposta2, BigInteger paResposta3, BigInteger paResposta4, BigInteger paResposta5, BigInteger paResposta6, BigInteger paResposta7, BigInteger paResposta8, BigInteger paResposta9, BigInteger paResposta10) {
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

    public Long getIdProfaval() {
        return idProfaval;
    }

    public void setIdProfaval(Long idProfaval) {
        this.idProfaval = idProfaval;
    }

    public String getPaPeriodo() {
        return paPeriodo;
    }

    public void setPaPeriodo(String paPeriodo) {
        this.paPeriodo = paPeriodo;
    }

    public BigInteger getPaResposta1() {
        return paResposta1;
    }

    public void setPaResposta1(BigInteger paResposta1) {
        this.paResposta1 = paResposta1;
    }

    public BigInteger getPaResposta2() {
        return paResposta2;
    }

    public void setPaResposta2(BigInteger paResposta2) {
        this.paResposta2 = paResposta2;
    }

    public BigInteger getPaResposta3() {
        return paResposta3;
    }

    public void setPaResposta3(BigInteger paResposta3) {
        this.paResposta3 = paResposta3;
    }

    public BigInteger getPaResposta4() {
        return paResposta4;
    }

    public void setPaResposta4(BigInteger paResposta4) {
        this.paResposta4 = paResposta4;
    }

    public BigInteger getPaResposta5() {
        return paResposta5;
    }

    public void setPaResposta5(BigInteger paResposta5) {
        this.paResposta5 = paResposta5;
    }

    public BigInteger getPaResposta6() {
        return paResposta6;
    }

    public void setPaResposta6(BigInteger paResposta6) {
        this.paResposta6 = paResposta6;
    }

    public BigInteger getPaResposta7() {
        return paResposta7;
    }

    public void setPaResposta7(BigInteger paResposta7) {
        this.paResposta7 = paResposta7;
    }

    public BigInteger getPaResposta8() {
        return paResposta8;
    }

    public void setPaResposta8(BigInteger paResposta8) {
        this.paResposta8 = paResposta8;
    }

    public BigInteger getPaResposta9() {
        return paResposta9;
    }

    public void setPaResposta9(BigInteger paResposta9) {
        this.paResposta9 = paResposta9;
    }

    public BigInteger getPaResposta10() {
        return paResposta10;
    }

    public void setPaResposta10(BigInteger paResposta10) {
        this.paResposta10 = paResposta10;
    }

    public Professor getProfessor() {
        return idProfessor;
    }

    public void setProfessor(Professor professor) {
        this.idProfessor = professor;
    }

    public Questionario getQuestionario() {
        return idQuestionario;
    }

    public void setIdQuestionario(Questionario questionario) {
        this.idQuestionario = questionario;
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
