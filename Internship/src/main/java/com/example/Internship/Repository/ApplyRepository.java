package com.example.Internship.Repository;

import com.example.Internship.Entity.ApplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyRepository extends JpaRepository<ApplyEntity , Integer> {
    ApplyEntity findByApplyId(int applyId);

    @Modifying
    @Query("UPDATE ApplyEntity ae SET ae.status = 'Offer sent' WHERE  ae.applyId = :applyId")
    void applicationUpdate(@Param("applyId") int applyId);
}
