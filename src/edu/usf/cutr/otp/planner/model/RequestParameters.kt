package edu.usf.cutr.otp.planner.model

import java.util.*


data class RequestParameters
(
    val fromPlace: String? = null,
    val toPlace: String? = null,
    val additionalProperties: MutableMap<String, Any> = HashMap()
)