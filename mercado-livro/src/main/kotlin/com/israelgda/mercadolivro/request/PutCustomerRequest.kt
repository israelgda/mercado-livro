package com.israelgda.mercadolivro.request

import com.israelgda.mercadolivro.model.CustomerModel

data class PutCustomerRequest(
    var name: String,
    var email: String
)
