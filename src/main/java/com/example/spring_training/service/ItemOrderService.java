package com.example.spring_training.service;


import com.example.spring_training.dto.ItemOrderAcknowledgment;
import com.example.spring_training.dto.ItemOrderRequest;
import com.example.spring_training.entity.CustomerInfo;
import com.example.spring_training.entity.PaymentInfo;
import com.example.spring_training.repository.CustomerInfoRepository;
import com.example.spring_training.repository.PaymentInfoRepository;
import com.example.spring_training.utils.PaymentUtils;

import java.util.UUID;

@Service

public class ItemOrderService {
    @Autowired
    private CustomerInfoRepository customerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    public ItemOrderAcknowledgment orderItem(ItemOrderRequest request){
        //first: safe customerInfo to db
        CustomerInfo customerInfo= request.getCustomerInfo();
        customerInfo=customerInfoRepository.save(customerInfo); // ID gets autogenerated and can later get stored in the payment table

        //TODO //there is no database connection yet......!
        PaymentInfo paymentInfo = request.getPaymentInfo();

        //second: check customer account balance
        // need to call method to check account funding
        //will throw exception if the bill amount is higher than the account funding
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),customerInfo.getFare());
        //in case not enough funding exception is thrown

        //if everything is succeeded: PaymentInfo is safed
        paymentInfo.setCustomerId(customerInfo.getCID());
        paymentInfo.setAmount(customerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        //set status
        return new ItemOrderAcknowledgment("SUCCESS",customerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], customerInfo);
    }
}
