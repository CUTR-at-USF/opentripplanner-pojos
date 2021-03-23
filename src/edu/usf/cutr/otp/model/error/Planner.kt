package edu.usf.cutr.otp.model.error

import edu.usf.cutr.otp.model.ElevationMetadata

import edu.usf.cutr.otp.model.DebugOutput

import edu.usf.cutr.otp.model.Plan

import edu.usf.cutr.otp.model.RequestParameters

import java.util.HashMap


data class Planner
(
    val requestParameters: RequestParameters? = null,
    val plan: Plan? = null,
    val error: Error? = null,
    val debugOutput: DebugOutput? = null,
    val elevationMetadata: ElevationMetadata? = null,
    val additionalProperties: MutableMap<String, Any> = HashMap()
)