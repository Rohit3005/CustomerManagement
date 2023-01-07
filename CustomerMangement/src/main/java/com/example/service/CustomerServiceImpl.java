package com.example.service;

import com.example.dao.CustomerDaoImpl;
import com.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerDaoImpl customerDaoImpl;

    public Customer saveData(Customer customer){
        return customerDaoImpl.saveData(customer);
    }

    public List<Customer> getAllData(){
        return customerDaoImpl.getAllData();
    }

    public Optional<Customer> getDataById(int custId){
        return customerDaoImpl.getDataById(custId);
    }

    public Customer updateData(Customer customer){
        return customerDaoImpl.updateData(customer);
    }

    public List<Customer> getDatabyDOB(Date custDOB) throws ParseException {
        return customerDaoImpl.getDatabyDOB(custDOB);
    }

    public void deleteDataById(int custId){
       customerDaoImpl.deleteDataById(custId);
    }

    public void deleteAllData(){
        customerDaoImpl.deleteAllData();
    }

}
