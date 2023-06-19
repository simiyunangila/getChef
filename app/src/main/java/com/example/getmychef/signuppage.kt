package com.example.getmychef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.getmychef.databinding.ActivityPage2Binding
import com.example.getmychef.databinding.ActivitySignuppageBinding
import java.lang.Error

class signuppage : AppCompatActivity() {
    lateinit var binding: ActivitySignuppageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signuppage)
        binding = ActivitySignuppageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnlogin.setOnClickListener {
            val y = Intent(this,signuppage::class.java)
            startActivity(y)
            validateSignUpPage()
            clearErrors()
        }
    }
    fun validateSignUpPage(){
        val mail = binding.etemail.text.toString()
        val createPassword = binding.etcreatepassword.text.toString()
        val confPassword = binding.etconpassword.text.toString()

        var error = false


        if (mail.isEmpty()){
            binding.idemail.error = "Email required"
            var error = true
        }
        if (createPassword.isEmpty()){
            binding.idcreatepassword.error ="Create password"
            var error = true
        }
        if (confPassword != createPassword){
            binding.idcreatepassword.error ="Create password"
            var error = true
        }
        if (!error){

            Toast.makeText(this,"signed in successfully", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
    fun clearErrors(){
        binding.idemail.error = null
        binding.idcreatepassword.error = null
        binding.etconpassword.error = null
    }
}

