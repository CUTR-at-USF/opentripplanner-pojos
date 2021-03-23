package edu.usf.cutr.otp.model

import java.util.HashMap


data class Planner
(
    val requestParameters: RequestParameters? = null,
    val plan: Plan? = null,
    val metadata: Metadata? = null,
    val debugOutput: DebugOutput? = null,
    val elevationMetadata: ElevationMetadata? = null,
    val additionalProperties: MutableMap<String, Any> = HashMap()
)