package com.example.asm2.service;

import com.example.asm2.model.Company;
import com.example.asm2.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repo;

    public List<Company> getAllCompany() {
        return repo.findAll();
    }

    public List<Company> searchCompany(String keyword) {
        return repo.search(keyword);
    }

}
