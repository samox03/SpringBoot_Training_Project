package com.example.spring_training.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CustomerInfo")

public class CustomerInfo {
    @Id
    @GeneratedValue
    private String cID;
    private String name;
    private String email;
    private List items;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date dateOfOrder;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh-mm") // works like this?
    private Time timeOfOrder;
    private double fare;
}
