package com.example.Internship.DTO;

public class InternDTO {

    private String companyName;
    private String internRole;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInternRole() {
        return internRole;
    }

    public void setInternRole(String internRole) {
        this.internRole = internRole;
    }

    public InternDTO() {
    }

    public InternDTO(String companyName, String internRole) {
        this.companyName = companyName;
        this.internRole = internRole;
    }
}
