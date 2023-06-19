package com.example.getmychef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getmychef.databinding.ActivityChefdisplayBinding

class chefdisplay : AppCompatActivity() {
    lateinit var binding: ActivityChefdisplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chefdisplay)
        binding = ActivityChefdisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayChefs()
//    binding.btnAdd.setOnClickListener {
//        val page = Intent(this,addContact::class.java)
//        startActivity(page)
//    }
    }

    fun displayChefs() {
        val chef1 = chefffs(
            "Hamisa",
            "Dessert Master",
            "Mama Oliech",
            "vanilla cake",
            "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
        )
       val chef2 = chefffs(
         "Hamisa",
         "Dessert Master",
         "Mama Oliech",
         "vanilla cake",
         "https://images.unsplash.com/photo-1563995103864-d87d3c1fdd39?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=436&q=80"
       )
      val chef3 = chefffs(
                    "Hamisa",
                    "Dessert Master",
                    "Mama Oliech",
                    "vanilla cake",
                    "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
                )
                    val chef4 = chefffs(
                        "Hamisa",
                        "Dessert Master",
                        "Mama Oliech",
                        "vanilla cake",
                        "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
                    )
                        val chef5 = chefffs(
                            "Hamisa",
                            "Dessert Master",
                            "Mama Oliech",
                            "vanilla cake",
                            "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
                        )
                            val chef6 = chefffs(
                                "Hamisa",
                                "Dessert Master",
                                "Mama Oliech",
                                "vanilla cake",
                                "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
                            )
                                val chef7 = chefffs(
                                    "Hamisa",
                                    "Dessert Master",
                                    "Mama Oliech",
                                    "vanilla cake",
                                    "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
                                )
                                    val chef8 = chefffs(
                                        "Hamisa",
                                        "Dessert Master",
                                        "Mama Oliech",
                                        "vanilla cake",
                                        "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
                                    )
                                        val chef9 = chefffs(
                                            "Hamisa",
                                            "Dessert Master",
                                            "Mama Oliech",
                                            "vanilla cake",
                                            "https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=386&q=80"
                                        )
                                        val cheflist = listOf(
                                            chef1,
                                            chef2,
                                            chef3,
                                            chef4,
                                            chef5,
                                            chef6,
                                            chef7,
                                            chef8,
                                            chef9
                                        )
                                        val cheadapter = chefadapter(cheflist)
                                        binding.recyclerView.layoutManager =
                                            LinearLayoutManager(this)
                                        binding.recyclerView.adapter = cheadapter
                                    }
                                }

