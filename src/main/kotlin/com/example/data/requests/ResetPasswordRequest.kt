package com.example.data.requests

import kotlinx.serialization.Serializable

@Serializable
data class ResetPasswordRequest(
    val oldPassword: String,
    val newPassword: String
)
