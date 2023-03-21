package com.example.job_portal_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.job_portal_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnSignIn.setOnClickListener {
            val mailid =binding.edtMailid.toString()
            val pass =binding.edtPass.toString()
            val intent = Intent(this@MainActivity,ShowLoginDetailsActivity::class.java)
            intent.putExtra("email",mailid)
            intent.putExtra("password",pass)
            Toast.makeText(this,"Data Passed Successfully !!",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }


    }
}