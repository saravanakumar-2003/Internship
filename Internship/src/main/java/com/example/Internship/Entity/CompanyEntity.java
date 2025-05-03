package com.example.Internship.Entity;

import jakarta.persistence.*;

@Entity
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;

    @Column
    private String companyName;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyEntity() {
    }

    public CompanyEntity(int companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }
}
