package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var minutes : TextView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dateButton: Button = findViewById(R.id.buttonPickDate)
        val date: TextView = findViewById(R.id.enteredDate)
        minutes =findViewById(R.id.textView9)

        dateButton.setOnClickListener {
            openCalendar()
        }


    }

     fun openCalendar() {
        minutes?.text = "03.07.2023"
        Toast.makeText(this, "this button work slay", Toast.LENGTH_SHORT).show()
    }

}



