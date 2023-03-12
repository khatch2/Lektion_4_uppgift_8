package com.example.lektion_4_uppgift_8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.example.lektion_4_uppgift_8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Initialize ViewBinding
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ID's
        val etStudentName: EditText = binding.etStudentName
        val etStudentAge: EditText = binding.etStudentAge
        val cbStudentRememberMe: CheckBox = binding.cbStudentRememberMe
        val btnStudentSubmit: Button = binding.btnSubmitStudent
        val studentList = ArrayList<Student>()



        // Submit Student
        btnStudentSubmit.setOnClickListener() {

            if ( etStudentName.text.isBlank() || etStudentAge.text.isBlank() ) {
                println("FILL IN THE FORM")
                return@setOnClickListener
            }

            val student = Student(
                etStudentName.text.toString(),
                etStudentAge.text.toString().toInt(),
                cbStudentRememberMe.isChecked
            )

            println(student)
            studentList.add(student)


            val intent = Intent(this@MainActivity, LoadStudentActivity().javaClass).apply {
            // Navigate
                putExtra("key_studentList", studentList as? java.io.Serializable)
            }

            startActivity(intent)
            /*
            println("""
                | ${etStudentName.text}
                | ---------------------
                | ${etStudentAge.text}
                | ---------------------
                | ${cbStudentRememberMe.isChecked}
            """.trimMargin())
             */
        }

    }
}