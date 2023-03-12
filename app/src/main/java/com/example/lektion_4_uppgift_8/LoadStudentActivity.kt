package com.example.lektion_4_uppgift_8

import android.app.Activity
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lektion_4_uppgift_8.databinding.ActivityLoadStudentBinding

class LoadStudentActivity : AppCompatActivity() {

    // Initialize ViewBinding
    private lateinit var binding : ActivityLoadStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set ViewBinding
        binding = ActivityLoadStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)




        println()

        if (android.os.Build.VERSION.SDK_INT < 33) {
            println("Less than 33")
             intent.getSerializableExtra("key_studentList") as ArrayList<*>
        } else {
            println("Modern stuff!")
             val mySerializableObject = intent.getSerializableExtra("key_studentList", ArrayList::class.java)

            println(mySerializableObject)
        }

    }
}