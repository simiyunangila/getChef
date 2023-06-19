package com.example.getmychef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.getmychef.databinding.ActivityPage2Binding

class page2 : AppCompatActivity() {
    lateinit var binding: ActivityPage2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.textView10.setOnClickListener {
            val y = Intent(this,signuppage::class.java)
            startActivity(y)
        }
        binding.textView11.setOnClickListener {
            val x = Intent(this,signuppage::class.java)
            startActivity(x)
        }
        binding.textView12.setOnClickListener {
            val z = Intent(this,signuppage::class.java)
            startActivity(z)
        }
        binding.textView13.setOnClickListener {
            val t = Intent(this,signuppage::class.java)
            startActivity(t)
        }
    }

}
