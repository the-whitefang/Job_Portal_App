package com.example.job_portal_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.job_portal_app.databinding.ActivityShowLoginDetailsBinding

class ShowLoginDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowLoginDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_show_login_details)

        binding.txtUserMail.text = intent.extras?.getString("email")?:"No mail id found"
        binding.txtPass.text = intent.extras?.getString("password")?:"No password found"
    }
}