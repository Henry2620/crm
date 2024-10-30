package com.example.crm.controller

import com.example.crm.entity.Customer
import com.example.crm.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/customer")
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun getCustomers(): List<Customer> {
        return customerService.findAll()
    }

}