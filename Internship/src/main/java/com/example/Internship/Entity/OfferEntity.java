package com.example.Internship.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class OfferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int offerId;

    @ManyToOne
    @JoinColumn(name = "studId" , referencedColumnName = "studId")
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name = "companyId" , referencedColumnName = "companyId")
    private CompanyEntity companyEntity;

    @ManyToOne
    @JoinColumn(name = "hrId" , referencedColumnName = "hrId")
    private HREntity hrEntity;

    @ManyToOne
    @JoinColumn(name = "internId" , referencedColumnName = "internId")
    private InternEntity internEntity;

    @Column
    @Temporal(TemporalType.DATE)
    private Date date;

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }

    public HREntity getHrEntity() {
        return hrEntity;
    }

    public void setHrEntity(HREntity hrEntity) {
        this.hrEntity = hrEntity;
    }

    public InternEntity getInternEntity() {
        return internEntity;
    }

    public void setInternEntity(InternEntity internEntity) {
        this.internEntity = internEntity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OfferEntity() {
    }

    public OfferEntity(int offerId, StudentEntity studentEntity, CompanyEntity companyEntity, HREntity hrEntity, InternEntity internEntity, Date date) {
        this.offerId = offerId;
        this.studentEntity = studentEntity;
        this.companyEntity = companyEntity;
        this.hrEntity = hrEntity;
        this.internEntity = internEntity;
        this.date = date;
    }
}
