package com.example.models

import com.example.utils.EmailUtils
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class Customer(
    val id: String = UUID.randomUUID().toString(),
    val firstName: String,
    val lastName: String?,
    val email: String = EmailUtils().randomEmail(),
)

val customerStorage = mutableListOf<Customer>()
