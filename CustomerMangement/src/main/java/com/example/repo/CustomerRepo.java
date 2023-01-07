package com.example.repo;

import com.example.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

    public List<Customer> findDataByCustDOB(Date custDOB);
}
