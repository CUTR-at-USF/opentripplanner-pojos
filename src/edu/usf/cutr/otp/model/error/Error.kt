package edu.usf.cutr.otp.model.error

import java.util.HashMap


data class Error
(
    val id: Int? = null,
    val message: String? = null,
    val additionalProperties: MutableMap<String, Any> = HashMap()
)