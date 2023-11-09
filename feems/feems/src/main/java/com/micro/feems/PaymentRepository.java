package com.micro.feems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.feems.model.Payment;


@Repository
public interface PaymentRepository extends JpaRepository <Payment,Integer>{

}
