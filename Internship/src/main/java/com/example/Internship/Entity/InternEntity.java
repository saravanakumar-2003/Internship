package com.example.Internship.Entity;

import jakarta.persistence.*;

@Entity
public class InternEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int internId;

    @ManyToOne
    @JoinColumn(name = "companyId" , referencedColumnName = "companyId")
    private CompanyEntity companyEntity;

    @Column
    private String internRole;

    public int getInternId() {
        return internId;
    }

    public void setInternId(int internId) {
        this.internId = internId;
    }

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }

    public String getInternRole() {
        return internRole;
    }

    public void setInternRole(String internRole) {
        this.internRole = internRole;
    }

    public InternEntity() {
    }

    public InternEntity(int internId, CompanyEntity companyEntity, String internRole) {
        this.internId = internId;
        this.companyEntity = companyEntity;
        this.internRole = internRole;
    }
}
