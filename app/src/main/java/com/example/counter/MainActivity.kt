package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var countByInput : EditText
    private lateinit var countOutput : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count_button = findViewById<Button>(R.id.count)
        val reset_button = findViewById<Button>(R.id.reset)

        var count = 0
        count_button.setOnClickListener {
            count += countByInput.text.toString().toInt()
            countOutput.text = count.toString()
        }
        reset_button.setOnClickListener {
            count = 0
            countOutput.text = count.toString()
        }


        countByInput = findViewById<EditText>(R.id.CountBy_input)
        countOutput = findViewById<TextView>(R.id.count_output)
    }


}

