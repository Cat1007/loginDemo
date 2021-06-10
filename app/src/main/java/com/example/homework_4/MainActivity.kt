package com.example.homework_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import com.example.homework_4.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        val user = User()
        binding.user = user
        binding.loading = false
        login.setOnClickListener {
            binding.loading = true
            Thread {
                Thread.sleep(3000)
                user.setName(name.editText?.text.toString())
                user.setPassword(password.editText?.text.toString())
                binding.loading = false
            }.start()
        }
    }
}