package com.example.Internship.Controller;

import com.example.Internship.DTO.ApplyDTO;
import com.example.Internship.DTO.HrDTO;
import com.example.Internship.DTO.InternDTO;
import com.example.Internship.Entity.ApplyEntity;
import com.example.Internship.Repository.ApplyRepository;
import com.example.Internship.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    ApplyRepository applyRepository;

//    @Autowired
//    CompanyController companyController;

    @PostMapping("/addCompany")
    public void addCompany(@RequestParam String company){
        companyService.addCompany(company);
    }

    @PostMapping("/addHr")
    public void addHr(@RequestBody HrDTO hrDTO){
        companyService.addHr(hrDTO);
    }

    @PostMapping("/addInternRole")
    public void addInternRole(@RequestBody InternDTO internDTO){
        companyService.addInternRole(internDTO);
    }

    @PostMapping("/applyIntern")
    public void applyIntern(@RequestBody ApplyDTO applyDTO){
        companyService.applyIntern(applyDTO);
    }

    @PostMapping("/sendOffer")
    public void sendOffer(@RequestParam int applyId){
        ApplyEntity applyEntity = applyRepository.findByApplyId(applyId);
        companyService.sendOffer(applyEntity);
        companyService.applicationUpdate(applyEntity);
    }

//    @PutMapping
//    public void applicationUpdate(ApplyEntity applyEntity){
//        companyService.applicationUpdate(applyEntity);
//    }
}
