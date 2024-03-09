package com.israelgda.mercadolivro.extension

import com.israelgda.mercadolivro.model.CustomerModel
import com.israelgda.mercadolivro.request.PostCustomerRequest
import com.israelgda.mercadolivro.request.PutCustomerRequest

fun PostCustomerRequest.requestToModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email)
}

fun PutCustomerRequest.requestToModel(id: String): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}