package com.example.Internship.Repository;

import com.example.Internship.Entity.CompanyEntity;
import com.example.Internship.Entity.HREntity;
import com.example.Internship.Entity.InternEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrRepository extends JpaRepository<HREntity, Integer> {

    HREntity findByCompanyEntity(CompanyEntity companyEntity);
}
