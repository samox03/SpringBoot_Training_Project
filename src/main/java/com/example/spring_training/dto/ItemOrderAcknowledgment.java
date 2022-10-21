package com.example.spring_training.dto;

import com.example.spring_training.entity.CustomerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ItemOrderAcknowledgment {

    private String status;
    private double totalAmount;
    private String invoiceNo;
    private CustomerInfo customerInfo; //=response

}
