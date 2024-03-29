package com.example.spring_training.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "PAYMENT_INFO")

public class PaymentInfo {

    @Id
    @GeneratedValue(generator = "uuid2")
  // @GenericGenerator( name = "", strategy = "org.hibernate.id.UUIDGenerator")

    private String paymentId;
    private String accountNo;
    private double amount;
    private String cardType;
    private Long customerId;

}
