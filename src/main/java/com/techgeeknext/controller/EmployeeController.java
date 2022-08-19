package com.techgeeknext.controller;

import com.techgeeknext.model.Shipping;
import com.techgeeknext.model.Seller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/hello")
    public String hello() {
           return "hello";
    }


    @GetMapping("/sellers")
    public ResponseEntity<List<Seller>> getSellers() {
            Seller emp1 = Seller.builder().name("aaa").role("seller-contacts").id(1).build();
            Seller emp2 = Seller.builder().name("bbb").role("seller-admin").id(2).build();
            List<Seller> emps = new ArrayList<>();
            emps.add(emp1);
            emps.add(emp2);
            return new ResponseEntity<>(emps, HttpStatus.OK);
    }

    @GetMapping("/delivery")
    public ResponseEntity<List<Shipping>> getShippingMenu() {
        Shipping dept1 = Shipping.builder().name("pay shipping").id(1).build();
        Shipping dept2 = Shipping.builder().name("do shipping").id(2).build();
        List<Shipping> shippings = new ArrayList<>();
        shippings.add(dept1);
        shippings.add(dept2);
            return new ResponseEntity<>(shippings,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/access-denied-response")
    public String accessDenied() {
        return "Access Denied... You don't have permission baby.";
    }
}
