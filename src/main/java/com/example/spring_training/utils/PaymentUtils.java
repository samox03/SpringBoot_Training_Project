package com.example.spring_training.utils;

import com.example.spring_training.exception.InsufficientAmountException;

import java.util.HashMap;

public class PaymentUtils {
    private static Map <String, Double> paymentMap= new HashMap<>();

    static {
        //there are four customers, with those account values
        paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2", 1000.0);
        paymentMap.put("acc3", 12000.0);
        paymentMap.put("acc4", 500.0);
        paymentMap.put("acc5", 80000.0);
    }

    public static boolean validateCreditLimit(String accNo,double paidAmount){
        //checking if the account has enough money to pay the order
        if(paidAmount>paymentMap.get(accNo)){
            //if paid amount is higher than account amount:
            throw new InsufficientAmountException("insufficient fund..!");
        }else{
            return true;
        }
    }
}
