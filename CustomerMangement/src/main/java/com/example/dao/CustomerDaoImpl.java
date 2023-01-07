package com.example.dao;

import com.example.model.Customer;
import com.example.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    public Customer saveData(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public List<Customer> getAllData(){
        return customerRepoImpl.findAll();
    }

    public Optional<Customer> getDataById(int custId){
        return customerRepoImpl.findById(custId);
    }

    public Customer updateData(Customer customer){
        return customerRepoImpl.save(customer);
    }

    public List<Customer> getDatabyDOB(Date custDOB) {
        List<Customer> ll=customerRepoImpl.findAll();
        for(Customer cc:ll) {
            if (cc.getCustDOB().equals(custDOB)) {
               ll=customerRepoImpl.findDataByCustDOB(custDOB);
            }
        }
       return ll;
    }

    public void deleteDataById(int custId){
        customerRepoImpl.deleteById(custId);
    }

    public void deleteAllData(){
        customerRepoImpl.deleteAll();
    }


}
