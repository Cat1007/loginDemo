package com.example.homework_4

import androidx.databinding.ObservableField

class User {
    val name = ObservableField("")
    val password = ObservableField("")

    fun setName(name: String) {
        this.name.set(name)
    }

    fun setPassword(password: String) {
        this.password.set(password)
    }
}