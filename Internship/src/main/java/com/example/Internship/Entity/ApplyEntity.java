package com.example.Internship.Entity;

import jakarta.persistence.*;

@Entity
public class ApplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applyId;

    @ManyToOne
    @JoinColumn(name = "studId" , referencedColumnName = "studId")
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name = "companyId" , referencedColumnName = "companyId")
    private CompanyEntity companyEntity;

    @ManyToOne
    @JoinColumn(name = "internId" , referencedColumnName = "internId")
    private InternEntity internEntity;

    @Column
    private String status;

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
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

    public InternEntity getInternEntity() {
        return internEntity;
    }

    public void setInternEntity(InternEntity internEntity) {
        this.internEntity = internEntity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApplyEntity() {
    }

    public ApplyEntity(int applyId, StudentEntity studentEntity, CompanyEntity companyEntity, InternEntity internEntity, String status) {
        this.applyId = applyId;
        this.studentEntity = studentEntity;
        this.companyEntity = companyEntity;
        this.internEntity = internEntity;
        this.status = status;
    }
}
