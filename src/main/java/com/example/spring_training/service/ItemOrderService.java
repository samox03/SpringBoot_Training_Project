package com.example.spring_training.service;


import com.example.spring_training.dto.ItemOrderAcknowledgment;
import com.example.spring_training.dto.ItemOrderRequest;
import com.example.spring_training.entity.PaymentInfo;
import com.example.spring_training.repository.CustomerInfoRepository;
import com.example.spring_training.repository.PaymentInfoRepository;

@Service

public class ItemOrderService {

    private CustomerInfoRepository customerInfoRepository;
    private PaymentInfoRepository paymentInfoRepository;

    public ItemOrderAcknowledgment orderItem(ItemOrderRequest request)
        //to be continued
}
