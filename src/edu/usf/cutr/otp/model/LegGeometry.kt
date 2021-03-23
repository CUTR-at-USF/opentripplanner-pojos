package edu.usf.cutr.otp.model

import java.util.HashMap


data class LegGeometry
(
    val points: String? = null,
    val length: Int? = null,
    val additionalProperties: MutableMap<String, Any> = HashMap()
)