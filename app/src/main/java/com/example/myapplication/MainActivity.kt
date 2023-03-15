package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    var minutes: TextView? = null
    var entrDate :TextView? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dateButton: Button = findViewById(R.id.buttonPickDate)
        minutes = findViewById(R.id.resultMinute)
        entrDate= findViewById(R.id.enteredDate)

        dateButton.setOnClickListener {
            openCalendar()
        }


    }

    fun openCalendar() {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        val carentYear=2023
        val carentDay = 15
        val carentMonth = 3
        val answer =(((carentYear-year)*12+(carentMonth-month))*30-(day-carentDay))*24*60

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                Toast.makeText(this, "calendar is working", Toast.LENGTH_LONG).show()

            },
            year,
            month,
            day

        ).show()
    }


    }



