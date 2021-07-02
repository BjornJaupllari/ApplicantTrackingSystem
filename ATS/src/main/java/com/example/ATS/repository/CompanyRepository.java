package com.example.ATS.repository;

<<<<<<< HEAD
public interface CompanyRepository {
=======
import com.example.ATS.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository <Company, Integer>{
>>>>>>> origin/main
}
