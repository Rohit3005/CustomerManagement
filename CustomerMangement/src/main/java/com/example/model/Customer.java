package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue
    private int custId;

    private String custName;

    private String custAddress;

    private long custContactNumber;

    private double custAccBalance;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    private Date custDOB;


}
