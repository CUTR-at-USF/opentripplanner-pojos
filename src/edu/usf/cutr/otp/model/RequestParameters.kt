package edu.usf.cutr.otp.model

import java.util.HashMap


data class RequestParameters
(
    val fromPlace: String? = null,
    val toPlace: String? = null,
    val additionalProperties: MutableMap<String, Any> = HashMap()
)