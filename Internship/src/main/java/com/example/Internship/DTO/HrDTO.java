package com.example.Internship.DTO;

public class HrDTO {
    private String companyName;
    private String hrName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public HrDTO() {
    }

    public HrDTO(String companyName, String hrName) {
        this.companyName = companyName;
        this.hrName = hrName;
    }
}
