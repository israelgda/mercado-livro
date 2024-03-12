package com.israelgda.mercadolivro.repository

import com.israelgda.mercadolivro.model.CustomerModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: CrudRepository<CustomerModel, Int>{

    fun findByNameContaining(name: String): List<CustomerModel>
}