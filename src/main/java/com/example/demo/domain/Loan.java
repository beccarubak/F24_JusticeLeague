package com.example.demo.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loan_id;

    private String loan_origin_amount;
    private String interest_rate;

    private Timestamp created_at;

    @ManyToOne
    @JoinColumn(name = "account_id")
    //@JsonIgnore
    private Account user_account;

}

