package com.israelgda.mercadolivro.service

import com.israelgda.mercadolivro.model.CustomerModel
import com.israelgda.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService (
    val customerRepository: CustomerRepository
){

    fun getAllCustomers(name: String?): List<CustomerModel> {
        name?.let{
            return customerRepository.findByNameContaining(name).toList()
        }
        return customerRepository.findAll().toList()
    }

    fun getCustomer(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    fun createCustomer(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun updateCustomer(customer: CustomerModel) {
        if(!customerRepository.existsById(customer.id!!))
            throw Exception()

        try {
            customerRepository.save(customer)
        } catch (ex: Exception){
            throw Exception(ex.message)
        }
    }

    fun deleteCustomer(id: Int) {
        if(!customerRepository.existsById(id))
            throw Exception()

        customerRepository.deleteById(id)
    }
}