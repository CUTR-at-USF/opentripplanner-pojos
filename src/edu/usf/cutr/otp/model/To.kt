package edu.usf.cutr.otp.model

data class To
(
    val name: String? = null,
    val lon: Double? = null,
    val lat: Double? = null,
    val vertexType: String? = null,
    val additionalProperties: Map<String, Any> = HashMap()
)
