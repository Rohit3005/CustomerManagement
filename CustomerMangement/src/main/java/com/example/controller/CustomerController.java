package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @PostMapping("/savedata")
    public ResponseEntity<String> saveData(@RequestBody Customer customer){
        customerService.saveData(customer);
        return ResponseEntity.ok("DATA SAVED");
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Customer>> getAllData(){
        return ResponseEntity.ok(customerService.getAllData());
    }

    @GetMapping("/getdatabyid/{custId}")
    public ResponseEntity<Optional<Customer>> getDataById(@PathVariable int custId){
        return ResponseEntity.ok(customerService.getDataById(custId));
    }

    @GetMapping("/getdatabydob/{custDOB}")
    public List<Customer> getDataByDOB(@PathVariable Date custDOB) throws ParseException {

        return customerService.getDatabyDOB(custDOB);
    }
}
