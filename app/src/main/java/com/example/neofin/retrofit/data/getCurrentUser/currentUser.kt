package com.example.neofin.retrofit.data.getCurrentUser

data class currentUser(
    val email: String,
    val groups: List<Group>,
    val id: Int,
    val name: String,
    val phoneNumber: String,
    val role: Role,
    val surname: String,
    val userStatus: String
)