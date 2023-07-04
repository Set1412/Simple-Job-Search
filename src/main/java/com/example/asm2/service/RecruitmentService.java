package com.example.asm2.service;

import com.example.asm2.model.Recruitment;
import com.example.asm2.repository.RecruitmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitmentService {

    @Autowired
    private RecruitmentRepository repo;

    public List<Recruitment> getAll() {
        return repo.findAll();
    }

    public List<Recruitment> searchBy(String keyword) {
        return repo.search(keyword);
    }
}
