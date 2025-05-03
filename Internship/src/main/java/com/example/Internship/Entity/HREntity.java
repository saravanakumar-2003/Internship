package com.example.Internship.Entity;

import jakarta.persistence.*;

@Entity
public class HREntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hrId;

    @ManyToOne
    @JoinColumn(name = "companyId" , referencedColumnName = "companyId")
    private CompanyEntity companyEntity;

    @Column
    private String hrName;

    public int getHrId() {
        return hrId;
    }

    public void setHrId(int hrId) {
        this.hrId = hrId;
    }

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public HREntity() {
    }

    public HREntity(int hrId, CompanyEntity companyEntity, String hrName) {
        this.hrId = hrId;
        this.companyEntity = companyEntity;
        this.hrName = hrName;
    }
}
