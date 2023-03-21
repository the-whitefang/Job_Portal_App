package com.example.job_portal_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.job_portal_app.databinding.ActivityRegistrationBinding

class ActivityRegistration : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_registration)

        binding.btnRegister.setOnClickListener {
            val username = binding.edtUser.text.toString()
            val mail = binding.edtMail.text.toString()
            val age = binding.edtAge.text.toString()
            val experience = binding.edtExperience.text.toString()
            val password = binding.edtPassword.text.toString()
            val confirm_password = binding.edtConfirmPassword.text.toString()

            val intent = Intent(this,ShowRegistrationDetailsActivity::class.java)

        }

        binding.txtNextSignIn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}