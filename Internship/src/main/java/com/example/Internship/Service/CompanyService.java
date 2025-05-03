package com.example.Internship.Service;

import com.example.Internship.DTO.ApplyDTO;
import com.example.Internship.DTO.HrDTO;
import com.example.Internship.DTO.InternDTO;
import com.example.Internship.Entity.*;
import com.example.Internship.Repository.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    HrRepository hrRepository;

    @Autowired
    InternRepository internRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ApplyRepository applyRepository;

    @Autowired
    OfferRepository offerRepository;

    public void addCompany(String company) {

        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setCompanyName(company);
        companyRepository.save(companyEntity);
    }

    public void addHr(HrDTO hrDTO) {

        HREntity hrEntity = new HREntity();
        hrEntity.setCompanyEntity(companyRepository.findByCompanyName(hrDTO.getCompanyName()));
        hrEntity.setHrName(hrDTO.getHrName());
        hrRepository.save(hrEntity);
    }

    public void addInternRole(InternDTO internDTO) {
        InternEntity internEntity = new InternEntity();
        internEntity.setCompanyEntity(companyRepository.findByCompanyName(internDTO.getCompanyName()));
        internEntity.setInternRole(internDTO.getInternRole());
        internRepository.save(internEntity);
    }

    public void applyIntern(ApplyDTO applyDTO) {
        ApplyEntity applyEntity = new ApplyEntity();
        applyEntity.setStudentEntity(studentRepository.findByStudName(applyDTO.getStudName()));
        applyEntity.setCompanyEntity(companyRepository.findByCompanyName(applyDTO.getCompanyName()));
        applyEntity.setInternEntity(internRepository.findByInternRole(applyDTO.getInternRole()));
        applyEntity.setStatus("Applied");
        applyRepository.save(applyEntity);

    }

    public void sendOffer(ApplyEntity applyEntity) {

        OfferEntity offerEntity = new OfferEntity();
        offerEntity.setStudentEntity(offerEntity.getStudentEntity());
        offerEntity.setCompanyEntity(offerEntity.getCompanyEntity());
        offerEntity.setHrEntity(hrRepository.findByCompanyEntity(applyEntity.getCompanyEntity()));
        offerEntity.setInternEntity(applyEntity.getInternEntity());
        offerEntity.setDate( new Date());
        offerRepository.save(offerEntity);

    }

    @Transactional
    public void applicationUpdate(ApplyEntity applyEntity) {


        applyRepository.applicationUpdate(applyEntity.getApplyId());
    }
}
