package com.example.imadassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
            //Declaring the views
            val ageNumber = findViewById<EditText>(R.id.ageNumber)
            val btnGenerate = findViewById<Button>(R.id.btnGenerate)
            val btnCancel = findViewById<Button>(R.id.btnClear)
            val txtResults = findViewById<TextView>(R.id.txtResults)
            btnGenerate.setOnClickListener {
                val age = ageNumber.text.toString().toIntOrNull()
                if (age !=null) {
                    val result = when (age) {
                        in 20..29 -> "Tupac Shakur"
                        in 30..39 -> "Bob Marlery"
                        in 40..49 -> "Lucky Dube"
                        in 50..59 -> "Chris Hani"
                        in 60..69 -> "Diego Maradona"
                        in 70..79 -> "Oliver Tambo"
                        in 80..89 -> "Pele`"
                        in 90..99 -> "Walter Sisulu"
                        in 99..100 -> "Bob Hope"
                        else -> "The age is out of range"
                    }
                    txtResults.text = "Age: $age\n${
                        when (result) {
                            "Tupac Shakur" -> "You are in your 20s, which is around the same age as Tupac Shakur. Tupac Shakur was a famous musician."
                            "Bob Marlery" -> "You are in your 30s, which is around the same age as Bob Marley. Bob Marley was a famous musician."
                            "Lucky Dube" -> "You are in your 40s, which is around the same age as Lucky Dube. Lucky Dube was a famous musician."
                            "Chris Hani" -> "You are in your 50s, which is around the same age as Chris Hani. Chris Hani was a famous historical figure."
                            "Diego Maradona" -> "You are in your 60s, which is around the same age as Diego Maradona. Diego Maradona was a famous footballer."
                            "Oliver Tambo" -> "You are in your 70s, which is around the same aga as Oliver Tambo. Oliver tambo was a famous hisorical figure."
                            "Pele`" -> "You are in your 80s, which is around the same age as Pele`. Pele` was a famous footballer."
                            "Walter Sisulu" -> "You are in your 90s, which is around the same age as Walter Sisulu. Walter Sisule was a famous hisorical figure."
                            "Bob Hope" -> "You are 100, which is the same age as Bob Hope. Bob Hope was a famous comedian."
                            else -> "The age is out of range."
                        }
                    }"
                } else {
                    txtResults.text = "Please enter valid age"
                }
            }
            btnCancel.setOnClickListener {
                ageNumber.text.clear()
                txtResults.text = ""
            }
        }
    }
