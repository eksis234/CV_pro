/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Martin
 */
@Entity
@Table(name = "EDUCATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Education.findAll", query = "SELECT e FROM Education e")
    , @NamedQuery(name = "Education.findByIdeducation", query = "SELECT e FROM Education e WHERE e.ideducation = :ideducation")
    , @NamedQuery(name = "Education.findByInstansi", query = "SELECT e FROM Education e WHERE e.instansi = :instansi")
    , @NamedQuery(name = "Education.findByLeveleducation", query = "SELECT e FROM Education e WHERE e.leveleducation = :leveleducation")})
public class Education implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDEDUCATION")
    private BigDecimal ideducation;
    @Column(name = "INSTANSI")
    private String instansi;
    @Column(name = "LEVELEDUCATION")
    private String leveleducation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideducation", fetch = FetchType.LAZY)
    private List<Educationdetails> educationdetailsList;

    public Education() {
    }

    public Education(BigDecimal ideducation) {
        this.ideducation = ideducation;
    }

    public Education(BigDecimal ideducation, String instansi, String leveleducation) {
        this.ideducation = ideducation;
        this.instansi = instansi;
        this.leveleducation = leveleducation;
    }

    public BigDecimal getIdeducation() {
        return ideducation;
    }

    public void setIdeducation(BigDecimal ideducation) {
        this.ideducation = ideducation;
    }

    public String getInstansi() {
        return instansi;
    }

    public void setInstansi(String instansi) {
        this.instansi = instansi;
    }

    public String getLeveleducation() {
        return leveleducation;
    }

    public void setLeveleducation(String leveleducation) {
        this.leveleducation = leveleducation;
    }

    @XmlTransient
    public List<Educationdetails> getEducationdetailsList() {
        return educationdetailsList;
    }

    public void setEducationdetailsList(List<Educationdetails> educationdetailsList) {
        this.educationdetailsList = educationdetailsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideducation != null ? ideducation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Education)) {
            return false;
        }
        Education other = (Education) object;
        if ((this.ideducation == null && other.ideducation != null) || (this.ideducation != null && !this.ideducation.equals(other.ideducation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Education[ ideducation=" + ideducation + " ]";
    }
    
}
