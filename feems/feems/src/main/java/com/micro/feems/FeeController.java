package com.micro.feems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.feems.model.Payment;



@RestController
public class FeeController {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	@PostMapping("payFee")
	public ResponseEntity<String> feePayment(@RequestBody Payment payment){
		
		paymentRepository.save(payment);
		return ResponseEntity.ok("Fee paid successfully");
	}
	
	@GetMapping("fetchAllPaymentDetails")
	public ResponseEntity<List<Payment>> feePayment(){
		return ResponseEntity.ok(paymentRepository.findAll());
	}

}
