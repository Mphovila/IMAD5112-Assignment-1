package com.example.assingment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.assingment1.R.layout.activity_main

 class MainActivity : AppCompatActivity() {
     @SuppressLint("MissingInflatedId")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(activity_main)
         //Declaring the views
         val ageNumber = findViewById<EditText>(R.id.ageNumber)
         val btnGenerate = findViewById<Button>(R.id.btnGenerate)
         val btnCancel = findViewById<Button>(R.id.btnClear)
         val txtResults = findViewById<TextView>(R.id.txtResults)
         btnGenerate.setOnClickListener {
             val age = ageNumber.text.toString().toIntOrNull()
             if (age != null) {
                 val result = when (age) {
                     in 0..12 -> "child"
                     in 13..19 -> "Teenager"
                     in 20..59 -> "Adult"
                     else -> "Senior"
                 }
                 txtResults.text = "Age: $age:\n${
                     when (result) {
                         "Child" -> "You are a Child."
                         "Teenager" -> "You are a Teenager."
                         "Adult" -> "You are an Adult."
                         else -> "You are a Senior."

                     }

                 }"
             } else {
                 txtResults.text = "Please enter a valid age."
             }
         }

         btnCancel.setOnClickListener {
             ageNumber.text.clear()
             txtResults.text = ""
         }
     }
 }20