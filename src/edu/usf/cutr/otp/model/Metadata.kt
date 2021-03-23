package edu.usf.cutr.otp.model

import java.util.HashMap


data class Metadata
(
    val searchWindowUsed: Int? = null,
    val nextDateTime: Int? = null,
    val prevDateTime: Int? = null,
    val additionalProperties: MutableMap<String, Any> = HashMap()
)