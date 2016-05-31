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
@Table(name = "moni_aval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MoniAval.findAll", query = "SELECT m FROM MoniAval m"),
    @NamedQuery(name = "MoniAval.findByIdMoniaval", query = "SELECT m FROM MoniAval m WHERE m.idMoniaval = :idMoniaval"),
    @NamedQuery(name = "MoniAval.findByMaPeriodo", query = "SELECT m FROM MoniAval m WHERE m.maPeriodo = :maPeriodo"),
    @NamedQuery(name = "MoniAval.findByMaResposta1", query = "SELECT m FROM MoniAval m WHERE m.maResposta1 = :maResposta1"),
    @NamedQuery(name = "MoniAval.findByMaResposta2", query = "SELECT m FROM MoniAval m WHERE m.maResposta2 = :maResposta2"),
    @NamedQuery(name = "MoniAval.findByMaResposta3", query = "SELECT m FROM MoniAval m WHERE m.maResposta3 = :maResposta3"),
    @NamedQuery(name = "MoniAval.findByMaResposta4", query = "SELECT m FROM MoniAval m WHERE m.maResposta4 = :maResposta4"),
    @NamedQuery(name = "MoniAval.findByMaResposta5", query = "SELECT m FROM MoniAval m WHERE m.maResposta5 = :maResposta5"),
    @NamedQuery(name = "MoniAval.findByMaResposta6", query = "SELECT m FROM MoniAval m WHERE m.maResposta6 = :maResposta6"),
    @NamedQuery(name = "MoniAval.findByMaResposta7", query = "SELECT m FROM MoniAval m WHERE m.maResposta7 = :maResposta7"),
    @NamedQuery(name = "MoniAval.findByMaResposta8", query = "SELECT m FROM MoniAval m WHERE m.maResposta8 = :maResposta8"),
    @NamedQuery(name = "MoniAval.findByMaResposta9", query = "SELECT m FROM MoniAval m WHERE m.maResposta9 = :maResposta9"),
    @NamedQuery(name = "MoniAval.findByMaResposta10", query = "SELECT m FROM MoniAval m WHERE m.maResposta10 = :maResposta10")})
public class MoniAval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_moniaval")
    private Long idMoniaval;
    @Basic(optional = false)
    @Column(name = "ma_periodo")
    private String maPeriodo;
    @Basic(optional = false)
    @Column(name = "ma_resposta1")
    private BigInteger maResposta1;
    @Basic(optional = false)
    @Column(name = "ma_resposta2")
    private BigInteger maResposta2;
    @Basic(optional = false)
    @Column(name = "ma_resposta3")
    private BigInteger maResposta3;
    @Basic(optional = false)
    @Column(name = "ma_resposta4")
    private BigInteger maResposta4;
    @Basic(optional = false)
    @Column(name = "ma_resposta5")
    private BigInteger maResposta5;
    @Basic(optional = false)
    @Column(name = "ma_resposta6")
    private BigInteger maResposta6;
    @Basic(optional = false)
    @Column(name = "ma_resposta7")
    private BigInteger maResposta7;
    @Basic(optional = false)
    @Column(name = "ma_resposta8")
    private BigInteger maResposta8;
    @Basic(optional = false)
    @Column(name = "ma_resposta9")
    private BigInteger maResposta9;
    @Basic(optional = false)
    @Column(name = "ma_resposta10")
    private BigInteger maResposta10;
    @JoinColumn(name = "id_monitor", referencedColumnName = "id_monitor")
    @ManyToOne(optional = false)
    private Monitor idMonitor;
    @JoinColumn(name = "id_questionario", referencedColumnName = "id_questionario")
    @ManyToOne(optional = false)
    private Questionario idQuestionario;

    public MoniAval() {
    }

    public MoniAval(Long idMoniaval) {
        this.idMoniaval = idMoniaval;
    }

    public MoniAval(Long idMoniaval, String maPeriodo, BigInteger maResposta1, BigInteger maResposta2, BigInteger maResposta3, BigInteger maResposta4, BigInteger maResposta5, BigInteger maResposta6, BigInteger maResposta7, BigInteger maResposta8, BigInteger maResposta9, BigInteger maResposta10) {
        this.idMoniaval = idMoniaval;
        this.maPeriodo = maPeriodo;
        this.maResposta1 = maResposta1;
        this.maResposta2 = maResposta2;
        this.maResposta3 = maResposta3;
        this.maResposta4 = maResposta4;
        this.maResposta5 = maResposta5;
        this.maResposta6 = maResposta6;
        this.maResposta7 = maResposta7;
        this.maResposta8 = maResposta8;
        this.maResposta9 = maResposta9;
        this.maResposta10 = maResposta10;
    }

    public Long getIdMoniaval() {
        return idMoniaval;
    }

    public void setIdMoniaval(Long idMoniaval) {
        this.idMoniaval = idMoniaval;
    }

    public String getMaPeriodo() {
        return maPeriodo;
    }

    public void setMaPeriodo(String maPeriodo) {
        this.maPeriodo = maPeriodo;
    }

    public BigInteger getMaResposta1() {
        return maResposta1;
    }

    public void setMaResposta1(BigInteger maResposta1) {
        this.maResposta1 = maResposta1;
    }

    public BigInteger getMaResposta2() {
        return maResposta2;
    }

    public void setMaResposta2(BigInteger maResposta2) {
        this.maResposta2 = maResposta2;
    }

    public BigInteger getMaResposta3() {
        return maResposta3;
    }

    public void setMaResposta3(BigInteger maResposta3) {
        this.maResposta3 = maResposta3;
    }

    public BigInteger getMaResposta4() {
        return maResposta4;
    }

    public void setMaResposta4(BigInteger maResposta4) {
        this.maResposta4 = maResposta4;
    }

    public BigInteger getMaResposta5() {
        return maResposta5;
    }

    public void setMaResposta5(BigInteger maResposta5) {
        this.maResposta5 = maResposta5;
    }

    public BigInteger getMaResposta6() {
        return maResposta6;
    }

    public void setMaResposta6(BigInteger maResposta6) {
        this.maResposta6 = maResposta6;
    }

    public BigInteger getMaResposta7() {
        return maResposta7;
    }

    public void setMaResposta7(BigInteger maResposta7) {
        this.maResposta7 = maResposta7;
    }

    public BigInteger getMaResposta8() {
        return maResposta8;
    }

    public void setMaResposta8(BigInteger maResposta8) {
        this.maResposta8 = maResposta8;
    }

    public BigInteger getMaResposta9() {
        return maResposta9;
    }

    public void setMaResposta9(BigInteger maResposta9) {
        this.maResposta9 = maResposta9;
    }

    public BigInteger getMaResposta10() {
        return maResposta10;
    }

    public void setMaResposta10(BigInteger maResposta10) {
        this.maResposta10 = maResposta10;
    }

    public Monitor getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(Monitor idMonitor) {
        this.idMonitor = idMonitor;
    }

    public Questionario getIdQuestionario() {
        return idQuestionario;
    }

    public void setIdQuestionario(Questionario idQuestionario) {
        this.idQuestionario = idQuestionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMoniaval != null ? idMoniaval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MoniAval)) {
            return false;
        }
        MoniAval other = (MoniAval) object;
        if ((this.idMoniaval == null && other.idMoniaval != null) || (this.idMoniaval != null && !this.idMoniaval.equals(other.idMoniaval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.MoniAval[ idMoniaval=" + idMoniaval + " ]";
    }
    
}
