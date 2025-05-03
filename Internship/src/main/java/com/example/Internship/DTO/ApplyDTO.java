package com.example.Internship.DTO;

public class ApplyDTO {

    private String studName;
    private String companyName;
    private String internRole;

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

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



    public ApplyDTO() {
    }

    public ApplyDTO(String studName, String companyName, String internRole) {
        this.studName = studName;
        this.companyName = companyName;
        this.internRole = internRole;

    }
}
