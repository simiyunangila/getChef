package com.example.getmychef

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.getmychef.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        binding.btnGetStarted.setOnClickListener {
            val a = Intent(this,page2::class.java)
            startActivity(a)
        }
    }
}
//btnGetStarted = findViewById(R.id.btnGetStarted)
//        btnGetStarted.setOnClickListener {
//            intent = Intent( this,page2::class.java)
//            startActivity(intent)
//        }