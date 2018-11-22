package com.pedronveloso.errors

/**
 * Simple class to convey errors that need to be propagated. Allows for reason in case of failure.
 */
data class GenericResult(val successful: Boolean, val reason: String = "")