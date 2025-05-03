package com.example.Internship.Repository;

import com.example.Internship.Entity.InternEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends JpaRepository<InternEntity, Integer> {
    InternEntity findByInternRole(String internRole);
}
