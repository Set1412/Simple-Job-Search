package com.example.asm2.repository;

import com.example.asm2.model.Recruitment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruitmentRepository extends JpaRepository<Recruitment, Long> {

    @Query("SELECT r FROM Recruitment r WHERE r.type LIKE %?1%" + "OR r.title LIKE %?1%" + "OR r.description LIKE %?1%")
    public List<Recruitment> search(String keyword);
}
