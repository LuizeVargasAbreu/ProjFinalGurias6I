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
@Table(name = "questionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questionario.findAll", query = "SELECT q FROM Questionario q"),
    @NamedQuery(name = "Questionario.findByIdQuestionario", query = "SELECT q FROM Questionario q WHERE q.idQuestionario = :idQuestionario"),
    @NamedQuery(name = "Questionario.findByPergunta1", query = "SELECT q FROM Questionario q WHERE q.pergunta1 = :pergunta1"),
    @NamedQuery(name = "Questionario.findByPergunta2", query = "SELECT q FROM Questionario q WHERE q.pergunta2 = :pergunta2"),
    @NamedQuery(name = "Questionario.findByPergunta3", query = "SELECT q FROM Questionario q WHERE q.pergunta3 = :pergunta3"),
    @NamedQuery(name = "Questionario.findByPergunta4", query = "SELECT q FROM Questionario q WHERE q.pergunta4 = :pergunta4"),
    @NamedQuery(name = "Questionario.findByPergunta5", query = "SELECT q FROM Questionario q WHERE q.pergunta5 = :pergunta5"),
    @NamedQuery(name = "Questionario.findByPergunta6", query = "SELECT q FROM Questionario q WHERE q.pergunta6 = :pergunta6"),
    @NamedQuery(name = "Questionario.findByPergunta7", query = "SELECT q FROM Questionario q WHERE q.pergunta7 = :pergunta7"),
    @NamedQuery(name = "Questionario.findByPergunta8", query = "SELECT q FROM Questionario q WHERE q.pergunta8 = :pergunta8"),
    @NamedQuery(name = "Questionario.findByPergunta9", query = "SELECT q FROM Questionario q WHERE q.pergunta9 = :pergunta9"),
    @NamedQuery(name = "Questionario.findByPergunta10", query = "SELECT q FROM Questionario q WHERE q.pergunta10 = :pergunta10"),
    @NamedQuery(name = "Questionario.findByQuestPeriodo", query = "SELECT q FROM Questionario q WHERE q.questPeriodo = :questPeriodo")})
public class Questionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_questionario")
    private Long idQuestionario;
    @Basic(optional = false)
    @Column(name = "pergunta1")
    private String pergunta1;
    @Basic(optional = false)
    @Column(name = "pergunta2")
    private String pergunta2;
    @Basic(optional = false)
    @Column(name = "pergunta3")
    private String pergunta3;
    @Basic(optional = false)
    @Column(name = "pergunta4")
    private String pergunta4;
    @Basic(optional = false)
    @Column(name = "pergunta5")
    private String pergunta5;
    @Basic(optional = false)
    @Column(name = "pergunta6")
    private String pergunta6;
    @Basic(optional = false)
    @Column(name = "pergunta7")
    private String pergunta7;
    @Basic(optional = false)
    @Column(name = "pergunta8")
    private String pergunta8;
    @Basic(optional = false)
    @Column(name = "pergunta9")
    private String pergunta9;
    @Basic(optional = false)
    @Column(name = "pergunta10")
    private String pergunta10;
    @Basic(optional = false)
    @Column(name = "quest_periodo")
    private String questPeriodo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idQuestionario")
    private List<ProfAval> profAvalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idQuestionario")
    private List<MoniAval> moniAvalList;

    public Questionario() {
    }

    public Questionario(Long idQuestionario) {
        this.idQuestionario = idQuestionario;
    }

    public Questionario(Long idQuestionario, String pergunta1, String pergunta2, String pergunta3, String pergunta4, String pergunta5, String pergunta6, String pergunta7, String pergunta8, String pergunta9, String pergunta10, String questPeriodo) {
        this.idQuestionario = idQuestionario;
        this.pergunta1 = pergunta1;
        this.pergunta2 = pergunta2;
        this.pergunta3 = pergunta3;
        this.pergunta4 = pergunta4;
        this.pergunta5 = pergunta5;
        this.pergunta6 = pergunta6;
        this.pergunta7 = pergunta7;
        this.pergunta8 = pergunta8;
        this.pergunta9 = pergunta9;
        this.pergunta10 = pergunta10;
        this.questPeriodo = questPeriodo;
    }

    public Long getIdQuestionario() {
        return idQuestionario;
    }

    public void setIdQuestionario(Long idQuestionario) {
        this.idQuestionario = idQuestionario;
    }

    public String getPergunta1() {
        return pergunta1;
    }

    public void setPergunta1(String pergunta1) {
        this.pergunta1 = pergunta1;
    }

    public String getPergunta2() {
        return pergunta2;
    }

    public void setPergunta2(String pergunta2) {
        this.pergunta2 = pergunta2;
    }

    public String getPergunta3() {
        return pergunta3;
    }

    public void setPergunta3(String pergunta3) {
        this.pergunta3 = pergunta3;
    }

    public String getPergunta4() {
        return pergunta4;
    }

    public void setPergunta4(String pergunta4) {
        this.pergunta4 = pergunta4;
    }

    public String getPergunta5() {
        return pergunta5;
    }

    public void setPergunta5(String pergunta5) {
        this.pergunta5 = pergunta5;
    }

    public String getPergunta6() {
        return pergunta6;
    }

    public void setPergunta6(String pergunta6) {
        this.pergunta6 = pergunta6;
    }

    public String getPergunta7() {
        return pergunta7;
    }

    public void setPergunta7(String pergunta7) {
        this.pergunta7 = pergunta7;
    }

    public String getPergunta8() {
        return pergunta8;
    }

    public void setPergunta8(String pergunta8) {
        this.pergunta8 = pergunta8;
    }

    public String getPergunta9() {
        return pergunta9;
    }

    public void setPergunta9(String pergunta9) {
        this.pergunta9 = pergunta9;
    }

    public String getPergunta10() {
        return pergunta10;
    }

    public void setPergunta10(String pergunta10) {
        this.pergunta10 = pergunta10;
    }

    public String getQuestPeriodo() {
        return questPeriodo;
    }

    public void setQuestPeriodo(String questPeriodo) {
        this.questPeriodo = questPeriodo;
    }

    @XmlTransient
    public List<ProfAval> getProfAvalList() {
        return profAvalList;
    }

    public void setProfAvalList(List<ProfAval> profAvalList) {
        this.profAvalList = profAvalList;
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
        hash += (idQuestionario != null ? idQuestionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questionario)) {
            return false;
        }
        Questionario other = (Questionario) object;
        if ((this.idQuestionario == null && other.idQuestionario != null) || (this.idQuestionario != null && !this.idQuestionario.equals(other.idQuestionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Questionario[ idQuestionario=" + idQuestionario + " ]";
    }
    
}
